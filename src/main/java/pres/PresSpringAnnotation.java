package pres;

import metier.IMetier;
import metier.MetierImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext("dao","metier", "ext");
        //si on veux utiliser version web service il faut juste changer base package en haut par ext ou specifier le quel utiliser dans metierimp avec qualifier
        IMetier metier = context.getBean(MetierImp.class);
        System.out.println("RES= "+metier.calcul());
    }
}
