package com.atividadefinal.spring.api.controllers;
import com.atividadefinal.spring.api.models.Ingrediente;
import com.atividadefinal.spring.api.repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredienteController {
    @Autowired
    private IngredienteRepository ingredienteRepository;

    @RequestMapping(value = "/adicionaingrediente", method = RequestMethod.GET)
    public Ingrediente save(@RequestBody Ingrediente ingrediente) {
        ingrediente = this.ingredienteRepository.save(ingrediente);
        return ingrediente;
    }

    @RequestMapping(value = "/buscaingrediente", method = RequestMethod.GET)
    public List<Ingrediente> findAll() {
        List<Ingrediente> ingrediente = this.ingredienteRepository.findAll();
        return ingrediente;
    }

    @RequestMapping(value = "/excluiringrediente/{id}", method = RequestMethod.GET)
    public Ingrediente deleteById(@PathVariable long id) {
        Ingrediente ingrediente= findById(id);
        this.ingredienteRepository.deleteById(id);
        return ingrediente;
    }

    private Ingrediente findById(long id) {
        return null;
    }

    @RequestMapping(value = "/editaringrediente/{id}", method = RequestMethod.PUT)
    public Ingrediente updateById(@PathVariable long id, @RequestBody Ingrediente ingrediente) {
        this.findById(id);
        ingrediente.setIdIngrediente(id);
        ingrediente = this.ingredienteRepository.save(ingrediente);
        return ingrediente;
    }
}
