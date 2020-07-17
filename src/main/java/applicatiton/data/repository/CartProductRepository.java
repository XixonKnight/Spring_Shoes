package applicatiton.data.repository;

import applicatiton.data.model.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartProductRepository extends JpaRepository<CartProduct, Integer> {
    @Query(value = "select * from dbo_cart_product cp " +
            "where cp.cart_id = :cartId " +
            "and cp.product_id = :productId " +
            "order by cp.cart_product_id desc limit 1", nativeQuery = true)
    CartProduct findFirstCartProductByCartIdAndProductId(@Param("cartId") int cartId, @Param("productId") int productId);
}
