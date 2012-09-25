package com.yummy.dao.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.pojo.Order;


/**
 * A data access object (DAO) providing persistence and search support for Order
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.yummy.pojo.Order
 * @author MyEclipse Persistence Tools
 */

public class OrderDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(OrderDAO.class);
	// property constants
	public static final String STATUS = "status";
	public static final String TOTAL_PRICE = "totalPrice";
	public static final String MESSAGE = "message";
	public static final String GRADE = "grade";

	protected void initDao() {
		// do nothing
	}

	public void save(Order transientInstance) {
		log.debug("saving Order instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Order persistentInstance) {
		log.debug("deleting Order instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Order findById(java.lang.Integer id) {
		log.debug("getting Order instance with id: " + id);
		try {
			Order instance = (Order) getHibernateTemplate().get("test.Order",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Order instance) {
		log.debug("finding Order instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Order instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Order as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByTotalPrice(Object totalPrice) {
		return findByProperty(TOTAL_PRICE, totalPrice);
	}

	public List findByMessage(Object message) {
		return findByProperty(MESSAGE, message);
	}

	public List findByGrade(Object grade) {
		return findByProperty(GRADE, grade);
	}

	public List findAll() {
		log.debug("finding all Order instances");
		try {
			String queryString = "from Order";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Order merge(Order detachedInstance) {
		log.debug("merging Order instance");
		try {
			Order result = (Order) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Order instance) {
		log.debug("attaching dirty Order instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Order instance) {
		log.debug("attaching clean Order instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrderDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OrderDAO) ctx.getBean("OrderDAO");
	}
	
	public int saveOrder(int customerInfoID, float f, String message, String shopname, String username) {
		Timestamp time = new Timestamp(new Date().getTime());
		String insertSQL = "insert into `order` values(null, '" + time +"', '"+ 1 +
		"', '"+ customerInfoID +"', '"+ f +"', '" + message + "', '" + (int)f + "', '" + shopname +"', '" + username + "')";
//		System.out.println("3. " + insertSQL);
		SQLQuery query = getSession().createSQLQuery(insertSQL);
		query.executeUpdate();
//		System.out.println("4. 已将订单基本信息插入数据库");
		
		String searchSQL = "select order_id from `order` where order_time = '" + time + "' and user_info = '" +
					customerInfoID + "'";
//		System.out.println("5. " +searchSQL);
		query = getSession().createSQLQuery(searchSQL);
//		System.out.println("6. 已将订单详细信息插入数据库");
		return (Integer) query.list().get(0);
	}

	public List getCurrentOrder(String username) {
		// TODO Auto-generated method stub
		return queryByStatus(username, 1);
	}

	public List getFinishedOrder(String username) {
		// TODO Auto-generated method stub
		return queryByStatus(username, 5);
	}

	public List queryByStatus(String username, int type) {
		String querySQL = "select order_id, order_time, user_info, total_price, shopname from " +
					"`order` where username = ? and status = ?";
//				System.out.println("1. 查询订单语句：" + querySQL);
				SQLQuery query = getSession().createSQLQuery(querySQL);
				query.setParameter(0, username);
				query.setParameter(1, type);
				return query.list();
	}
}