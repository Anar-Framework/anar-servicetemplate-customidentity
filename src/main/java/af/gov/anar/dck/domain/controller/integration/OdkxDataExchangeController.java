package af.gov.anar.dck.domain.controller.integration;

import af.gov.anar.dck.domain.config.aspect.Loggable;
import af.gov.anar.dck.domain.util.JsonParserUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/scripts/odkx")
public class OdkxDataExchangeController {

    JsonParserUtil JsonParserUtil = new JsonParserUtil();

    @PostMapping(value = "")
    @Loggable
    public String recieve(@RequestBody String data)
    {
        System.out.println("Data => " + JsonParserUtil.parse(data).toString());
        return data;
    }

}