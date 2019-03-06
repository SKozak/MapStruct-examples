package pl.com.skozak;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;


@Mapper(componentModel = "spring")
public interface AgreementStatusMapper {

    @ValueMapping(source = "FRESH", target = "NEW")
    @ValueMapping(source = "PENDING", target = "WAITING")
    @ValueMapping(source = "REFUSED", target = "CANCELED")
    @ValueMapping(source = MappingConstants.ANY_UNMAPPED, target = "OTHER")
    AgreementStatus mapToAgreementStatus(ExternalAgreementStatus externalAgreementStatus);

    //    @InheritInverseConfiguration
    @ValueMapping(source = "NEW", target = "FRESH")
    @ValueMapping(source = "WAITING", target = "PENDING")
    @ValueMapping(source = "CANCELED", target = "REFUSED")
    @ValueMapping(target = "OTHER", source = "ACCEPTED")
    @ValueMapping(target = "OTHER", source = "DELETED")
    @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "REFUSED")
    ExternalAgreementStatus mapToExternalAgreementStatus(AgreementStatus AgreementStatus);
}
