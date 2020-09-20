package it.enzoracca.springbootapp.repos;

import it.enzoracca.springbootapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
