package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Input;
import uz.pdp.vazifa1.entity.InputProduct;
import uz.pdp.vazifa1.entity.Product;

import java.time.LocalDate;

@Projection(types = InputProduct.class)
public interface InputProductProjection {

    Integer getId();

    Double getAmount();

    Double getPrice();

    Product getProduct();

    LocalDate getExpireDate();

    Input getInput();

}
