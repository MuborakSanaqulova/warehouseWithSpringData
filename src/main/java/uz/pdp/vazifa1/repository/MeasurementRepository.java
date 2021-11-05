package uz.pdp.vazifa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.vazifa1.entity.Measurement;
import uz.pdp.vazifa1.projection.MeasurementProjection;

@Repository
@RepositoryRestResource(path = "measurement", excerptProjection = MeasurementProjection.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
