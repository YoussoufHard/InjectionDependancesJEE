package pres;

import Dao.DaoImp;
import metier.MetierImp;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
         Injection de dependance par instaciation statique
         */
        DaoImp dao = new DaoImp();
        MetierImp metier = new MetierImp();
        metier.setDao(dao); //injection via le setter
        System.out.println("RES= "+metier.calcul());
    }
}
