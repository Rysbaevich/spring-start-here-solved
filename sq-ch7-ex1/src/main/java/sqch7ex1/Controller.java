package sqch7ex1;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }
}
