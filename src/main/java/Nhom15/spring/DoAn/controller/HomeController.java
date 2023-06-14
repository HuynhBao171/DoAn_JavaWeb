package Nhom15.spring.DoAn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home()
    {
        return "user/home/index";
    }
    @RequestMapping("/categories")
    public String showCategories()
    {
        return "user/categories/index";
    }
    @RequestMapping("/details")
    public String showDetails()
    {
        return "user/categories/detail";
    }
}
