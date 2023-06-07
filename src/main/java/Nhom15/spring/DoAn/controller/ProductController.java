package Nhom15.spring.DoAn.controller;

import Nhom15.spring.DoAn.entity.Product;
import Nhom15.spring.DoAn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String showAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product/list";
    }

    @GetMapping("/add")
    public String addProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "product/add";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute("product") Product product) {
        productService.addProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String editProductForm(@PathVariable("id") Integer id, Model model){
        Product editProduct = productService.getProductById(id);
        model.addAttribute("product", editProduct);
        return "product/edit";
    }

    @PostMapping("/edit/{id}")
    public String editProduct(@ModelAttribute("product") Product product){
        productService.updateProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id){
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}
