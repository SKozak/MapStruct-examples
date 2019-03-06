package pl.com.skozak.model.dto;

import lombok.Data;

@Data
public class AttachmentDTO {
    private Long id;
    private String fileName;
    private Byte[] file;
}
