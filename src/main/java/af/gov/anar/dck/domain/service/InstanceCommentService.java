package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.Instance;
import af.gov.anar.dck.domain.model.InstanceComment;

import java.util.List;

public interface InstanceCommentService {
	public InstanceComment create(Instance instance, String comment);
	public InstanceComment create(InstanceComment InstanceComment);
    public InstanceComment delete(Long id);
    public boolean deleteByInstance(Long instanceId);
    public InstanceComment findById(Long id);
    public List findAllByForm(Long instanceId);
}