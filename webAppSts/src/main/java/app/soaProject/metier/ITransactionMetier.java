package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;
import app.soaProject.entities.transaction;

public interface ITransactionMetier {
	public transaction savetransaction(transaction tr);
	public Collection<transaction> consulterListtransaction();
	public Optional<transaction> findtransactionById(Long id);
	public transaction updatetransaction(Long id,transaction tr);
	public void deletetransaction(Long idtrans);
}
