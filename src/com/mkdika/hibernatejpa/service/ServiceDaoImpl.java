package com.mkdika.hibernatejpa.service;

import com.mkdika.hibernatejpa.entity.Test1;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Maikel
 */
public class ServiceDaoImpl implements ServiceDao {

    Transaction tx = null;

    public Session getSession() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        tx = session.beginTransaction();
        return session;
    }

    public Session session() {
        return HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @Override
    public void save(Object o) {
        getSession().saveOrUpdate(o);
        tx.commit();
    }

    @Override
    public void delete(Object o) {
        getSession().delete(o);
        tx.commit();
    }

    @Override
    public List<Test1> getTest1s() {
        List<Test1> list = getSession().createQuery("from Test1").list();
        tx.commit();
        return list;
    }

    @Override
    public Test1 getTest1ById(String id) {
        Test1 t = (Test1) getSession().get(Test1.class, id);
        tx.commit();
        return t;
    }
}
