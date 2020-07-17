package applicatiton.data.repository;

import applicatiton.data.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    @Query(value = "select count(c.id) from dbo_category c")
    long getTotalCategories();
}
