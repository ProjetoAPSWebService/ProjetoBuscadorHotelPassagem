package br.com.buscador.hibernate;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Saulo
 */
public class HibernateConfigurationXml {

    private SessionFactory sessionFactory;
    private EntityManager entityManager;

    public void testSessionHibernate() {

        sessionFactory = new Configuration().configure().buildSessionFactory();
        sessionFactory.openSession();
        Session se = sessionFactory.getCurrentSession();

        Transaction tx = se.beginTransaction();
        
        
        tx.commit();
    }
}
