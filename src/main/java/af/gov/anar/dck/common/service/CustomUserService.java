package af.gov.anar.dck.common.service;

import af.gov.anar.dck.common.model.CustomUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomUserService extends UserDetailsService {
	 
//	 User findByEmail(String email);
	 
	public CustomUser loadUserByUsername(String username);
	public CustomUser loadUserByUsername(String username, String currentEnv, String currentLang);

	public String getCurrentEnv();
}
