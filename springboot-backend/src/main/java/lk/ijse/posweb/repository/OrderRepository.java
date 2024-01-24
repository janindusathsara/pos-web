package lk.ijse.posweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ijse.posweb.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
