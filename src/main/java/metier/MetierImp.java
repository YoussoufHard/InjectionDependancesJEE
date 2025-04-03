package metier;

import Dao.IDao;

public class MetierImp implements IMetier {

    // Nb: ici on dit que MetierImp depend de IDao mais implements IMetier
    // couplage faible
    public IDao dao ;
    @Override
    public double calcul() {
    double t=dao.getData() ;
    double res = t*23 ;
    return res ;
    }

    public MetierImp(IDao dao) {
        this.dao = dao;
    }

    public MetierImp() {

    }

    /**
     * Pour injecter dans la variable dao un objet
     * d'une classe qui implemente l'interface IDao
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
