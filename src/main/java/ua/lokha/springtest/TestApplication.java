package ua.lokha.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ua.lokha");
    }
}
