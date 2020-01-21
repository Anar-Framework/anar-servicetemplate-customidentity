package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.Permission;
import af.gov.anar.dck.domain.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface PermissionService  {	   
	public List findAll();
	public List<Permission> findAllByUserAndEnv(User user, String envSlug);
}
