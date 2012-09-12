package com.yummy.dao.impl;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.pojo.HotFood;


/**
 * A data access object (DAO) providing persistence and search support for
 * HotFood entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.yummy.pojo.HotFood
 * @author MyEclipse Persistence Tools
 */

public class HotFoodDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(HotFoodDAO.class);
	// property constants
	public static final String CURRENT_PRICE = "currentPrice";
	public static final String ACCOUNT = "account";

	protected void initDao() {
		// do nothing
	}

	public void save(HotFood transientInstance) {
		log.debug("saving HotFood instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(HotFood persistentInstance) {
		log.debug("deleting HotFood instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public HotFood findById(java.lang.Integer id) {
		log.debug("getting HotFood instance with id: " + id);
		try {
			HotFood instance = (HotFood) getHibernateTemplate().get(
					"com.yummy.dao.HotFood", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(HotFood instance) {
		log.debug("finding HotFood instance by example");
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
		log.debug("finding HotFood instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from HotFood as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCurrentPrice(Object currentPrice) {
		return findByProperty(CURRENT_PRICE, currentPrice);
	}

	public List findByAccount(Object account) {
		return findByProperty(ACCOUNT, account);
	}

	public List findAll() {
		log.debug("finding all HotFood instances");
		try {
			String queryString = "from HotFood";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public HotFood merge(HotFood detachedInstance) {
		log.debug("merging HotFood instance");
		try {
			HotFood result = (HotFood) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(HotFood instance) {
		log.debug("attaching dirty HotFood instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(HotFood instance) {
		log.debug("attaching clean HotFood instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HotFoodDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HotFoodDAO) ctx.getBean("HotFoodDAO");
	}
}