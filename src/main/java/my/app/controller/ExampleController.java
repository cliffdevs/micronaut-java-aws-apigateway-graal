package my.app.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;
import my.app.dto.Pong;

@Slf4j
@Controller("/")
public class ExampleController {

    @Get("/ping")
    public Pong index() {
        return Pong.builder().pong(true).graal(true).build();
    }
}