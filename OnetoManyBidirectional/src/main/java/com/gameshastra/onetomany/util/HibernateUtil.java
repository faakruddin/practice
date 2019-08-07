package com.gameshastra.onetomany.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory factory = null;
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	static {
		Configuration cfg = new Configuration().configure("com/gameshastra/onetomany/cfg/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
	}

	public static Session getSession() {
		Session session = null;

		if (threadLocal.get() == null) {
			session = factory.openSession();
		} else {
			session = threadLocal.get();
		}
		return session;
	}

	public static void closeSession() {

		if (threadLocal.get() != null) {
			threadLocal.get().close();
		}
	}

}
