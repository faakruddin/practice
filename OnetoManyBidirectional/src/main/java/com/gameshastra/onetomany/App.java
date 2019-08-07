package com.gameshastra.onetomany;

import org.hibernate.Session;

import com.gameshastra.entity.AvatarsRankEntity;
import com.gameshastra.entity.ShopInventoryEntity;
import com.gameshastra.entity.UserDetails;
import com.gameshastra.onetomany.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Session session = null;
		org.hibernate.Transaction tx = null;
		ShopInventoryEntity shopEntity = null;
		UserDetails user = null;

		try {

			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			// shopEntity(session);

			user = session.load(UserDetails.class, 539137679);
			System.out.println("user details " + user);
			System.out.println("Daily rewards entity :::" + user.getDailyRewards());
			System.out.println("inventory transaction entity ::" + user.getInvenEntity());

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			// HibernateUtil.closeSession();
		}
	}

	private static void shopEntity(Session session) {
		ShopInventoryEntity shopEntity;
		shopEntity = session.load(ShopInventoryEntity.class, 4);
		System.out.println(shopEntity);

		shopEntity.getRanks().forEach(avatarranks -> {
			System.out.println(avatarranks);
		});
		System.out.println("Removed entity " + shopEntity.getRanks().remove(0));

		AvatarsRankEntity ranks = session.load(AvatarsRankEntity.class, 16);
		System.out.println("ranks ::::::" + ranks);
	}
}
