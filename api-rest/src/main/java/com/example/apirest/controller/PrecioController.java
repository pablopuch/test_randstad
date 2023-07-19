package com.example.apirest.controller;

import com.example.apirest.PrecioService;
import com.example.apirest.model.Precio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/precios")
public class PrecioController {

    @Autowired
    private PrecioService precioService;

    @PostMapping
    public Precio createPrecio(@RequestBody Precio precio){
        return precioService.createPrecio(precio);
    }

    @GetMapping
    public List<Precio> getAllPrecios(){
        return precioService.getAllPrecio();
    }

    @GetMapping("{id}")
    public Precio searchPrecioById(@PathVariable("id") Long id){
        return precioService.getPrecioById(id);
    }

    @DeleteMapping("{id}")
    public void deletePrecioId(@PathVariable("id") Long id){
        precioService.deletePrecio(id);
    }

    @GetMapping("{date}")
    public List<Precio> getPreciosByDate(@PathVariable("date") Date date) { return precioService.getPreciosByDate(date);}
}
