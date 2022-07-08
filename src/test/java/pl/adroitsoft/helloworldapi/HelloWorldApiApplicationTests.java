package pl.adroitsoft.helloworldapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class HelloWorldApiApplicationTests {

    @Test
    void contextLoads() {
        Assert.isTrue(true, "failed assertion");
    }

}
