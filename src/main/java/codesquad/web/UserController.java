package codesquad.web;

import codesquad.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private List<User> users = new ArrayList<>();

    @GetMapping("/user/{id}")
    public String show(@PathVariable int id, Model model) {
        model.addAttribute("user", users.get(id));
        return "/user/profile";
    }

    @PostMapping("/users")
    public String create(User user, Model model){
        users.add(user);
        return "redirect:/users";
    }

    @GetMapping("/users")
    public String list(Model model){
        model.addAttribute("users", users);
        return "/user/list";
    }


}
