package uz.pdp.vazifa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pdp.vazifa1.entity.Category;
import uz.pdp.vazifa1.projection.CategoryProjection;

@Repository
@RepositoryRestResource(path = "category", excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
