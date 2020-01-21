/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.gov.anar.dck.domain.repository;

import af.gov.anar.dck.domain.model.Workflow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author hp 2018
 */
@Repository
public interface WorkflowRepository extends JpaRepository<Workflow, Long>{
    public List<Workflow> findByEnvSlug(String envSlug);

    @Query("SELECT new af.gov.anar.dck.domain.model.Workflow(w.id, w.name, w.description, w.envSlug, w.createdAt) from Workflow w where w.envSlug = ?1 order by w.id")
	public List<Workflow> findAllWithoutJSONContent(String envSlug);
}
