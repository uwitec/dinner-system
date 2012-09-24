package com.yummy.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.dao.IDishDAO;
import com.yummy.pojo.Dish;

/**
 * A data access object (DAO) providing persistence and search support for Dish
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.yummy.pojo.Dish
 * @author MyEclipse Persistence Tools
 */

public class DishDAO extends HibernateDaoSupport implements IDishDAO{
	private static final Logger log = LoggerFactory.getLogger(DishDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String POINT = "point";
	public static final String PRICE = "price";
	public static final String INTRODUCTION = "introduction";
	public static final String CATEGORY = "category";
	public static final String TAG = "tag";
	public static final String PIC_ONE = "picOne";
	public static final String PIC_TWO = "picTwo";
	public static final String PIC_THREE = "picThree";

	protected void initDao() {
		// do nothing
	}

	public void save(Dish transientInstance) {
		log.debug("saving Dish instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Dish persistentInstance) {
		log.debug("deleting Dish instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Dish findById(java.lang.Integer id) {
		log.debug("getting Dish instance with id: " + id);
		try {
			Dish instance = (Dish) getHibernateTemplate().get(
					"com.yummy.pojo.Dish", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Dish instance) {
		log.debug("finding Dish instance by example");
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
		log.debug("finding Dish instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dish as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByPoint(Object point) {
		return findByProperty(POINT, point);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByIntroduction(Object introduction) {
		return findByProperty(INTRODUCTION, introduction);
	}

	public List findByCategory(Object category) {
		return findByProperty(CATEGORY, category);
	}

	public List findByTag(Object tag) {
		return findByProperty(TAG, tag);
	}

	public List findByPicOne(Object picOne) {
		return findByProperty(PIC_ONE, picOne);
	}

	public List findByPicTwo(Object picTwo) {
		return findByProperty(PIC_TWO, picTwo);
	}

	public List findByPicThree(Object picThree) {
		return findByProperty(PIC_THREE, picThree);
	}

	public List findAll() {
		log.debug("finding all Dish instances");
		try {
			String queryString = "from Dish";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Dish merge(Dish detachedInstance) {
		log.debug("merging Dish instance");
		try {
			Dish result = (Dish) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Dish instance) {
		log.debug("attaching dirty Dish instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Dish instance) {
		log.debug("attaching clean Dish instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DishDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DishDAO) ctx.getBean("DishDAO");
	}

	public List selectAllByShop(String shopName) {
		// TODO Auto-generated method stub
		log.debug("finding all Dish instances");
		try {
			String queryString = "from Dish where shopname='"+shopName+"'";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public void updateById(int id) {
		// TODO Auto-generated method stub
		
	}
}