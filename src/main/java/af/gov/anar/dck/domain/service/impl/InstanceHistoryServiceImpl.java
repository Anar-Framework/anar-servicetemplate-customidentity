package af.gov.anar.dck.domain.service.impl;

import af.gov.anar.dck.domain.model.InstanceHistory;
import af.gov.anar.dck.domain.model.dto.Notification;
import af.gov.anar.dck.domain.repository.InstanceHistoryRepository;
import af.gov.anar.dck.domain.service.InstanceHistoryService;
import af.gov.anar.dck.domain.service.InstanceService;
import af.gov.anar.dck.domain.service.UserService;
import af.gov.anar.dck.domain.util.enumeration.InstanceHistoryStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class InstanceHistoryServiceImpl implements InstanceHistoryService {
    @Autowired
    private InstanceHistoryRepository instanceHistoryRepository;
    @Autowired
    private UserService UserService;
    @Autowired
    private InstanceService instanceService;

    @Override
    public List findAllByInstance(Long instanceId) {
        Collection<InstanceHistory> histories = instanceHistoryRepository.findByInstanceId(instanceId);
        return new ArrayList<>(histories);
    }

    @Override
    public InstanceHistory create(InstanceHistory instanceHistory) {
        return instanceHistoryRepository.save(instanceHistory);
    }

    @Override
    public List findByInstanceHistoryStatusAndUserId(InstanceHistoryStatus instanceHistoryStatus, Long userId) {
        return instanceHistoryRepository.findByInstanceHistoryStatusAndUserId(instanceHistoryStatus, UserService.getLoggedInUser().getId());
    }

    @Override
    public List<Notification> findByInstanceHistoryStatus(InstanceHistoryStatus instanceHistoryStatus) {
        List<InstanceHistory> histories = instanceHistoryRepository.findByInstanceHistoryStatus(instanceHistoryStatus);
        List<Notification> notifications = new ArrayList<>();
        for(InstanceHistory history: histories)
        {
            notifications.add(new Notification(history.getId(), history.getInstanceId(), instanceService.findById(history.getInstanceId()).getTitle(), history.getNewValue(), InstanceHistoryStatus.UNVIEWED));
        }
        return notifications;
    }

    @Override
    public InstanceHistory findById(long instanceHistoryId) {
        return instanceHistoryRepository.getOne(instanceHistoryId);
    }

    @Override
    public boolean deleteByInstance(Long instanceId) {
        instanceHistoryRepository.deleteByInstanceId(instanceId);
        return true;
    }

}
