package af.gov.anar.dck.common.repository;

import af.gov.anar.dck.common.model.SystemRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SystemRegistryRepository extends JpaRepository<SystemRegistry, Long>  {
	public List<SystemRegistry> findByEnvSlug(String envSlug);
}
 