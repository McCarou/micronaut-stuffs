package com.workshop.micronaut.endpoints;

import io.micronaut.http.MediaType;
import io.micronaut.management.endpoint.annotation.Endpoint;
import io.micronaut.management.endpoint.annotation.Read;
import io.micronaut.management.endpoint.annotation.Selector;

@Endpoint(id = "date",
          prefix = "custom",
          defaultSensitive = false)
public class HomeEndpoint {

    @Read(produces = MediaType.TEXT_PLAIN)
    public String helloHome(@Selector String name) {
        return "Hello, " + name;
    }
}
