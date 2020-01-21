package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.InstanceHistory;
import af.gov.anar.dck.domain.model.dto.Notification;
import af.gov.anar.dck.domain.util.enumeration.InstanceHistoryStatus;

import java.util.List;


public interface InstanceHistoryService {
    public InstanceHistory create(InstanceHistory instanceHistory);
    public List findAllByInstance(Long instanceId);
    public List findByInstanceHistoryStatusAndUserId(InstanceHistoryStatus instanceHistoryStatus, Long userId);
    public List<Notification> findByInstanceHistoryStatus(InstanceHistoryStatus instanceHistoryStatus);
    public InstanceHistory findById(long instanceHistoryId);
    public boolean deleteByInstance(Long instanceId);
}
