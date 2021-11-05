package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Attachment;
import uz.pdp.vazifa1.entity.Category;
import uz.pdp.vazifa1.entity.Measurement;
import uz.pdp.vazifa1.entity.Product;

@Projection(types = {Product.class, Measurement.class, Attachment.class, Category.class})
public interface ProductProjection {

    Integer getId();

    String getName();

    Category getCategory();

    Attachment getAttachment();

    Measurement getMeasurement();

    String getCode();

}
