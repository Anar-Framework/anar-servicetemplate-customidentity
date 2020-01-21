package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.EventLog;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public interface EventLogService {

    public List<EventLog> findAll();

    public EventLog store(EventLog eventLog);

    public List<EventLog> findByUser(Long userId);

    public List<EventLog> findByLoggerLevel(String level);

    public void log(Long userId, String envSlug, String logger, String loggerLevel, String exception, String detailsMessage);

	public EventLog findById(long id);
}