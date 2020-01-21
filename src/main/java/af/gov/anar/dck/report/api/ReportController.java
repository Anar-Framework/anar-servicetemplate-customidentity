/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package af.gov.anar.dck.report.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import af.gov.anar.dck.common.auth.ReportAuthService;
import af.gov.anar.dck.common.config.aspect.Loggable;
import af.gov.anar.dck.common.model.*;
import af.gov.anar.dck.common.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = { "/api/reports", })
@Slf4j
public class ReportController{

    @Autowired
    private ReportAuthService reportAuthService;

    @Autowired
    private UserService userService;

    ObjectMapper mapper = new ObjectMapper();

    @Loggable
    @GetMapping
    public List findAll() {
        // return formService.findAll();
        String envSlug = userService.getCurrentEnv();
        return reportAuthService.findAllWithoutXMLContentByEnv(envSlug);
    }

    @GetMapping(path = {"/{id}"})
    public Report findOne(@PathVariable("id") Long id){
        return reportAuthService.findById(id);
    }

    @Loggable
    @PostMapping(value = { "" }, produces = { MediaType.APPLICATION_JSON_VALUE })
    public Report create(@Valid @RequestBody Report report) {
        return reportAuthService.create(report);
    }

    @Loggable
    @PutMapping(path = {"/{id}"})
    public boolean update(@PathVariable("id") Long id, @RequestBody Report report){
        return reportAuthService.update(id, report);
    }

    @Loggable
    @DeleteMapping(value = { "/{id}" })
    public boolean delete(@PathVariable("id") Long id) {
        return reportAuthService.delete(id);
    }
}
