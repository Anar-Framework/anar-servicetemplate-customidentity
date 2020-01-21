package af.gov.anar.dck.domain.repository;

import af.gov.anar.dck.domain.model.InstanceComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InstanceCommentRepository extends JpaRepository<InstanceComment, Long> {

    @Query("DELETE from InstanceComment ic where ic.instance.id=?1")
	public boolean deleteByInstanceId(Long instanceId);
}
