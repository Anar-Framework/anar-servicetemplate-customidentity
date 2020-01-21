package af.gov.anar.dck.instance.service;

import af.gov.anar.dck.common.model.InstanceTransition;
import af.gov.anar.dck.instance.repository.InstanceTransitionRepository;
import af.gov.anar.dck.common.service.InstanceTransitionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class InstanceTransitionServiceImpl implements InstanceTransitionService {


    @Autowired
    private InstanceTransitionRepository instanceTransitionRepository;

    @Override
    public InstanceTransition saveOrUpdate(InstanceTransition instanceTransition) {
        return instanceTransitionRepository.save(instanceTransition);
    }

    @Override
    public List<InstanceTransition> findAll() {
        return instanceTransitionRepository.findAll();
    }

    @Override
    public InstanceTransition findById(Long id) {
        return instanceTransitionRepository.getOne(id);
    }

    @Override
    public InstanceTransition delete(Long id) {
        InstanceTransition instanceTransition = findById(id);
        instanceTransitionRepository.deleteById(id);
        return instanceTransition;
    }

    @Override
    public boolean deleteByInstance(Long instanceId) {
        instanceTransitionRepository.deleteByInstanceId(instanceId);
        return true;
    }

    @Override
    public List<InstanceTransition> findByUserId(Long userId) {
        return instanceTransitionRepository.findByUserId(userId);
    }

    @Override
    public List<InstanceTransition> findByInstanceId(Long instanceId) {
        return instanceTransitionRepository.findByInstanceId(instanceId);
    }

    @Override
    public List<InstanceTransition> findByInstanceIdBrief(Long instanceId) {
        return instanceTransitionRepository.findByInstanceIdBrief(instanceId);
    }
}
