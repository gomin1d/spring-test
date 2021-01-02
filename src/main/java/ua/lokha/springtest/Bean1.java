package ua.lokha.springtest;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Order(-1)
@Component
public class Bean1 implements IBean {

    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getName());
    }
}
