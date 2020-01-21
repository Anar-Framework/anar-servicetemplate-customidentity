package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface EnvironmentService {

    public Environment create(Environment environment);
    public Environment delete(Long id);
    public List findAll();
    public Environment findById(Long id);
    public Environment findBySlug(String slug);
    public Environment findBySecretKey(String secretKey);
    public boolean update(Long id, Environment environment);
}