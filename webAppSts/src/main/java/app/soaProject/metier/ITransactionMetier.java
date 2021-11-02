package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;
import org.springframework.data.domain.Page;
import app.soaProject.entities.transaction;

public interface ITransactionMetier {
	public transaction savetransaction(transaction tr);
	public Collection<transaction> consulterListtransaction();
	public Optional<transaction> findtransactionById(Long id);
	public transaction updatetransaction(Long id,transaction tr);
	public void deletetransaction(Long idtrans);
	public Page <transaction> FindtransactionByDesignation	(String designation, int page, int size);
}
