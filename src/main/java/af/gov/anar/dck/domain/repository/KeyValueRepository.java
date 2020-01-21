package af.gov.anar.dck.domain.repository;

import af.gov.anar.dck.domain.model.KeyValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeyValueRepository extends JpaRepository<KeyValue, Long> {
	public List<KeyValue> findByKey(String key);
	public List<KeyValue> findByValue(String value);
}
