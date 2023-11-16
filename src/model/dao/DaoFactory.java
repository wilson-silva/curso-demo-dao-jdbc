package model.dao;

import db.DataBaseConfig;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DataBaseConfig.getConnection());
    }
}
