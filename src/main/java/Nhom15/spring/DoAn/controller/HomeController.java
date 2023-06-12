package Nhom15.spring.DoAn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String show()
    {
        return "home/index";
    }
   /* @RequestMapping("/categories")
    public String showCategories(){

    }*/
    @RequestMapping("/index")
    public String showhome()
    {
        return "index";
    }
}
