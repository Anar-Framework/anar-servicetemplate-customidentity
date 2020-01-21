package af.gov.anar.dck.useradministration.repository;

import af.gov.anar.dck.common.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{
    public List<Group> findByEnvSlug(String envSlug);
}
