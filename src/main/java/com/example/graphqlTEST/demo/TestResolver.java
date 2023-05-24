package com.example.graphqlTEST.demo;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class TestResolver implements GraphQLQueryResolver {
    public String test(){
        return "TEST";
    }
}
