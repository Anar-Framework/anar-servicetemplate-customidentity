package af.gov.anar.dck.common.service;

import af.gov.anar.dck.common.model.Instance;
import af.gov.anar.dck.common.model.InstanceHistory;
import af.gov.anar.dck.common.model.InstanceWatcher;
import af.gov.anar.dck.common.model.User;

import java.util.List;

public interface InstanceWatcherService {
	public InstanceWatcher create(Instance instance, Long watcherId);
	public InstanceWatcher create(Instance instance, User watcher);
    public InstanceWatcher create(InstanceWatcher instanceWatcher);
    public void delete(Long id);
    public InstanceWatcher findById(Long id);
    public List<InstanceWatcher> findAllByInstance(Long instanceId);
    public List<InstanceWatcher> findAllByWatcher(Long watcherId);
    public void sendEmail(Long instanceId, List<InstanceHistory> histories);
}