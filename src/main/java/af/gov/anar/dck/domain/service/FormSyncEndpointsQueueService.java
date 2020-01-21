package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.Form;
import af.gov.anar.dck.domain.model.FormSyncEndpointsQueue;
import af.gov.anar.dck.domain.model.Instance;
import af.gov.anar.dck.domain.util.enumeration.FormSyncStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface FormSyncEndpointsQueueService {


    public List<FormSyncEndpointsQueue> findAll();

    public FormSyncEndpointsQueue store(FormSyncEndpointsQueue formSyncEndpointsQueue);

    public List<FormSyncEndpointsQueue> findByInstance(Instance instance);

    public List<FormSyncEndpointsQueue> findByForm(Form form);

    public FormSyncEndpointsQueue findById(long id);

    public List<FormSyncEndpointsQueue> findByFormSyncStatus(FormSyncStatus status);
    
    public void deleteById(long id);


    public void syncInstanceWithEndpoints(Instance instance);

}