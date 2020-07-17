package applicatiton.data.service;

import applicatiton.data.model.Product;
import applicatiton.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addNewProduct(Product product) {
        productRepository.save(product);
    }

    public Product findOne(int id) {
        return productRepository.findOne(id);
    }

    public void addNewListProducts(List<Product> products) {
        productRepository.save(products);
    }

    public boolean updateProduct(Product product) {
        try {
            productRepository.save(product);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteDelete(int id) {
        try {
            productRepository.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Page<Product> getListProductByCategoryOrProductNameContaining(Pageable pageable, int categoryId, String productName) {
        return productRepository.getListProductByCategoryOrProductNameContaining(pageable, categoryId, productName);
    }

    public long getTotalProduct() {
        return productRepository.getTotalProducts();
    }
}
