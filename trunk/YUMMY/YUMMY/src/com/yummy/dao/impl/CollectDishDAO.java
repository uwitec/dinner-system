package com.yummy.dao.impl;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.pojo.CollectDish;

/**
 	* A data access object (DAO) providing persistence and search support for CollectDish entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.yummy.pojo.CollectDish
  * @author MyEclipse Persistence Tools 
 */

public class CollectDishDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(CollectDishDAO.class);
		//property constants
	public static final String TAG = "tag";



	protected void initDao() {
		//do nothing
	}
    
    public void save(CollectDish transientInstance) {
        log.debug("saving CollectDish instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(CollectDish persistentInstance) {
        log.debug("deleting CollectDish instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public CollectDish findById( java.lang.Integer id) {
        log.debug("getting CollectDish instance with id: " + id);
        try {
            CollectDish instance = (CollectDish) getHibernateTemplate()
                    .get("com.yummy.pojo.CollectDish", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(CollectDish instance) {
        log.debug("finding CollectDish instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding CollectDish instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from CollectDish as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByTag(Object tag
	) {
		return findByProperty(TAG, tag
		);
	}
	

	public List findAll() {
		log.debug("finding all CollectDish instances");
		try {
			String queryString = "from CollectDish";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public CollectDish merge(CollectDish detachedInstance) {
        log.debug("merging CollectDish instance");
        try {
            CollectDish result = (CollectDish) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(CollectDish instance) {
        log.debug("attaching dirty CollectDish instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(CollectDish instance) {
        log.debug("attaching clean CollectDish instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static CollectDishDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (CollectDishDAO) ctx.getBean("CollectDishDAO");
	}
}