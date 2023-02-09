package main;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class MainController {

    @RequestMapping("/home/{color}")
    public String home(@PathVariable String color,
                                            Model page) {
        page.addAttribute("username", "name");
        page.addAttribute("color", color);
        return "home.html";
    }
}
