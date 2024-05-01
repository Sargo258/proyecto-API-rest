package com.example.demo.repository;

import com.example.demo.entidad.PropertyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


//@Repository puente entre la base de datos y la entidad
@Repository
public interface PropertyRepository extends CrudRepository<PropertyEntity,Long> {
    Optional<PropertyEntity> findByName(String name);
    List<PropertyRepository> findByPrice(double minPrice, double maxPrice);

}
