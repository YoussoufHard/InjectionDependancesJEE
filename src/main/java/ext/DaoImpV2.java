package ext;

import dao.IDao;

public class DaoImpV2 implements IDao {
    @Override
    public double getData (){
        System.out.println("Version Web Service ");
        double temp=25 ;
        return temp ;
    }
}
