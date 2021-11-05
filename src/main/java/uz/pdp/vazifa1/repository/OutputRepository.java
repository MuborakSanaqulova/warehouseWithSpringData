package uz.pdp.vazifa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.vazifa1.entity.Output;
import uz.pdp.vazifa1.projection.AttachmentProjection;
import uz.pdp.vazifa1.projection.OutputProjection;

@Repository
@RepositoryRestResource(path = "output", excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
