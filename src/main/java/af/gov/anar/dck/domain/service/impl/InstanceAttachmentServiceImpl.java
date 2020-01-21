package af.gov.anar.dck.domain.service.impl;

import af.gov.anar.dck.domain.model.Instance;
import af.gov.anar.dck.domain.model.InstanceAttachment;
import af.gov.anar.dck.domain.repository.InstanceAttachmentRepository;
import af.gov.anar.dck.domain.service.InstanceAttachmentService;
import af.gov.anar.dck.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.Optional;

@Service
public class InstanceAttachmentServiceImpl implements InstanceAttachmentService {

    @Autowired
    private InstanceAttachmentRepository instanceAttachmentRepository;

    @Autowired
    private UserService userService;

    @Override
    public InstanceAttachment create(Instance instance, String attachment) {
        InstanceAttachment instanceAttachment = new InstanceAttachment();
        instanceAttachment.setAttachment(attachment);
        instanceAttachment.setUser(userService.getLoggedInUser());
        instanceAttachment.setEnvSlug(userService.getCurrentEnv());
        instanceAttachment.setInstance(instance);

        InstanceAttachment newAttachment = create(instanceAttachment);
        return newAttachment;
    }

    @Override
    public InstanceAttachment create(InstanceAttachment instanceAttachment) {
        return instanceAttachmentRepository.save(instanceAttachment);
    }

    @Override
    public boolean delete(Long id) {
        Optional<InstanceAttachment>  optObj = instanceAttachmentRepository.findById(id);
        String at = optObj.get().getAttachment();
        File file = new File(at);
        if(file.delete()) {
            instanceAttachmentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public InstanceAttachment findById(Long id) {
        Optional<InstanceAttachment>  optObj = instanceAttachmentRepository.findById(id);
        return optObj.get();
    }

    @Override
    public List findAllByForm(Long instanceId) {
        return null;
    }

}