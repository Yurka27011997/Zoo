package com.solvd.zoo.dao.myBatis;

import com.solvd.zoo.dao.IAviariesDao;
import com.solvd.zoo.models.AviariesModel;
import com.solvd.zoo.myBatis.MyBatisSQLFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AviariesMyBatis {
    private static final Logger LOGGER = LogManager.getLogger(AviariesMyBatis.class);

    public static void main(String[] args) {

        MyBatisSQLFactory factory = MyBatisSQLFactory.newInstance("myBatisConfig/mybatis_config.xml");
        SqlSessionFactory sessionFactory = factory.getFactory();
        SqlSession session = sessionFactory.openSession();
        IAviariesDao aviariesMapper = session.getMapper(IAviariesDao.class);
        AviariesModel aviariesModel = aviariesMapper.getEntityById(1);
        session.close();
        LOGGER.info(aviariesModel);
    }

}
