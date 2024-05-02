package com.atividadefinal.spring.api.controllers;

import com.atividadefinal.spring.api.models.Cliente;
import com.atividadefinal.spring.api.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @RequestMapping(value = "/adicionacliente", method = RequestMethod.GET)
    public Cliente save(@RequestBody Cliente cliente) {
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }

    @RequestMapping(value = "/buscacliente", method = RequestMethod.GET)
    public List<Cliente> findAll() {
        List<Cliente> clientes = this.clienteRepository.findAll();
        return clientes;

    }

    @RequestMapping(value = "/excluir/{id}", method = RequestMethod.GET)
    public Cliente deleteById(@PathVariable long id) {
        Cliente cliente = findById(id);
        this.clienteRepository.deleteById(id);
        return cliente;
    }

    private Cliente findById(long id) {
        return null;
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.PUT)
    public Cliente updateById(@PathVariable long id, @RequestBody Cliente cliente) {
        this.findById (id);
        cliente.setIdCliente(id);
        cliente = this.clienteRepository.save(cliente);
        return cliente;
    }
}
