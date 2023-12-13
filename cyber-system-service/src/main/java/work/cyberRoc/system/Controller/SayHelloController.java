package work.cyberRoc.system.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Himan，你好哥们";
    }
}
