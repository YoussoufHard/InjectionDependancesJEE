package dao;

import org.springframework.stereotype.Component;

@Component("dao")     //equivalent dans xml bean id  class
public class DaoImp implements IDao {
    @Override
    public double getData() {
        System.out.println(" Version base de données ");
        double temp=23 ;
        return temp ;
    }
}
