package app.soaProject.metier;

import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.soaProject.dao.AppRoleRepository;
import app.soaProject.dao.UserRepository;
import app.soaProject.entities.AppRole;
import app.soaProject.entities.utilisateur;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserMetierImpl implements IUserMetier {
	@Autowired
	UserRepository utilisateurRepository;
    AppRoleRepository  roleRepo;
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

	@Override
	public AppRole saveRole(AppRole role) {
		// TODO Auto-generated method stub
		return roleRepo.save(role);
	}

	@Override
	public utilisateur getUtilisateur(String username) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findByUsername(username);
	}

	@Override
	public void addRoleToUtilisateur(String username, String roleName) {
		// TODO Auto-generated method stub
		utilisateur user = utilisateurRepository.findByUsername(username);
		AppRole role = roleRepo.findByRoleName(roleName);
		user.getRole().add(role);
		
	}
	
	
	
	
	
}
