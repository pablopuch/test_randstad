package com.example.apirest;

import com.example.apirest.model.Precio;
import com.example.apirest.repository.PrecioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class PrecioService {
    @Autowired
    private PrecioRepository precioRepository;

    public Precio createPrecio(Precio precio){
        return precioRepository.save(precio);
    }

    public Precio getPrecioById(Long id){
        Optional<Precio> optionalPrecio = precioRepository.findById(id);
        return optionalPrecio.get();
    }

    public List<Precio> getAllPrecio(){
        return precioRepository.findAll();
    }

    public void deletePrecio(Long id){
        precioRepository.deleteById(id);
    }

    public List<Precio> getPreciosByDate(Date date) {
        List<Precio> precios = precioRepository.findAll();
        List<Precio> preciosEnRango = new ArrayList<>();

        for (Precio precio : precios) {
            if (date.after(precio.getStart_date()) && date.before(precio.getEnd_date())) {
                preciosEnRango.add(precio);
            }
        }

        return preciosEnRango;
    }


}
