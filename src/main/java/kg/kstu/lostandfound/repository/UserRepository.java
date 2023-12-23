package kg.kstu.lostandfound.repository;

import kg.kstu.lostandfound.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}