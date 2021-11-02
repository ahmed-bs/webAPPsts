package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;
import org.springframework.data.domain.Page;
import app.soaProject.entities.category;


public interface ICategoryMetier {

	public category savecategory(category cat);
	public Collection<category> consulterListcategory();
	public Optional<category> findcategoryById(Long idcat);
	public category updatecategory(Long idcat,category cat);
	public void deletecategory(Long idcat);
	public Page <category> FindcategoryByDesignation	(String designation, int page, int size);
}
