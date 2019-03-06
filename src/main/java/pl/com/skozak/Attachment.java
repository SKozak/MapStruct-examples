package pl.com.skozak;

import lombok.Data;

@Data
public class Attachment {
    private Long id;
    private String name;
    private Byte[] file;
}
