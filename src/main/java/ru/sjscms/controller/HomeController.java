package ru.sjscms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by blajimir on 08.02.2017.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model){
      model.addAttribute("hello","Hello from Thymeleaf! =)");
      return "index";
    }

    @RequestMapping({"/a/b/c/{name}","/a/b/c"})
    public String anotherPage(Model model, @PathVariable(name = "name", required = false) String name){
        System.out.println(name);
        model.addAttribute("hello",name);
        return "index";
    }
}
