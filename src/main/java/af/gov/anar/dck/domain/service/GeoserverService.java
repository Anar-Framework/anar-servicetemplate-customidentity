package af.gov.anar.dck.domain.service;

import java.io.IOException;
import java.io.InputStream;

public interface GeoserverService {
    public InputStream executeCommand(String command) throws IOException;
}
