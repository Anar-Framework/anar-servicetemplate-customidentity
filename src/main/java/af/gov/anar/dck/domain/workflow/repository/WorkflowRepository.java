
package af.gov.anar.dck.domain.workflow.repository;


import af.gov.anar.dck.domain.workflow.domain.Workflow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WorkflowRepository extends JpaRepository<Workflow, Long>{
    public List<Workflow> findByEnvSlug(String envSlug);

    @Query("SELECT new com.nsia.model.Workflow(w.id, w.name, w.description, w.envSlug, w.createdAt) from Workflow w where w.envSlug = ?1 order by w.id")
	public List<Workflow> findAllWithoutJSONContent(String envSlug);
}
