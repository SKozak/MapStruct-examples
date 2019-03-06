package pl.com.skozak;

import org.springframework.stereotype.Service;

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
