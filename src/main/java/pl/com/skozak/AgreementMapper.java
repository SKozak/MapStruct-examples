package pl.com.skozak;


import org.mapstruct.AfterMapping;
import org.mapstruct.BeanMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Mapper(uses = {AttachmentMapper.class, ProductMapper.class}, componentModel = "spring")
public abstract class AgreementMapper {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    protected AgreementService agreementService;

    @Mapping(target = "name", source = "agreementName")
    @Mapping(source = "productDTO", target = "product", qualifiedBy = ProductWithoutDescription.class)
    @Mapping(target = "type", source = "agreementType")
    @Mapping(target = "attachments", source = "attachmentsDTO")
    @Mapping(ignore = true, target = "anex")
    @BeanMapping(qualifiedBy = {IncludeBeforeMapping.class})
    abstract Agreement mapToAgreement(AgreementDTO agreementDTO);


    @Mapping(ignore = true, target = "anex")
    abstract Agreement mapToAgreementWithoutAnex(AgreementDTO agreementDTO);

    @InheritInverseConfiguration(name = "mapToAgreement")
    abstract AgreementDTO mapToAgreementDTO(Agreement agreement);

    @IncludeAfterMapping
    @AfterMapping
    void afterAgreementToAgreementDtoMapping(@MappingTarget AgreementDTO agreementDTO,  Agreement agreement) {
        if (agreementDTO.getAnexId() != null) {
            agreement.setAnex(agreementService.findById(agreementDTO.getAnexId()));
        }
    }

    @IncludeBeforeMapping
    @BeforeMapping
    void beforeflushAgreement(@MappingTarget AgreementDTO agreementDTO, Agreement agreement) {
        entityManager.flush();
    }
}
