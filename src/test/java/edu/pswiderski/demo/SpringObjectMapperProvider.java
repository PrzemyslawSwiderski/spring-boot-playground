package edu.pswiderski.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.junitpioneer.jupiter.json.ObjectMapperProvider;

public class SpringObjectMapperProvider implements ObjectMapperProvider {

    @Override
    public ObjectMapper get() {
        return new JsonMapper().findAndRegisterModules();
    }

//    @Override
//    public ObjectMapper getLenient() {
//        return new JsonMapper().findAndRegisterModules();
//    }

    @Override
    public String id() {
        return "spring";
    }
}
