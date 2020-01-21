
package af.gov.anar.dck.domain.workflow.service;


import af.gov.anar.dck.domain.workflow.model.Workflow;
import af.gov.anar.dck.domain.workflow.repository.WorkflowRepository;
import af.gov.anar.dck.infrastructure.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class WorkflowServiceImpl implements WorkflowService {
    
    @Autowired
    private WorkflowRepository workflowRepository;
    @Autowired
    private UserService userService;

    
    @Override
    @Retryable(
            value = {Exception.class},
            maxAttempts = 3,
            backoff = @Backoff(delay = 1000))
    public Workflow createOrUpdate(Workflow workflow) {
        return workflowRepository.save(workflow);
    }

    

    @Override
    @Retryable(
            value = {Exception.class},
            maxAttempts = 3,
            backoff = @Backoff(delay = 1000))
    public Workflow update(Workflow workflow, Long id) {
        workflow.setId(id);
        return workflowRepository.save(workflow);
    }

    
    @Override
    @Retryable(value = {Exception.class}, maxAttempts = 3, backoff = @Backoff(delay = 1000))
    public List<Workflow> findAll() {
        return workflowRepository.findAll();
    }

    
    @Override
    @Retryable(value = {Exception.class}, maxAttempts = 3, backoff = @Backoff(delay = 1000))
    public List<Workflow> findAllByEnv(String envSlug) {
        return workflowRepository.findByEnvSlug(envSlug);
    }

    
    @Override
    @Retryable(value = {Exception.class}, maxAttempts = 3, backoff = @Backoff(delay = 1000))
    public List<Workflow> findAllWithoutJSONContent() {
        return workflowRepository.findAll();
    }

    
    @Override
    @Retryable(
            value = {Exception.class},
            maxAttempts = 3,
            backoff = @Backoff(delay = 1000))
    public Workflow findById(Long id) {
        return workflowRepository.getOne(id);
    }

    
    @Override
    @Retryable(
            value = {Exception.class},
            maxAttempts = 3,
            backoff = @Backoff(delay = 1000))
    public Workflow delete(Long id) {
        Workflow workflow = workflowRepository.getOne(id);
        if (workflow != null) {
            workflowRepository.delete(workflow);
        }
        return workflow;
    }

    
    @Override
    @Retryable(
            value = {Exception.class},
            maxAttempts = 3,
            backoff = @Backoff(delay = 1000))
    public void delete(Workflow workflow) {
        if (workflow != null) {
            workflowRepository.delete(workflow);
        }
    }

}
