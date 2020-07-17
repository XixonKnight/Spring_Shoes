package applicatiton.data.service;

import applicatiton.data.model.ProductImage;
import applicatiton.data.repository.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductImageService {

    @Autowired
    private ProductImageRepository productImageRepository;

    @Transactional
    public void addNewListImageProduct(List<ProductImage> imageList) {
        try {
            productImageRepository.save(imageList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addNewImageProduct(ProductImage productImage) {
        productImageRepository.save(productImage);
    }

    public ProductImage findOne(int id) {
        return productImageRepository.findOne(id);
    }

    public boolean updateProductImage(ProductImage productImage) {
        try {
            productImageRepository.save(productImage);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteProductImage(int id) {
        try {
            productImageRepository.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
