package app.soaProject.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import app.soaProject.metier.ICategoryMetier;
import app.soaProject.entities.category;


@RestController
public class CategoryRestService {
	 @Autowired
	  private ICategoryMetier categoryMetier;
	 
		@RequestMapping(value="/categories",method = RequestMethod.POST)
		public category saveProduit(@RequestBody category p)
		    {
		       return categoryMetier.savecategory(p);
			 }
	
		
		@RequestMapping(value="/categories",method = RequestMethod.GET)
		public Collection <category> getcategory()
		{
		return categoryMetier.consulterListcategory();
		}
		
		
		@RequestMapping(value="/categories/{id}",method = RequestMethod.GET)
	    public Optional <category> findcategoryById(@PathVariable Long id) {
			return categoryMetier.findcategoryById(id);
		}	
		
		
		@RequestMapping(value="/categories/{id}",method = RequestMethod.DELETE)
		@ResponseBody
	    public void delete(@PathVariable Long id)
	     {
			categoryMetier.deletecategory(id);
	     }
		
		
		
		@RequestMapping(value="/categories/{id}",method = RequestMethod.PUT)
		public ResponseEntity<category> updatecategory(@PathVariable Long id,
				 @RequestBody category categories) 
		{

		return
		      ResponseEntity.ok(categoryMetier.updatecategory(id, categories));
		}
		
		
		
		
		
		
		
		
		
		
}
