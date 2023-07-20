package edu.pswiderski.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.time.LocalDate.parse;

@RestController
public class TestController {

    @GetMapping
    public List<Jedi> getJedis() {
        var testJedi = new Jedi(
                "Some name",
                "51",
                parse("7777-03-05")
        );
        return List.of(testJedi);
    }

}
