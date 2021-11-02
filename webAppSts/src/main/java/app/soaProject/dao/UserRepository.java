package app.soaProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import app.soaProject.entities.utilisateur;



public interface UserRepository extends JpaRepository<utilisateur,Long> {

}
