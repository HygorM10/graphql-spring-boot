package com.hygorm10.compras;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello() {
        return "Hello GraphQL!";
    }

    public int soma(int a, int b) {
        return a + b;
    }

    public Cliente cliente() {
        return new Cliente("Hygor", "h@gmail.com");
    }

    public List<Cliente> clientes() {
        List<Cliente> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Cliente("Cliente " + i, "cliente" + i + "@gmail.com"));
        }
        return list;
    }

}
