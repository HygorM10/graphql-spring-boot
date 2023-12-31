package com.hygorm10.compras.graphql.service;

import com.hygorm10.compras.graphql.Cliente;
import com.hygorm10.compras.graphql.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository rep;

    public Cliente findById(Long id) {
        return rep.findById(id).orElse(null);
    }

    public List<Cliente> findAll() {
        return rep.findAll();
    }

    @Transactional
    public Cliente save(Cliente cliente) {
        return rep.save(cliente);
    }

    @Transactional
    public Boolean deleteById(Long id) {
        if (rep.findById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }

}
