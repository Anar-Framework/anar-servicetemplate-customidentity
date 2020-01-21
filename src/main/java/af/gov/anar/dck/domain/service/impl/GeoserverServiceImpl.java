package af.gov.anar.dck.domain.service.impl;

import af.gov.anar.dck.domain.service.GeoserverService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class GeoserverServiceImpl implements GeoserverService {
    public InputStream executeCommand(String command) throws IOException {
        Process process = Runtime.getRuntime().exec(command);
        return process.getInputStream();
    }

}
