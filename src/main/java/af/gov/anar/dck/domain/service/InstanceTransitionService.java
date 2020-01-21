package af.gov.anar.dck.domain.service;


import af.gov.anar.dck.domain.model.InstanceTransition;

import java.util.List;

public interface InstanceTransitionService {

    public InstanceTransition saveOrUpdate(InstanceTransition instanceTransition);
    public List<InstanceTransition> findAll();
    public InstanceTransition findById(Long id);
    public InstanceTransition delete(Long id);
    public boolean deleteByInstance(Long instanceId);
    public List<InstanceTransition> findByUserId(Long userId);
    public List<InstanceTransition> findByInstanceId(Long instanceId);
    public List<InstanceTransition> findByInstanceIdBrief(Long instanceId);

}
