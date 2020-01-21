package af.gov.anar.dck.domain.repository;

import af.gov.anar.dck.domain.model.Environment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentRepository extends JpaRepository<Environment, Long> {

    public Environment findBySlug(String slug);
    public Environment findBySecretKey(String secretKey);
}