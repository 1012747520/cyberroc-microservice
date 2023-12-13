package work.cyberRoc.neo4j.Controller;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetSayHelloController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getSayHello")
    public String getSayHello(){
        return  restTemplate.getForObject("http://cyber-system-service/sayHello",String.class);
    }
}
