package com.example.apirest.repository;

import com.example.apirest.model.Precio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecioRepository extends JpaRepository<Precio, Long> {
}
