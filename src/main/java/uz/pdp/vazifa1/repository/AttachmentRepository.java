package uz.pdp.vazifa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.vazifa1.entity.Attachment;
import uz.pdp.vazifa1.projection.AttachmentProjection;

@Repository
@RepositoryRestResource(path = "attachment", excerptProjection = AttachmentProjection.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
