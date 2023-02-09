package sqch8ex1;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page) {
        page.addAttribute("username", "Nurdoolot");
        page.addAttribute("color", "red");
        return "home.html";
    }
}
