package applicatiton.data.service;

import applicatiton.data.model.Order;
import applicatiton.data.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void addNewOrder(Order order){
        orderRepository.save(order);
    }
    public Order findOne(int id){
        return orderRepository.findOne(id);
    }
    public List<Order> findOrderByGuidOrUsername(String guid,String username){
        return orderRepository.findOrderByGuidOrUsername(guid,username);
    }
}
