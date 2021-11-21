package app.soaProject.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.soaProject.entities.utilisateur;

@RestController
@RequestMapping("/user")
public class UserRestController {
@GetMapping
public ResponseEntity<utilisateur> getUtilisateur(){
	utilisateur user = (utilisateur) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	return new ResponseEntity<utilisateur>(user, HttpStatus.OK);
}
}
