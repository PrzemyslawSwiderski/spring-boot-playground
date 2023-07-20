package edu.pswiderski.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junitpioneer.jupiter.json.JsonClasspathSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestControllerTest {

    @Autowired
    private TestController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @ParameterizedTest
    @JsonClasspathSource("jedis.json")
    void returnsJedis(Jedi jedi) {
        // when
        var jedis = controller.getJedis();

        // then
        assertThat(jedis).contains(jedi);
    }

}
