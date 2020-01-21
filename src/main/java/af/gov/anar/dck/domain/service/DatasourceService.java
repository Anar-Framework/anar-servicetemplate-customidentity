package af.gov.anar.dck.domain.service;

import af.gov.anar.dck.domain.model.Datasource;

import java.util.List;

public interface DatasourceService {
	public Datasource create(Datasource datasource);
    public Datasource delete(Long id);
    public List findAll();
    public List findAllByEnv(String envSlug);
    public Datasource findById(Long id);
    public boolean update(Long id, Datasource datasource);
}
