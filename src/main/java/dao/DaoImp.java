package dao;

public class DaoImp implements IDao {
    @Override
    public double getData() {
        System.out.println(" Version base de données ");
        double temp=23 ;
        return temp ;
    }
}
