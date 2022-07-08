package pl.adroitsoft.helloworldapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/hello")
public class HelloController {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String hello(@RequestBody HelloRequest helloRequest) {
        return "Hello, " + helloRequest.getName();
    }
}