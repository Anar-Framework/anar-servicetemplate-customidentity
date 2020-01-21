package af.gov.anar.dck.useradministration.repository;

import af.gov.anar.dck.common.model.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
   public PasswordResetToken findByToken(String token);
}