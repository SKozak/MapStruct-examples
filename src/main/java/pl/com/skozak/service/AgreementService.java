package pl.com.skozak.service;

import org.springframework.stereotype.Service;
import pl.com.skozak.model.entity.Agreement;
import pl.com.skozak.mapper.AgreementMapper;
import pl.com.skozak.model.dto.AgreementDTO;

import java.math.BigDecimal;

@Service
public class AgreementService {

    private final AgreementMapper agreementMapper;

    public AgreementService(AgreementMapper agreementMapper) {
        this.agreementMapper = agreementMapper;
    }

    public BigDecimal calculatePrice(){
        AgreementDTO agreementDTO = new AgreementDTO();
        Agreement agreement = agreementMapper.mapToAgreement(agreementDTO);
        return null;
    }

    public Agreement findById(Long id){
        return new Agreement();
    }
}
