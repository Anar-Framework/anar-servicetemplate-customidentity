package af.gov.anar.dck.domain.repository;

import af.gov.anar.dck.domain.model.EventLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventLogRepository extends JpaRepository<EventLog, Long> {

    List<EventLog> findByLoggerLevel(String level);
    // List<EventLog> findByUserId(long userId);
}