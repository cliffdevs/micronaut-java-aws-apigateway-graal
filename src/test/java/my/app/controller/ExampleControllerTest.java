package my.app.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import my.app.dto.Pong;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class ExampleControllerTest {

    @Inject
    @Client("/")
    private RxHttpClient client;

    @Inject
    private ObjectMapper mapper;

    @Test
    void testPing() throws IOException {
        final Pong response = client.toBlocking().retrieve(HttpRequest.GET("/ping"), Pong.class);
        assertTrue(response.isPong());
        assertTrue(response.isGraal());
    }
}