package com.hygorm10.compras.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello() {
        return "Hello GraphQL!";
    }

    public int soma(int a, int b) {
        return a + b;
    }

}
