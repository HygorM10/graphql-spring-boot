package com.hygorm10.compras.graphql;

import com.hygorm10.compras.graphql.service.ClienteService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ClienteService service;

    public Cliente cliente(Long id) {
        return service.findById(id);
    }

    public List<Cliente> clientes() {
        return service.findAll();
    }

    @Transactional
    public Cliente saveCliente(Long id, String nome, String email) {
        Cliente c = new Cliente(id, nome, email);
        return service.save(c);
    }

    @Transactional
    public Boolean deleteCliente(Long id) {
        return service.deleteById(id);
    }

}
