package my.app.controller;

import io.micronaut.function.aws.proxy.MicronautAwsProxyResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.Status;
import lombok.extern.slf4j.Slf4j;
import my.app.dto.Pong;

@Slf4j
@Controller("/")
public class ExampleController {

    @Get("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public Pong index() {
        return Pong.builder().pong(true).graal(true).build();
    }

    @Get("/pong")
    @Produces(MediaType.APPLICATION_JSON)
    @Status(HttpStatus.CREATED)
    public HttpResponse<?> withResponseClass() {
        return HttpResponse.created(Pong.builder().pong(true).graal(true).build());
    }

    @Get("/error")
    @Produces(MediaType.APPLICATION_JSON)
    public HttpResponse<?> withSyntheticError() {
        throw new RuntimeException("I can't even right now");
    }
}