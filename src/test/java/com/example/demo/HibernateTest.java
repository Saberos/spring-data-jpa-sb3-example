package com.example.demo;

import com.example.demo.entities.EntityA;
import com.example.demo.entities.EntityB;
import com.example.demo.entities.EntityC;
import com.example.demo.entities.EntityD;
import com.example.demo.entities.EntityE;
import com.example.demo.entities.EntityF;
import com.example.demo.entities.EntityG;
import com.example.demo.entities.EntityH;
import com.example.demo.entities.EntityI;
import com.example.demo.entities.EntityJ;
import com.example.demo.entities.EntityK;
import com.example.demo.entities.EntityL;
import com.example.demo.entities.EntityM;
import com.example.demo.entities.EntityN;
import com.example.demo.entities.EntityO;
import com.example.demo.entities.EntityP;
import com.example.demo.entities.EntityQ;
import com.example.demo.entities.EntityR;
import com.example.demo.entities.EntityS;
import com.example.demo.entities.EntityT;
import com.example.demo.entities.EntityU;
import com.example.demo.entities.EntityV;
import com.example.demo.entities.EntityW;
import com.example.demo.entities.EntityX;
import com.example.demo.entities.EntityY;
import com.example.demo.entities.EntityZ;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.Test;

import java.util.Properties;

public class HibernateTest {
    @Test
    void test() {
        Properties settings = new Properties();
        settings.setProperty("hibernate.connection.url", "jdbc:h2:mem:test");

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(settings)
                .build();
        try (SessionFactory sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(EntityA.class)
                    .addAnnotatedClass(EntityB.class)
                    .addAnnotatedClass(EntityC.class)
                    .addAnnotatedClass(EntityD.class)
                    .addAnnotatedClass(EntityE.class)
                    .addAnnotatedClass(EntityF.class)
                    .addAnnotatedClass(EntityG.class)
                    .addAnnotatedClass(EntityH.class)
                    .addAnnotatedClass(EntityI.class)
                    .addAnnotatedClass(EntityJ.class)
                    .addAnnotatedClass(EntityK.class)
                    .addAnnotatedClass(EntityL.class)
                    .addAnnotatedClass(EntityM.class)
                    .addAnnotatedClass(EntityN.class)
                    .addAnnotatedClass(EntityO.class)
                    .addAnnotatedClass(EntityP.class)
                    .addAnnotatedClass(EntityQ.class)
                    .addAnnotatedClass(EntityR.class)
                    .addAnnotatedClass(EntityS.class)
                    .addAnnotatedClass(EntityT.class)
                    .addAnnotatedClass(EntityU.class)
                    .addAnnotatedClass(EntityV.class)
                    .addAnnotatedClass(EntityW.class)
                    .addAnnotatedClass(EntityX.class)
                    .addAnnotatedClass(EntityY.class)
                    .addAnnotatedClass(EntityZ.class)
                    .buildMetadata()
                    .buildSessionFactory()) {
        }
    }
}
