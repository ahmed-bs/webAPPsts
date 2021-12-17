package app.soaProject.service;

import java.net.URI;
import java.util.Collection;
import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import app.soaProject.entities.AppRole;
import app.soaProject.entities.utilisateur;
import app.soaProject.metier.IUserMetier;

@RestController
public class UserRestService {
	  @Autowired
	  private IUserMetier userMetier; 

	  
		@RequestMapping(value="/utilisateurs",method = RequestMethod.POST)
		public utilisateur saveProduit(@RequestBody utilisateur p)
		    {
		       return userMetier.saveUtilisateur(p);
			 }
		
		@RequestMapping(value="/utilisateurs",method = RequestMethod.GET)
		public Collection <utilisateur> getutilisateurs()
		{
		return userMetier.consulterListUtilisateur();
		}
		
			
		@RequestMapping(value="/utilisateurs/{id}",method = RequestMethod.GET)
	    public Optional <utilisateur> findUtilisateurById(@PathVariable Long id) {
			return userMetier.findUtilisateurById(id);
		}	
		
		
		
		@RequestMapping(value="/utilisateurs/{id}",method = RequestMethod.DELETE)
		@ResponseBody
	    public void delete(@PathVariable Long id)
	     {
			userMetier.deleteUtilisateur(id);
	     }
		
		
		
		
		
		@RequestMapping(value="/utilisateurs/{id}",method = RequestMethod.PUT)
		public ResponseEntity<utilisateur> updateUtilisateur(@PathVariable Long id,
				 @RequestBody utilisateur utilisateurs) 
		{

		return
		      ResponseEntity.ok(userMetier.updateUtilisateur(id, utilisateurs));
		}
		
		
		@PostMapping("/role/save")
		public ResponseEntity<AppRole> saveRole(@RequestBody AppRole role)
		{
			URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("role/save").toUriString()); 
			return ResponseEntity.created(uri).body(userMetier.saveRole(role));
			
		}		
}
