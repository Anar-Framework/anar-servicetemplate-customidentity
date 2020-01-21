package af.gov.anar.dck.domain.repository;

import af.gov.anar.dck.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);
	public List<Role> findByEnvSlug(String envSlug);
}
