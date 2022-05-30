package com.solvd.zoo.dao.myBatis;

import com.solvd.zoo.dao.IAnimalsDao;
import com.solvd.zoo.dao.IAviariesDao;
import com.solvd.zoo.models.AnimalsModel;
import com.solvd.zoo.models.AviariesModel;
import com.solvd.zoo.myBatis.MyBatisSQLFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnimalsMyBatis {
    private static final Logger LOGGER = LogManager.getLogger(AnimalsMyBatis.class);

    public static void main(String[] args) {
        MyBatisSQLFactory factory = MyBatisSQLFactory.newInstance("myBatisConfig/mybatis_config.xml");
        SqlSessionFactory sessionFactory = factory.getFactory();
        SqlSession session = sessionFactory.openSession();
        IAnimalsDao animalsMapper = session.getMapper(IAnimalsDao.class);
//// Get entity:
//        AnimalsModel animalsModel = agit addnimalsMapper.getEntityById(1);
//        LOGGER.info(animalsModel);
//// Create entity:
//        AnimalsModel animalsModelSave = new AnimalsModel("Yarik", "28.05.2022",null);
//        animalsMapper.saveEntity(animalsModelSave);
//        session.commit();
//        LOGGER.info(animalsModelSave.toString());
//// Update entity:
//        AnimalsModel animalsModelUpdate = animalsMapper.getEntityById(27);
//        animalsModelUpdate.setNickname("Smurfik");
//        animalsMapper.updateEntity(animalsModelUpdate);
//        session.commit();
//        LOGGER.info(animalsModelSave.toString());
// Delete entity:
        animalsMapper.removeEntity(27);
        session.commit();
        LOGGER.info("Remove element successfully");
        session.close();
    }

}
