package pl.com.skozak.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.com.skozak.model.entity.Attachment;
import pl.com.skozak.model.dto.AttachmentDTO;

import java.util.List;
import java.util.Set;

@Mapper(componentModel = "spring")
public interface AttachmentMapper {

    @Mapping(source = "fileName", target = "name")
    Attachment mapToAttachment(AttachmentDTO attachmentDTO);

    Set<Attachment> mapToAttachmentSet(List<AttachmentDTO> attachmentDTOS);
}
