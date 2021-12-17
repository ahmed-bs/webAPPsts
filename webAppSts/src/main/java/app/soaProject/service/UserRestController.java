package app.soaProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.soaProject.dao.UserRepository;
import app.soaProject.entities.utilisateur;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class UserRestController {
	@Autowired
    private UserRepository userRepository;
@GetMapping
public ResponseEntity<utilisateur> getUtilisateur(){
	utilisateur user = (utilisateur) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	return new ResponseEntity<utilisateur>(user, HttpStatus.OK);
}

@GetMapping("users")
public List < utilisateur > getUsers() {
    return this.userRepository.findAll();
}
}