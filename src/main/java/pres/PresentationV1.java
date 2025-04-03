package pres;

import dao.DaoImp;
import metier.MetierImp;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
         Injection de dependance par instaciation statique => avrec new
         */
        DaoImp dao = new DaoImp();
        MetierImp metier = new MetierImp();
       // DaoImpV2 dao = new DaoImpV2(); si on veux utiliser version web service il faut juste utiliser ceci
        metier.setDao(dao); //injection via le setter
        System.out.println("injection avec setter RES= "+metier.calcul());

        MetierImp metier1 = new MetierImp(); // injection de dependance via le constructeur

        System.out.println("injection avec constructeur RES= "+metier.calcul());


    }
}
