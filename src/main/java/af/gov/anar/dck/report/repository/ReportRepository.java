/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.gov.anar.dck.report.repository;

import af.gov.anar.dck.common.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author hp 2018
 */
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

    public List<Report> findByFormId(Long formId);

    @Query("SELECT new af.gov.anar.dck.domain.model.Report(r.id, r.name, r.description, r.envSlug, r.createdAt) from Report r where r.envSlug = ?1 order by r.id")
    public List<Report> findAllWithoutXMLContent(String envSlug);

    @Query("SELECT new af.gov.anar.dck.domain.model.Report(r.id, r.name, r.description, r.envSlug, r.createdAt) from Form f INNER JOIN f.reports r where f.id = ?1 and r.envSlug = ?2 order by r.id")
    public List<Report> findAllByFormWithoutXMLContent(Long formId, String envSlug);
}
