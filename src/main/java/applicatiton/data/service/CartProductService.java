package applicatiton.data.service;

import applicatiton.data.model.CartProduct;
import applicatiton.data.repository.CartProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartProductService {

    @Autowired
    private CartProductRepository cartProductRepository;

    public void addNewCartProduct(CartProduct cartProduct) {
        cartProductRepository.save(cartProduct);
    }

    public CartProduct findOne(int id) {
        return cartProductRepository.findOne(id);
    }

    public boolean updateCartProduct(CartProduct cartProduct) {
        try {
            cartProductRepository.save(cartProduct);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteCartProduct(int id) {
        try {
            cartProductRepository.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Transactional
    public boolean deleteListCartProduct(List<CartProduct> cartProductList) {
        try {
            cartProductRepository.delete(cartProductList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public CartProduct findFirstCartProductByCartIdAndProductId(int cartId, int productId) {
        try {
            return cartProductRepository.findFirstCartProductByCartIdAndProductId(cartId, productId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
