package it.enzoracca.springbootapp;

import com.fasterxml.jackson.databind.JsonNode;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.io.File;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Ignore
public class SwaggerGenerator {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void generateSwagger() throws Exception {
        JsonNode response = testRestTemplate.getForObject("http://localhost:8080/v3/api-docs", JsonNode.class);
        FileUtils.writeStringToFile(new File("swagger.json"), response.toPrettyString());

    }
}
