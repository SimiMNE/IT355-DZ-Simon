package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Oblik krug() {
        return new Krug(5.0);
    }

    @Bean
    public Oblik jednakostranicniTrougao() {
        return new JednakostranicniTrougao(6.0);
    }
    @Bean
    public Oblik kvadrat() {
        return new Kvadrat(7.0);
    }
}