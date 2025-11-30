package academy.prog.myshortenlink;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/statistics")
    public String stats() {
        return "statistics";
    }
}