package lk.ijse.posweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lk.ijse.posweb.entity.Category;

@Service
public interface CategoryService {

    List<Category> getAllCategories();
    Category createCategory(Category categoryEntity);
    Category findCategoryById(Long id);
    Category updateCategory(Long id, Category categoryEntity);
    
}
