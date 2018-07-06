package codesquad.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class HomeController {

    @GetMapping("/")
    public String index() {
        return "/";
    }
}
