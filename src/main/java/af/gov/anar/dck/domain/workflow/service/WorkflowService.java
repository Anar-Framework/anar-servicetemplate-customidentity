
package af.gov.anar.dck.domain.workflow.service;


import af.gov.anar.dck.domain.workflow.model.Workflow;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface WorkflowService {

    public Workflow createOrUpdate(Workflow workflow);
    public Workflow update(Workflow workflow, Long id);
    public List<Workflow> findAll();
    public List<Workflow> findAllByEnv(String envSlug);
    public List<Workflow> findAllWithoutJSONContent();
    public Workflow findById(Long id);
    public Workflow delete(Long id);
    public void delete(Workflow workflow);
}
