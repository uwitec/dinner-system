package com.yummy.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.pojo.Estimate;

/**
 	* A data access object (DAO) providing persistence and search support for Estimate entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.yummy.pojo.Estimate
  * @author MyEclipse Persistence Tools 
 */

public class EstimateDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(EstimateDAO.class);
		//property constants
	public static final String POINT = "point";
	public static final String COMMENT = "comment";



	protected void initDao() {
		//do nothing
	}
    
    public void save(Estimate transientInstance) {
        log.debug("saving Estimate instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Estimate persistentInstance) {
        log.debug("deleting Estimate instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Estimate findById( java.lang.Integer id) {
        log.debug("getting Estimate instance with id: " + id);
        try {
            Estimate instance = (Estimate) getHibernateTemplate()
                    .get("com.yummy.pojo.Estimate", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Estimate instance) {
        log.debug("finding Estimate instance by example");
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
      log.debug("finding Estimate instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Estimate as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByPoint(Object point
	) {
		return findByProperty(POINT, point
		);
	}
	
	public List findByComment(Object comment
	) {
		return findByProperty(COMMENT, comment
		);
	}
	

	public List findAll() {
		log.debug("finding all Estimate instances");
		try {
			String queryString = "from Estimate";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Estimate merge(Estimate detachedInstance) {
        log.debug("merging Estimate instance");
        try {
            Estimate result = (Estimate) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Estimate instance) {
        log.debug("attaching dirty Estimate instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Estimate instance) {
        log.debug("attaching clean Estimate instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static EstimateDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (EstimateDAO) ctx.getBean("EstimateDAO");
	}
}