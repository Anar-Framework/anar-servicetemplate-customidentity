/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.gov.anar.dck.common.service;

import af.gov.anar.dck.common.model.Workflow;
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
