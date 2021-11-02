package app.soaProject.service;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
		
		
		
		@RequestMapping(value="/UsersBydesignation",method = RequestMethod.GET) 
		public Page<utilisateur> FindutilisateurByDesignation(@RequestParam String designation, 
						                                      @RequestParam int page, 
						                                      @RequestParam int size) {
					return userMetier.FindutilisateurByDesignation(designation,page,size);
			
		}
		
		
		
		@RequestMapping(value="/utilisateurs/{id}",method = RequestMethod.PUT)
		public ResponseEntity<utilisateur> updateUtilisateur(@PathVariable Long id,
				 @RequestBody utilisateur utilisateurs) 
		{

		return
		      ResponseEntity.ok(userMetier.updateUtilisateur(id, utilisateurs));
		}
		
		
		
		
}
