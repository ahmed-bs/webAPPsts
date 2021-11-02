package app.soaProject.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import app.soaProject.entities.transaction;

public interface TransactionRepository extends JpaRepository<transaction,Long> {
	@Query("select p from transaction p where p.designation like :x")
	public Page <transaction> findtransactionByDesignation(@Param("x")String designation,Pageable p);	


}
