package pl.adroitsoft.helloworldapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/hello")
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String hello(@RequestBody HelloRequest helloRequest) {

        // logback / log4j / java.util.Logging / JCL (Jakarta Common Logging)
        // LOGGER.trace(helloRequest.toString());
        LOGGER.debug(helloRequest.toString());
        LOGGER.info(helloRequest.toString());
        LOGGER.warn(helloRequest.toString());
        LOGGER.error(helloRequest.toString());

        try {

            LOGGER.info("getting something for calculation");
            // ...
            int a = 1 / 0;

        } catch (Exception ex) {

            // .. jeżeli jesteśmy w stanie obsłużyć wyjątek i przejść dalej z logiką to warn

            LOGGER.error("Error while getting something", ex);
        }

        return "Hello, " + helloRequest.getName();
    }
}