package af.gov.anar.dck.domain.repository;

import af.gov.anar.dck.domain.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{
    public List<Group> findByEnvSlug(String envSlug);
}
