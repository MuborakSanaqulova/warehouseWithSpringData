package uz.pdp.vazifa1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa1.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementProjection {

    Integer getId();

    String getName();

}
