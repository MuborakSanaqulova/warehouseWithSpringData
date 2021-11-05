package uz.pdp.vazifa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.vazifa1.entity.InputProduct;
import uz.pdp.vazifa1.projection.InputProductProjection;

@Repository
@RepositoryRestResource(path = "inputProduct", excerptProjection = InputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {
}
