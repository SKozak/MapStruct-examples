package pl.com.skozak;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class Agreement {
    private Long id;
    private String name;
    private Product product;
    private AgreementStatus type;
    private Agreement anex;
    private Set<Attachment> attachments;
    private LocalDate conclusionDate;
}
