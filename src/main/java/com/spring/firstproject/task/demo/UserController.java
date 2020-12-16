package com.spring.firstproject.task.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @ResponseBody
    @GetMapping("/users")
    public String users() {
        List<User> users = userRepository.getAll();
        StringBuilder result = new StringBuilder();
        for (User user : users) {
            result.append(user.toString()).append("<br/>");
        }
        return result.toString();
    }

    @RequestMapping("/add")
    public String add(@RequestParam(name = "firstname") String firstName, @RequestParam(name = "lastname") String lastName, @RequestParam(name = "age") Integer age) {
        if (firstName == null || firstName.isEmpty()) {
            return "redirect:/err.html";
        }
        userRepository.add(new User(firstName, lastName, age));
        return "redirect:/success.html";
    }

    @RequestMapping("/homepage")
    public String homepage() {
        return "redirect:/index.html";
    }
}
