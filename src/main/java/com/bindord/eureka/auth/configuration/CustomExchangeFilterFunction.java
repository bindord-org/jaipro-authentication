package com.bindord.eureka.auth.configuration;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.ExchangeFunction;
import reactor.core.publisher.Mono;

import java.util.Set;

@Slf4j
@AllArgsConstructor
public class CustomExchangeFilterFunction implements ExchangeFilterFunction {

    private Set<String> headers;

    @Override
    public Mono<ClientResponse> filter(ClientRequest request, ExchangeFunction next) {
        log.info("CustomExchangeFilterFunction - filter()");
        return new CustomClientResponseMono(request, next, headers);
    }
}
