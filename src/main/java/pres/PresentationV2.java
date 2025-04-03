package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        /*
         Injection de dependance par instaciation dynamique
         */
        try {
            Scanner scanner = new Scanner(new File("config.txt"));

             //   DaoImp dao = new DaoImp();
            String daoClassname = scanner.nextLine();
            Class<?> cDao= Class.forName(daoClassname) ;     // si on veux utiliser la version web service il suffit juste de l'indiquer dans le config (ext.DaoImpV2)
            IDao dao=(IDao) cDao.getConstructor().newInstance();

            //  MetierImp metier = new MetierImp();
            String metierClassname = scanner.nextLine();
            Class cMetier= Class.forName(metierClassname) ;
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            // si on veux faire avec settter injection
            //  metier.setDao(dao);
//            IMetier metier = (IMetier) cMetier.getConstructor().newInstance(dao);
//            Method setDao= cMetier.getDeclaredMethod("setDao",IMetier.class);
//            setDao.invoke(metier,dao);
            System.out.println("RES= "+ metier.calcul());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

    }
}
