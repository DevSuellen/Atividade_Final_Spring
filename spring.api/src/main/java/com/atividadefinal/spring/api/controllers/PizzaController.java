package com.atividadefinal.spring.api.controllers;

import com.atividadefinal.spring.api.models.Pizza;
import com.atividadefinal.spring.api.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaController {
    @Autowired
    private PizzaRepository pizzaRepository;

    @RequestMapping(value = "/adicionapizza", method = RequestMethod.GET)
    public Pizza save(@RequestBody Pizza pizza) {
        pizza = this.pizzaRepository.save(pizza);
        return pizza;
    }
    @RequestMapping(value = "/buscapizza", method = RequestMethod.GET)
    public List<Pizza> findAll() {
        List<Pizza> pizza = this.pizzaRepository.findAll();
        return pizza;
    }
    @RequestMapping(value = "/excluirpizza/{id}", method = RequestMethod.GET)
    public Pizza deleteById(@PathVariable long id) {
        Pizza pizza= findById(id);
        this.pizzaRepository.deleteById(id);
        return pizza;
    }

    private Pizza findById(long id) {
        return null;
    }
    @RequestMapping(value = "/editarpizza/{id}", method = RequestMethod.PUT)
    public Pizza updateById(@PathVariable long id, @RequestBody Pizza pizza) {
        this.findById(id);
        pizza.setIdPizza(id);
        pizza = this.pizzaRepository.save(pizza);
        return pizza;
    }
}
