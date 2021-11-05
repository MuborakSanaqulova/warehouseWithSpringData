package uz.pdp.vazifa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.vazifa1.entity.Warehouse;
import uz.pdp.vazifa1.projection.WarehouseProjection;

@Repository
@RepositoryRestResource(path = "warehouse", excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}
