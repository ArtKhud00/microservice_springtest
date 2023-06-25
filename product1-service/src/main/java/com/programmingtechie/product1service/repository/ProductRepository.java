package com.programmingtechie.product1service.repository;

import com.programmingtechie.product1service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
