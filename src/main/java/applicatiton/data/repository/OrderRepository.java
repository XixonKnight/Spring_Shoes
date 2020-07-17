package applicatiton.data.repository;

import applicatiton.data.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query("select o from dbo_order o " +
            "where (:guid is null or o.guid = :guid) " +
            "and (:username is null or (o.username = :username))")
    List<Order> findOrderByGuidOrUsername(@Param("guid") String guid, @Param("username") String username);
}
