package pl.com.skozak;

import lombok.Data;

@Data
public class AttachmentDTO {
    private Long id;
    private String fileName;
    private Byte[] file;
}
