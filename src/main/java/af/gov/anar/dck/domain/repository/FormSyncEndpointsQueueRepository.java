package af.gov.anar.dck.domain.repository;

import af.gov.anar.dck.domain.model.Form;
import af.gov.anar.dck.domain.model.FormSyncEndpointsQueue;
import af.gov.anar.dck.domain.model.Instance;
import af.gov.anar.dck.domain.util.enumeration.FormSyncStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormSyncEndpointsQueueRepository extends JpaRepository<FormSyncEndpointsQueue, Long> {
    List<FormSyncEndpointsQueue> findByInstance(Instance instance);
    List<FormSyncEndpointsQueue> findByForm(Form form);
    List<FormSyncEndpointsQueue> findByFormSyncStatus(FormSyncStatus status);
}