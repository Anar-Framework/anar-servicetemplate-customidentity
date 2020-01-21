package af.gov.anar.dck.infrastructure.revision;

import af.gov.anar.dck.common.service.UserService;
import org.hibernate.envers.RevisionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuditRevisionListener implements RevisionListener {

    @Autowired
    private UserService userService;


    @Override
    public void newRevision(Object revisionEntity) {
        AuditRevisionEntity auditRevisionEntity = (AuditRevisionEntity) revisionEntity;
        auditRevisionEntity.setUsername(userService.getLoggedInUser().getUsername());
    }

}