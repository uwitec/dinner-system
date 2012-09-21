package com.yummy.dao.impl;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.pojo.GiftExchange;

/**
 * A data access object (DAO) providing persistence and search support for
 * GiftExchange entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.yummy.pojo.GiftExchange
 * @author MyEclipse Persistence Tools
 */

public class GiftExchangeDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(GiftExchangeDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(GiftExchange transientInstance) {
		log.debug("saving GiftExchange instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GiftExchange persistentInstance) {
		log.debug("deleting GiftExchange instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public GiftExchange findById(java.lang.Integer id) {
		log.debug("getting GiftExchange instance with id: " + id);
		try {
			GiftExchange instance = (GiftExchange) getHibernateTemplate().get(
					"com.yummy.pojo.GiftExchange", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(GiftExchange instance) {
		log.debug("finding GiftExchange instance by example");
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
		log.debug("finding GiftExchange instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from GiftExchange as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all GiftExchange instances");
		try {
			String queryString = "from GiftExchange";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public GiftExchange merge(GiftExchange detachedInstance) {
		log.debug("merging GiftExchange instance");
		try {
			GiftExchange result = (GiftExchange) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(GiftExchange instance) {
		log.debug("attaching dirty GiftExchange instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(GiftExchange instance) {
		log.debug("attaching clean GiftExchange instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static GiftExchangeDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (GiftExchangeDAO) ctx.getBean("GiftExchangeDAO");
	}
}