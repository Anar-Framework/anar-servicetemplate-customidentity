package af.gov.anar.dck.common.repository;

import af.gov.anar.dck.common.model.Sms;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SmsRepository extends JpaRepository<Sms, Long> {
	public List<Sms> findByEnvSlug(String envSlug);
}
