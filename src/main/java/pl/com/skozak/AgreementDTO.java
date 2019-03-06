package pl.com.skozak;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class AgreementDTO {
    private Long id;
    private String agreementName;
    private ProductDTO productDTO;
    private Long anexId;
    private String agreementType;
    private List<AttachmentDTO> attachmentsDTO;
    private LocalDate conclusionDate;
}
