package app.soaProject.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import app.soaProject.entities.utilisateur;



public interface UserRepository extends JpaRepository<utilisateur,Long> {
	@Query("select p from utilisateur p where p.designation like :x")
	public Page <utilisateur> findutilisateurByDesignation(@Param("x")String designation,Pageable p);	


}
