package Nhom15.spring.DoAn.service;

import Nhom15.spring.DoAn.entity.Category;
import Nhom15.spring.DoAn.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> getAllCategory() { return categoryRepository.findAll();}

    public Category getCategoryById(Integer id) { return categoryRepository.findById(id).orElse(null);}

    public  Category addCategory(Category category) { return categoryRepository.save(category);}

    public void deleteCategory(Integer id) { categoryRepository.deleteById(id);}

    public  Category updateCategory(Category category) { return categoryRepository.save(category);}
}
