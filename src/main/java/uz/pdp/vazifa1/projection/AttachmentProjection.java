package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentProjection {

    Integer getId();

    String getOriginalName();

    long getSize();

    String getContentType();

}
