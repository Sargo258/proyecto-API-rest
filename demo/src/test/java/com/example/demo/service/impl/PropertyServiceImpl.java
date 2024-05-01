package com.example.demo.service.impl;

import com.example.demo.dto.ListPropertyResponse;
import com.example.demo.entidad.PropertyEntity;
import com.example.demo.repository.PropertyRepository;
import com.example.demo.service.IPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PropertyServiceImpl implements IPropertyService {

    private final PropertyRepository propertyRepository;
    @Autowired
    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public PropertyEntity createProperty(PropertyEntity property) {
        return null;
    }

    @Override
    public ListPropertyResponse getProperties(double minPrice, double maxPrice) {
        return null;
    }

    @Override
    public PropertyEntity updateProperty(PropertyEntity property) {
        return null;
    }

    @Override
    public void deleteProperty(Long id) {

    }

    @Override
    public void rentProperty(Long id) {

    }

    @Override
    public List<PropertyEntity> findAllProperty() {
        return null;
    }
    private void ValidatePropertyFields(PropertyEntity property) {
        if(property.getNombre() == null || property.getNombre().trim().isEmpty() ||
        property.getDisponibilidad() == null || property.getDisponibilidad().toString().isEmpty() ||
        property.getUbicacion() == null || property.getUbicacion().trim().isEmpty() ||
        property.getPrecio() == null || property.getPrecio() <= 0){

            System.out.println("Falata un campo en la propiedad");
        }
    }

    public void validateUniqueName(String name){
        PropertyEntity existingProperty = propertyRepository.findByName(name).orElse(null);
        if (existingProperty != null) {
            System.out.println("casa ya exite ");
        }
    }

    public void validateLocation(String location){
        List<String> allowedLocations = Arrays.asList("Barranquilla", "Bogota", "Cali", "Cartagena");
        if(!allowedLocations.contains(location)) {
            System.out.println("Ubicacuon invalida" + location);
        }
    }

}
