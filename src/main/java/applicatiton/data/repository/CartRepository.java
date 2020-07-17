package applicatiton.data.repository;

import applicatiton.data.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    @Query(value = "select * from dbo_cart c " +
            "where :guid is null or c.guid = :guid " +
            "order by c.cart_id desc limit 1", nativeQuery = true)
    Cart findFirstCartByGuid(@Param("guid") String guid);

    @Query(value = "select * from dbo_cart c " +
            "where :username is null or c.username = :username " +
            "order by c.cart_id desc limit 1", nativeQuery = true)
    Cart findByUsername(@Param("username") String username);
}
