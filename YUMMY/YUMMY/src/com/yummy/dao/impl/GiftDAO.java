package com.yummy.dao.impl;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.pojo.Gift;

/**
 	* A data access object (DAO) providing persistence and search support for Gift entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.yummy.pojo.Gift
  * @author MyEclipse Persistence Tools 
 */

public class GiftDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(GiftDAO.class);
		//property constants
	public static final String GIFT_NAME = "giftName";
	public static final String GRADE = "grade";
	public static final String ACCOUNT = "account";



	protected void initDao() {
		//do nothing
	}
    
    public void save(Gift transientInstance) {
        log.debug("saving Gift instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Gift persistentInstance) {
        log.debug("deleting Gift instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Gift findById( java.lang.Integer id) {
        log.debug("getting Gift instance with id: " + id);
        try {
            Gift instance = (Gift) getHibernateTemplate()
                    .get("com.yummy.pojo.Gift", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Gift instance) {
        log.debug("finding Gift instance by example");
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
      log.debug("finding Gift instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Gift as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByGiftName(Object giftName
	) {
		return findByProperty(GIFT_NAME, giftName
		);
	}
	
	public List findByGrade(Object grade
	) {
		return findByProperty(GRADE, grade
		);
	}
	
	public List findByAccount(Object account
	) {
		return findByProperty(ACCOUNT, account
		);
	}
	

	public List findAll() {
		log.debug("finding all Gift instances");
		try {
			String queryString = "from Gift";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Gift merge(Gift detachedInstance) {
        log.debug("merging Gift instance");
        try {
            Gift result = (Gift) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Gift instance) {
        log.debug("attaching dirty Gift instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Gift instance) {
        log.debug("attaching clean Gift instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static GiftDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (GiftDAO) ctx.getBean("GiftDAO");
	}
}