package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrresAvecSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        //  IMetier metier = context.getBean(IMetier.class);      on poura aussi utiliser ceci directemnet si c'est seul bean
        System.out.println("RES= "+metier.calcul());
    }
}
