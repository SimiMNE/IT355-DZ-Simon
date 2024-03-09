package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Oblik kvadrat = context.getBean(Kvadrat.class);
        System.out.println("Obim kvadrata: " + kvadrat.obim());
        System.out.println("Povrsina kvadrata: " + kvadrat.povrsina());

        Oblik krug = (Oblik) context.getBean("krug");
        System.out.println("Obim kruga: " + krug.obim());
        System.out.println("Povrsina kruga: " + krug.povrsina());

        Oblik jednakostranicniTrougao = (Oblik) context.getBean("jednakostranicniTrougao");
        System.out.println("Obim jednakostranicnog trougla: " + jednakostranicniTrougao.obim());
        System.out.println("Povrsina jednakostranicnog trougla: " + jednakostranicniTrougao.povrsina());
    }
}