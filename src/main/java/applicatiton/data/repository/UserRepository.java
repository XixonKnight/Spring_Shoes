package applicatiton.data.repository;

import applicatiton.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Transactional(readOnly = true)
    @Query("select u from dbo_user u where u.email = :email")
    Iterable<User> findUserByEmail(@Param("email") String email);

    @Transactional(readOnly = true)
    @Query("select u from dbo_user u where u.username= :username")
    Iterable<User> findUserByUsername(@Param("username") String username);
}
