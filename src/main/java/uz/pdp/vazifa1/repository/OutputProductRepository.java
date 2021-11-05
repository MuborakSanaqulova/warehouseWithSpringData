package uz.pdp.vazifa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.vazifa1.entity.OutputProduct;
import uz.pdp.vazifa1.projection.OutputProductProjection;

@Repository
@RepositoryRestResource(path = "outputProduct", excerptProjection = OutputProductProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
