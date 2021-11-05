package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Category;

@Projection(types = Category.class)
public interface CategoryProjection {

    Integer getId();

    String getName();

    Category getParentCategory();

}
