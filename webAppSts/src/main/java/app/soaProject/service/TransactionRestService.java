package app.soaProject.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.soaProject.dao.TransactionRepository;
import app.soaProject.entities.transaction;
import app.soaProject.metier.ITransactionMetier;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class TransactionRestService {
	  @Autowired
	  private ITransactionMetier transactionMetier; 
		 @Autowired
		 private TransactionRepository transactionRepository;
		    @GetMapping("transaction")
		    public List<transaction> getTransaction() {
		        return this.transactionRepository.findAll();
		    }
		 
		@RequestMapping(value="/transactions",method = RequestMethod.POST)
		public transaction saveProduit(@RequestBody transaction p)
		    {
		       return transactionMetier.savetransaction(p);
			 }
		
		
		@RequestMapping(value="/transactions",method = RequestMethod.GET)
		public Collection <transaction> gettransaction()
		{
		return transactionMetier.consulterListtransaction();
		}
		
		
		
		
		@RequestMapping(value="/transactions/{id}",method = RequestMethod.GET)
	    public Optional <transaction> findtransactionById(@PathVariable Long id) {
			return transactionMetier.findtransactionById(id);
		}	
		
		
		@RequestMapping(value="/transactions/{id}",method = RequestMethod.DELETE)
		@ResponseBody
	    public void delete(@PathVariable Long id)
	     {
			transactionMetier.deletetransaction(id);
	     }
		
		
		
		
		
		
		@RequestMapping(value="/transactions/{id}",method = RequestMethod.PUT)
		public ResponseEntity<transaction> updatetransaction(@PathVariable Long id,
				 @RequestBody transaction transactions) 
		{

		return
		      ResponseEntity.ok(transactionMetier.updatetransaction(id, transactions));
		}
		
		
		
		
		
		
	  
}
