package com.yummy.dao.impl;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.pojo.CollectShop;

/**
 * A data access object (DAO) providing persistence and search support for
 * CollectShop entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.yummy.pojo.CollectShop
 * @author MyEclipse Persistence Tools
 */

public class CollectShopDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(CollectShopDAO.class);
	// property constants
	public static final String TAG = "tag";

	protected void initDao() {
		// do nothing
	}

	public void save(CollectShop transientInstance) {
		log.debug("saving CollectShop instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CollectShop persistentInstance) {
		log.debug("deleting CollectShop instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CollectShop findById(java.lang.Integer id) {
		log.debug("getting CollectShop instance with id: " + id);
		try {
			CollectShop instance = (CollectShop) getHibernateTemplate().get(
					"com.yummy.pojo.CollectShop", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CollectShop instance) {
		log.debug("finding CollectShop instance by example");
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
		log.debug("finding CollectShop instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CollectShop as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTag(Object tag) {
		return findByProperty(TAG, tag);
	}

	public List findAll() {
		log.debug("finding all CollectShop instances");
		try {
			String queryString = "from CollectShop";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CollectShop merge(CollectShop detachedInstance) {
		log.debug("merging CollectShop instance");
		try {
			CollectShop result = (CollectShop) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CollectShop instance) {
		log.debug("attaching dirty CollectShop instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CollectShop instance) {
		log.debug("attaching clean CollectShop instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CollectShopDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (CollectShopDAO) ctx.getBean("CollectShopDAO");
	}
}