package Exc_10.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Magican magican = (Magican) context.getBean(sc.nextLine());
        magican.doMagic();


//        SpringApplication.run(main.class, args);
    }

}
