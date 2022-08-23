package com.project.samsungdao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;

import com.project.entity.samsung.Samsung;
import com.project.util.SessionFactoryProvider;

public class SamsungDaoImpl implements SamsungDao {

	@Override
	public void saveData(Samsung samsung) {
		System.out.println("Involked save Data()");// it is for devoloper reference,,
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(samsung);
			session.getTransaction().commit();
			System.out.println("Data is inserted Sucessfully,,,,,,,,,,,");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed,,,,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,,,,");
			}
			SessionFactoryProvider.closeSessionFactory();
		}

	}

	@Override
	public void getSamsungDetailsById(int id) {
		System.out.println("SamsungDaoImpl.getSamsungDetailsById()");
		SessionFactory sessionFactory = null;
		Session session = null;

		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			String hqlQuery = "From Samsung where id=:ID";
			Query<Samsung> query = session.createQuery(hqlQuery);
			query.setParameter("ID", id);
			Object object = query.getSingleResult();
			System.out.println("Samsung Entity: " + object);

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,,,");
			}
			SessionFactoryProvider.closeSessionFactory();
		}
	}

	@Override
	public List<Samsung> getSamsungDetails() {
		System.out.println("SamsungDaoImpl.getSamsungDetails()");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			String hqlQury = "From Samsung";
			Query<Samsung> query = session.createQuery(hqlQury);
			List<Samsung> container = query.list();
			container.stream().forEach(System.out::println);
			//			System.out.println("List of Samsung: "+container);
			//			for(Samsung sam:container) {
			//				System.out.println(sam);
			//			}

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed,,,,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,");
			}
			SessionFactoryProvider.closeSessionFactory();
		}
		return null;
	}

	@Override
	public void updateSamsungDetialsById(int id, String color) {
		System.out.println("SamsungDaoImpl.updateSamsungDetialsById()");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hqlQuery = "update Samsung set color=:COLOR where id=:ID";
			Query<Samsung> query = session.createQuery(hqlQuery);
			query.setParameter("COLOR", color);
			query.setParameter("ID", id);
			query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("Data is updated sucessfully,,,,,,,,,,,");
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				System.out.println("session is closed,,,,,,");
				session.close();
			} else {
				System.out.println("session is not closed,,,,,,,,,");
			}
			SessionFactoryProvider.closeSessionFactory();
		}
	}

	@Override
	public void updateSamsungDetails(Samsung samsung) {
		System.out.println("SamsungDaoImpl.updateSamsungDetails()");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {

			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hqlQury = "update Samsung set name=:NAME,color=:COLOR,price=:PRICE,"
					+ "ram=:RAM,is_Finger_Print_Supported=:IS_FINGER_PRINT_SUPPORTED " + "where id=:ID";
			Query<Samsung> query = session.createQuery(hqlQury);
			query.setParameter("ID", samsung.getId());
			query.setParameter("NAME", samsung.getName());
			query.setParameter("COLOR", samsung.getColor());
			query.setParameter("PRICE", samsung.getPrice());
			query.setParameter("RAM", samsung.getRam());
			query.setParameter("IS_FINGER_PRINT_SUPPORTED", samsung.isIs_Finger_Print_Supported());
			query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("All Data is updated Sucessfully,,,,,,,,,");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed,,,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,,,,");
			}
			SessionFactoryProvider.closeSessionFactory();
		}

	}

	@Override
	public void deleteSamsungDetailsByID(int id) {
		System.out.println("SamsungDaoImpl.deleteSamsungDetailsByID()");
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			sessionFactory = SessionFactoryProvider.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hqlQuery = "delete from Samsung where id=:ID";
			Query<Samsung> query = session.createQuery(hqlQuery);
			query.setParameter("ID", id);
			query.executeUpdate();
			session.getTransaction().commit();
			System.out.println("Data is deleted sucessfully,,,,,,,,,,");
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session is closed,,,,,,,,,,,");
			} else {
				System.out.println("session is not closed,,,,,,,,,");
			}
			SessionFactoryProvider.closeSessionFactory();
		}

	}
}
