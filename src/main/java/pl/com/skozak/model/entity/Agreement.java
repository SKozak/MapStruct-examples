package pl.com.skozak.model.entity;

import lombok.Data;
import pl.com.skozak.model.AgreementStatus;

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
