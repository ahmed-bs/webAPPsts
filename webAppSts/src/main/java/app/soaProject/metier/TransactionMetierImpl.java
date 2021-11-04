package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.soaProject.dao.TransactionRepository;
import app.soaProject.entities.transaction;

@Service
public class TransactionMetierImpl implements ITransactionMetier{
	@Autowired
	TransactionRepository transactionRepository;
	
	@Override
	public transaction savetransaction(transaction tr) {
		// TODO Auto-generated method stub
		return  transactionRepository.save(tr);
	}

	@Override
	public Collection<transaction> consulterListtransaction() {
		// TODO Auto-generated method stub
		return transactionRepository.findAll();
	}

	@Override
	public Optional<transaction> findtransactionById(Long idtrans) {
		// TODO Auto-generated method stub
		return transactionRepository.findById(idtrans);
	}

	@Override
	public transaction updatetransaction(Long idtrans, transaction tr) {
		// TODO Auto-generated method stub
		transaction tran = transactionRepository.findById(idtrans).
				orElseThrow(() -> new RuntimeException("transaction introuvable avec id : : " +idtrans));
		tran.setHeure(tr.getHeure());
		tran.setDay(tr.getDay());
		tran.setMontant(tr.getMontant());
		tran.setDescription(tr.getDescription());
		
		
		final transaction updatetransaction =  transactionRepository.save(tran); 
		return updatetransaction; 
	}

	@Override
	public void deletetransaction(Long idtrans) {
		// TODO Auto-generated method stub
		transactionRepository.deleteById(idtrans);
		
	}
	
	
}
