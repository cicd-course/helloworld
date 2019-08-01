package eduneko.cicd.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    final static String message = "Bom dia, Mundo CI/CD!";

    @RequestMapping("/")
    public String index() {
        return message;
    }

}
