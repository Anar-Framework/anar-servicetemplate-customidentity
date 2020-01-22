package af.gov.anar.dck.instance.service;

import af.gov.anar.dck.instance.model.Instance;
import af.gov.anar.dck.instance.model.InstanceAttachment;
import af.gov.anar.dck.instance.model.InstanceComment;
import af.gov.anar.dck.instance.model.InstanceHistory;
import af.gov.anar.dck.instance.repository.InstanceCommentRepository;
import af.gov.anar.dck.useradministration.service.UserService;


import af.gov.anar.dck.common.model.dto.Notification;
import af.gov.anar.dck.infrastructure.util.enumeration.InstanceHistoryStatus;

import java.util.List;


public interface InstanceHistoryService {
    public InstanceHistory create(InstanceHistory instanceHistory);
    public List findAllByInstance(Long instanceId);
    public List findByInstanceHistoryStatusAndUserId(InstanceHistoryStatus instanceHistoryStatus, Long userId);
    public List<Notification> findByInstanceHistoryStatus(InstanceHistoryStatus instanceHistoryStatus);
    public InstanceHistory findById(long instanceHistoryId);
    public boolean deleteByInstance(Long instanceId);
}
