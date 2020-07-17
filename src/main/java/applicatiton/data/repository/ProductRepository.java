package applicatiton.data.repository;

import applicatiton.data.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select count (p.id)from dbo_product p")
    long getTotalProducts();

    @Query("select p from dbo_product p " +
            "where (:categoryId is null or (p.categoryId = :categoryId)) " +
            "and (:productName is null or upper(p.name) like concat('%',upper(:productName),'%' ) )")
    Page<Product> getListProductByCategoryOrProductNameContaining(Pageable pageable, @Param("categoryId") int categoryId, @Param("productName") String productName);
}
