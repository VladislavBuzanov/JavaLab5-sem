package ru.itis.homework3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.homework3.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
