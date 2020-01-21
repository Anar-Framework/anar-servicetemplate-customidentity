package af.gov.anar.dck.domain.repository;


import af.gov.anar.dck.domain.model.Datasource;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DatasourceRepository extends CrudRepository<Datasource, Long>  {
    public List<Datasource> findByEnvSlug(String envSlug);
}
