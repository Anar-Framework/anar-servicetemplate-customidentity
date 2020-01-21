/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.gov.anar.dck.common.service;

import af.gov.anar.dck.common.model.Report;
import net.sf.jasperreports.engine.JRException;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hp 2018
 */
@Transactional
public interface ReportService {

    public Report create(Report report);

    public boolean update(Long id, Report report);

    public List<Report> findAll();

    public List<Report> findAllWithoutXMLContent();

    public List<Report> findAllWithoutXMLContentByEnv(String envSlug);

    public List<Report> findAllByFormWithoutXMLContent(Long FormId);

    public Report findById(Long id);

    public List<Report> findByFormId(Long id);

    public boolean delete(Long id);

    public void delete(Report report);

    public File generatePdfJasperReport(File xmlDatasource, Map<String, Object> parameters, File jrxmlFile,
                                        File destFile) throws IOException, JRException;
}
