package ua.lokha.springtest;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Order(2)
@Component
public class Bean2 implements IBean {

    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getName());
    }
}
