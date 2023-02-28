package org.maktab.dbConnection;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DbConnection {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory buildSessionFactory(){
        if (sessionFactory == null){
            synchronized (DbConnection.class){
                if (sessionFactory == null){
                    Configuration configuration = new Configuration();

                    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                            configure("hibernate.cfg.xml").build();

                    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                }
            }
        }
        return sessionFactory;
    }
}
