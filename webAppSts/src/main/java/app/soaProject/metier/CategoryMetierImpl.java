package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.soaProject.dao.CategoryRepository;
import app.soaProject.entities.category;

@Service
public class CategoryMetierImpl implements ICategoryMetier {
	@Autowired
	CategoryRepository categoryRepository;
	
	
	@Override
	public category savecategory(category cat) {
		// TODO Auto-generated method stub
		return  categoryRepository.save(cat);
	}

	@Override
	public Collection<category> consulterListcategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Optional<category> findcategoryById(Long idcat) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(idcat);
	}

	@Override
	public category updatecategory(Long idcat, category cat) {
		// TODO Auto-generated method stub
		category categ = categoryRepository.findById(idcat).
				orElseThrow(() -> new RuntimeException("utilisateur introuvable avec id : : " +idcat));
		categ.setNomCat(cat.getNomCat());
	
		
		final category updatecategory =  categoryRepository.save(categ); 
		return updatecategory;
	}

	@Override
	public void deletecategory(Long idcat) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(idcat);
	}

	
	

	
	
	
	
	
	
	
}
