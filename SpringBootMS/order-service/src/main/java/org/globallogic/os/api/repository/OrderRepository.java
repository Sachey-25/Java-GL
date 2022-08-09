package org.globallogic.os.api.repository;

import org.globallogic.os.api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}