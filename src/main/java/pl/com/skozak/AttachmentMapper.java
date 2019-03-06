package pl.com.skozak;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface AttachmentMapper {

    @Mapping(source = "fileName", target = "name")
    Attachment mapToAttachment(AttachmentDTO attachmentDTO);

    Set<Attachment> mapToAttachmentSet(List<AttachmentDTO> attachmentDTOS);
}
