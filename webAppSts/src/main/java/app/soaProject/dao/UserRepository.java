package app.soaProject.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.soaProject.entities.utilisateur;



public interface UserRepository extends JpaRepository<utilisateur,Long> {
	@Query(" select u from utilisateur u where u.username = ?1")
	Optional<utilisateur> findUserWithName(String username);

}
