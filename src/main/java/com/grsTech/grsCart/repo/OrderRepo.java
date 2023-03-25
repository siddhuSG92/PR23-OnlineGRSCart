package com.grsTech.grsCart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grsTech.grsCart.entity.OrderDetails;

public interface OrderRepo extends JpaRepository<OrderDetails, String> {

}
