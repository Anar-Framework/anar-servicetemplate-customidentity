package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.dto.Notification;
import org.springframework.stereotype.Service;

@Service
public interface NotificationService {

   public  void emitNotification(Notification notification);

   public void notify(Notification notification, String username);
}