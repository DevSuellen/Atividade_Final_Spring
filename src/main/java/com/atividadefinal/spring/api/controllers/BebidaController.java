package com.atividadefinal.spring.api.controllers;

import com.atividadefinal.spring.api.models.Bebida;
import com.atividadefinal.spring.api.repositories.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BebidaController {
    @Autowired
    private BebidaRepository bebidaRepository;

    @RequestMapping(value = "/adicionabebida", method = RequestMethod.GET)
    public Bebida save(@RequestBody Bebida bebida) {
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }

    @RequestMapping(value = "/buscabebida", method = RequestMethod.GET)
    public List<Bebida> findAll() {
        List<Bebida> bebidas = this.bebidaRepository.findAll();
        return bebidas;
    }

    @RequestMapping(value = "/excluirbebida/{id}", method = RequestMethod.GET)
    public Bebida deleteById(@PathVariable long id) {
        Bebida bebida = findById(id);
        this.bebidaRepository.deleteById(id);
        return bebida;
    }

    private Bebida findById(long id) {
        return null;
    }

    @RequestMapping(value = "/editarbebida/{id}", method = RequestMethod.PUT)
    public Bebida updateById(@PathVariable long id, @RequestBody Bebida bebida) {
        this.findById(id);
        bebida.setIdBebida(id);
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }
}
