package Nhom15.spring.DoAn.controller.admincontroller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/index")
    public String index()
    {
        return "admin/home/index_admin";
    }

    @GetMapping("/category")
    public String category()
    {
        return "admin/categories/index";
    }
}
