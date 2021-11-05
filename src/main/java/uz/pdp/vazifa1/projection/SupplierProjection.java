package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierProjection {

    Integer getId();

    String getName();

    String getPhoneNumber();

}
