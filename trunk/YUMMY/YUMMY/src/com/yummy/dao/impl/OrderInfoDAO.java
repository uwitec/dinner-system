package com.yummy.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.pojo.OrderInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * OrderInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.yummy.pojo.OrderInfo
 * @author MyEclipse Persistence Tools
 */

public class OrderInfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(OrderInfoDAO.class);
	// property constants
	public static final String ACCOUNT = "account";

	protected void initDao() {
		// do nothing
	}

	public void save(OrderInfo transientInstance) {
		log.debug("saving OrderInfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OrderInfo persistentInstance) {
		log.debug("deleting OrderInfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OrderInfo findById(java.lang.Integer id) {
		log.debug("getting OrderInfo instance with id: " + id);
		try {
			OrderInfo instance = (OrderInfo) getHibernateTemplate().get(
					"com.yummy.pojo.OrderInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(OrderInfo instance) {
		log.debug("finding OrderInfo instance by example");
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
		log.debug("finding OrderInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from OrderInfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAccount(Object account) {
		return findByProperty(ACCOUNT, account);
	}

	public List findAll() {
		log.debug("finding all OrderInfo instances");
		try {
			String queryString = "from OrderInfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public OrderInfo merge(OrderInfo detachedInstance) {
		log.debug("merging OrderInfo instance");
		try {
			OrderInfo result = (OrderInfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(OrderInfo instance) {
		log.debug("attaching dirty OrderInfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OrderInfo instance) {
		log.debug("attaching clean OrderInfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrderInfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OrderInfoDAO) ctx.getBean("OrderInfoDAO");
	}
}