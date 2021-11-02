package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.soaProject.dao.UserRepository;
import app.soaProject.entities.utilisateur;

@Service
public class UserMetierImpl implements IUserMetier {
	@Autowired
	UserRepository utilisateurRepository;

	@Override
	public utilisateur saveUtilisateur(utilisateur ut) {
		// TODO Auto-generated method stub
		return  utilisateurRepository.save(ut);
	}

	@Override
	public Collection<utilisateur> consulterListUtilisateur() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public Optional<utilisateur> findUtilisateurById(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(id);
	}

	@Override
	public utilisateur updateUtilisateur(Long id, utilisateur ut) {
		// TODO Auto-generated method stub
		utilisateur user = utilisateurRepository.findById(id).
				orElseThrow(() -> new RuntimeException("utilisateur introuvable avec id : : " +id));
		user.setNom(ut.getNom());
		user.setPrenom(ut.getPrenom());
		user.setAdresse(ut.getAdresse());
		user.setTelephone(ut.getTelephone());
		user.setEmail(ut.getEmail());
		
		final utilisateur updateUtilisateur =  utilisateurRepository.save(user); 
		return updateUtilisateur;
	}

	@Override
	public void deleteUtilisateur(Long id) {
		// TODO Auto-generated method stub
		utilisateurRepository.deleteById(id);
	}
	
}
