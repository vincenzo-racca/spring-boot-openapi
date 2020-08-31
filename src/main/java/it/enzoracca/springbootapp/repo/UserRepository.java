package it.enzoracca.springbootapp.repo;

import it.enzoracca.springbootapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
