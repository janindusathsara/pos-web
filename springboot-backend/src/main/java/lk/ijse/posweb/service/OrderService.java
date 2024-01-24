package lk.ijse.posweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lk.ijse.posweb.dto.OrderDto;
import lk.ijse.posweb.entity.Order;

@Service
public interface OrderService {

    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order creatOrder(OrderDto orderDto);
    
}
