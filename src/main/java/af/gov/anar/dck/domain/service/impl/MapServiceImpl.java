package af.gov.anar.dck.domain.service.impl;

import af.gov.anar.dck.domain.model.Form;
import af.gov.anar.dck.domain.service.FormService;
import af.gov.anar.dck.domain.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapServiceImpl implements MapService {
	
    @Autowired
    private FormService formService;
    
    @Override
    public List<Form> getMainMapForms() {
    	return formService.findAllByShowOnMapHasGeometry(true, true);
    }
}