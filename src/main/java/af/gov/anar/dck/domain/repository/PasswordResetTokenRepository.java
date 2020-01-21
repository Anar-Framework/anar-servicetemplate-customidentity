package af.gov.anar.dck.domain.repository;

import af.gov.anar.dck.domain.model.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
   public PasswordResetToken findByToken(String token);
}