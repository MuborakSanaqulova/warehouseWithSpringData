package uz.pdp.vazifa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.vazifa1.entity.Supplier;
import uz.pdp.vazifa1.projection.SupplierProjection;

@Repository
@RepositoryRestResource(path = "supplier", excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
