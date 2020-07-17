package applicatiton.data.service;

import applicatiton.data.model.Cart;
import applicatiton.data.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public void addNewCart(Cart cart) {
        cartRepository.save(cart);
    }

    public Cart findOne(int id) {
        return cartRepository.findOne(id);
    }

    public boolean updateCart(Cart cart) {
        try {
            cartRepository.save(cart);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteCart(int id) {
        try {
            cartRepository.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Cart findFirstCartByGuid(String guid) {
        try {
            return cartRepository.findFirstCartByGuid(guid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Cart findByUsername(String username) {
        try {
            return cartRepository.findByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
