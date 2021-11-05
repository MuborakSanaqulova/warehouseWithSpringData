package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Client;
import uz.pdp.vazifa1.entity.Currency;
import uz.pdp.vazifa1.entity.Output;
import uz.pdp.vazifa1.entity.Warehouse;

import java.time.LocalDateTime;

@Projection(types = Output.class)
public interface OutputProjection {

    Integer getId();

    LocalDateTime getDate();

    Warehouse getWarehouse();

    String getCode();

    String getFactureNumber();

    Client getClient();

    Currency getCurrency();

}
