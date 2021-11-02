package app.soaProject.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import app.soaProject.entities.category;

public interface CategoryRepository extends JpaRepository<category,Long> {

	@Query("select p from category p where p.designation like :x")
	public Page <category> findcategorynByDesignation(@Param("x")String designation,Pageable p);	


}
