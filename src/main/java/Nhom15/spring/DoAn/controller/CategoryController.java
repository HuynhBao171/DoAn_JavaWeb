package Nhom15.spring.DoAn.controller;

import Nhom15.spring.DoAn.entity.Category;
import Nhom15.spring.DoAn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String showAllBooks(Model model) {
        List<Category> categories = categoryService.getAllCategory();
        model.addAttribute("categories", categories);
        return "category/list";
    }

    @GetMapping("/add")
    public String addCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "category/add";
    }

    @PostMapping("/add")
    public String addCategory(@ModelAttribute("category") Category category) {
        categoryService.updateCategory(category);
        return "redirect:/categories";
    }

    @GetMapping("/edit/{id}")
    public String editCategoryForm(@PathVariable("id") Integer id, Model model){
        Category editCategory = categoryService.getCategoryById(id);
        model.addAttribute("category", editCategory);
        return "category/edit";
    }

    @PostMapping("/edit/{id}")
    public String editCategory(@ModelAttribute("category") Category category){
        categoryService.updateCategory(category);
        return "redirect:/categories";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategory(@PathVariable("id") Integer id){
        categoryService.deleteCategory(id);
        return "redirect:/categories";
    }
}
