package com.tecsup.spring;

import com.tecsup.spring.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    // psvm + tab
    public static void main(String[] args) {
        ApplicationContext cntx
                = new ClassPathXmlApplicationContext("app.xml");

        Application.ejemplo13(cntx);
    }

    public static void ejemplo13(ApplicationContext cntx) {
        Musico lucho = (Musico) cntx.getBean("lucho");
        System.out.println(lucho.getInstrumento().getNombre());
    }

    public static void ejemplo12(ApplicationContext cntx) {
        Musico bob = (Musico) cntx.getBean("bob");
        System.out.println(bob.getInstrumento().getNombre());
    }

    public static void ejemplo11(ApplicationContext cntx) {
        Musico jimmy = (Musico) cntx.getBean("jimmy");
        System.out.println(jimmy.getInstrumento().getNombre());
    }

    public static void ejemplo10(ApplicationContext cntx) {
        Musico slash = (Musico) cntx.getBean("slash");
        System.out.println(slash.getInstrumento().getNombre());
    }

    public static void ejemplo9(ApplicationContext cntx) {
        Musico marco = (Musico) cntx.getBean("marco");
        System.out.println(marco.getInstrumento());
    }

    public static void ejemplo8(ApplicationContext cntx) {
        Musico pedro = (Musico) cntx.getBean("pedro");
        System.out.println("Instrumentos: "
                + pedro.getInstrumentos().size());

    }

    public static void ejemplo7(ApplicationContext cntx) {
        Musico miguel = (Musico) cntx.getBean("miguel");
        miguel.getInstrumento().sonido();
    }

    public static void ejemplo56(ApplicationContext cntx) {
        Musico john = (Musico) cntx.getBean("john");
        System.out.println(john.getNombre());
        System.out.println(john.getCanciones());
        john.getInstrumento().sonido();
    }

    public static void ejemplo4(ApplicationContext cntx) {
        Musico paul = (Musico) cntx.getBean("paul");
        System.out.println(paul.getCanciones());
        paul.getInstrumento().sonido();
    }

    public static void ejemplo3(ApplicationContext cntx) {
        Musico charly = (Musico) cntx.getBean("charly");
        System.out.println(charly.getCanciones());
    }

    public static void ejemplo2(ApplicationContext cntx) {
        Musico jorge = (Musico) cntx.getBean("musico");
        System.out.println(jorge);
    }

}
