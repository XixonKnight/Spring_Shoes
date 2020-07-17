package applicatiton.data.service;

import applicatiton.data.model.Category;
import applicatiton.data.repository.CartRepository;
import applicatiton.data.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void addNewCategory(Category category) {
        categoryRepository.save(category);
    }

    public Category findOne(int id) {
        return categoryRepository.findOne(id);
    }

    public boolean updateCategory(Category category) {
        try {
            categoryRepository.save(category);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteCategory(int id) {
        try {
            categoryRepository.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Transactional
    public void addNewListCategory(List<Category> categories) {
        try {
            categoryRepository.save(categories);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Category> getAllListCategories() {
        try {
            return categoryRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public long getTotalCategories() {
        return categoryRepository.getTotalCategories();
    }
}
