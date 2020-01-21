package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.Instance;
import af.gov.anar.dck.domain.model.InstanceAttachment;

import java.util.List;

public interface InstanceAttachmentService {
	public InstanceAttachment create(Instance instance, String attachment);
	public InstanceAttachment create(InstanceAttachment instanceAttachment);
    public boolean delete(Long id);
    public InstanceAttachment findById(Long id);
    public List findAllByForm(Long instanceId);
}