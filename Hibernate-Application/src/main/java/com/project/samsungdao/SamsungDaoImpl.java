package com.project.samsungdao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.project.entity.samsung.Samsung;

public class SamsungDaoImpl implements SamsungDao {

	@Override
	public void saveData() {
		System.out.println("SamsungDaoImpl.saveData()");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			Samsung samsung = new Samsung(4, "Samsung Galaxy M21", "Black", 15000, 4, true);
			session.save(samsung);
			session.getTransaction().commit();
			System.out.println("Data is Inserted Sucessfully,,,,,,,,,,,,,,");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed,,,,,,,,,,,,,");
			} else {
				System.out.println("Session is not closed,,,,,,,,,,,,,,,");
			}
			if (sessionFactory != null) {
				System.out.println("sessionFactory is closed,,,,,,,,,,");
				sessionFactory.close();
			} else {
				System.out.println("Session factory is not closed,,,,,,,,,,,,,,");
			}
		}

	}

	@Override
	public void readSingleData() {
		System.out.println("SamsungDaoImpl.readSingleData()");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			Samsung samsung = session.get(Samsung.class, 2);
			System.out.println("Read is Done : " + samsung);
		} catch (HibernateException e) {
			System.out.println(e.getMessage());

		}

		finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed,,,,,,,,,,,,");
			} else {
				System.out.println("Session is not closed,,,,,,,,");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("session Factory is closed,,,,,,,,,,,,,");
			} else {
				System.out.println("session factory is not closed,,,,,,,,,,,");
			}
		}

	}

	@Override
	public void updateData() {
		System.out.println("Involked update Data()");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction trans = null;
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			Samsung samsung = session.get(Samsung.class, 2);
			System.out.println("Before Updating Data: " + samsung);
			samsung.setName("Samsung Galaxy");
			samsung.setColor("Blue");
			samsung.setPrice(25000);
			samsung.setRam(8);
			trans = session.beginTransaction();
			session.update(samsung);
			trans.commit();
			System.out.println("Data is Updated Sucessfully: " + samsung);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			trans.rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed,,,,,,,,,,,,");
			} else {
				System.out.println("Session is not closed,,,,,,,,");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("session Factory is closed,,,,,,,,,,,,,");
			} else {
				System.out.println("session factory is not closed,,,,,,,,,,,");
			}
		}

	}

	@Override
	public void deleteData() {
		System.out.println("Involked delete Data()");
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction trans = null;
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			sessionFactory = config.buildSessionFactory();
			session = sessionFactory.openSession();
			Samsung samsung=session.get(Samsung.class, 4);
			System.out.println("Samsung Entity: "+samsung);
			trans=session.beginTransaction();
			session.delete(samsung);
			trans.commit();
			System.out.println("Data is deleted sucessfully,,,,,,,,,,,,,,,,");
		}
		catch(HibernateException e) {
			System.out.println(e.getMessage());
			trans.rollback();
			
		}
		finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed,,,,,,,,,,,,");
			} else {
				System.out.println("Session is not closed,,,,,,,,");
			}
			if (sessionFactory != null) {
				sessionFactory.close();
				System.out.println("session Factory is closed,,,,,,,,,,,,,");
			} else {
				System.out.println("session factory is not closed,,,,,,,,,,,");
			}
		}
	}

}
