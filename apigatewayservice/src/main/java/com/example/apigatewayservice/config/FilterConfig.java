package com.example.apigatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FilterConfig {
//    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/first-service/**")
                        .filters(f->f.addRequestHeader("first-request","first-req-header")
                                .addResponseHeader("first-response","first-res-header"))
                        .uri("http://localhost:8081"))
                .route(r -> r.path("/second-service/**")
                        .filters(f->f.addRequestHeader("second-request","second-req-header")
                                .addResponseHeader("second-response","second-res-header"))
                        .uri("http://localhost:8082"))
                .build();
    }
}
