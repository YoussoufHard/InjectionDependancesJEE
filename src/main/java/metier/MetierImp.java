package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")    //equivalent dans xml bean id  class
public class MetierImp implements IMetier {

    // Nb: ici on dit que MetierImp depend de IDao mais implements IMetier
    // couplage faible
   // @Autowired   //ceci veux dire faire injection
    // c'est recommendé de faire directement via constructeur au lieu de autowired
    public IDao dao ;
    @Override
    public double calcul() {
    double t=dao.getData() ;
    double res = t*23 ;
    return res ;
    }

    // si on veux faire injection par constructeur via spring il faut y avoir un seul constructeur
    public MetierImp(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

//    public MetierImp() {
//
//    }

    /**
     * Pour injecter dans la variable dao un objet
     * d'une classe qui implemente l'interface IDao
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
