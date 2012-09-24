package com.yummy.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.pojo.CustomerInfo;

/**
 	* A data access object (DAO) providing persistence and search support for CustomerInfo entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.yummy.pojo.CustomerInfo
  * @author MyEclipse Persistence Tools 
 */

public class CustomerInfoDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(CustomerInfoDAO.class);
		//property constants
	public static final String TELEPHONE = "telephone";
	public static final String ADDRESS = "address";



	protected void initDao() {
		//do nothing
	}
    
    public void save(CustomerInfo transientInstance) {
        log.debug("saving CustomerInfo instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(CustomerInfo persistentInstance) {
        log.debug("deleting CustomerInfo instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public CustomerInfo findById( java.lang.Integer id) {
        log.debug("getting CustomerInfo instance with id: " + id);
        try {
            CustomerInfo instance = (CustomerInfo) getHibernateTemplate()
                    .get("com.yummy.pojo.CustomerInfo", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    /**
     * 
     * findByExample:根据用户名返回其填写过的地址. <br/> 
     * 
     * @author jiahui 
     * @param instance
     * @return
     */
    public List findByUsername(String username) {
        log.debug("finding CustomerInfo instance by example");
        try {
        	String sql = "select * from `customer_info` where username = ?";
        	Query query = getSession().createSQLQuery(sql);
        	query.setParameter(0, username);
        	List temp = query.list();
        	if (temp != null) {
        		List<CustomerInfo> infos = new ArrayList<CustomerInfo>();
        		for (int i = 0; i < temp.size(); i++) {
        			Object[] tempInfo = (Object[]) temp.get(i);
					CustomerInfo info = new CustomerInfo((String)tempInfo[2], (String)tempInfo[3]);
					infos.add(info);
				}
        		return infos;
			}
        	
        	return null;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }  
    
    
    public List findByExample(CustomerInfo instance) {
        log.debug("finding CustomerInfo instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public int saveCustomerInfo(String username, String telephone, String address) {
    	String sql = "insert into customer_info values(null,'" + username +
    			"','" + telephone + "','" + address +"')";
    	System.out.println(sql);
    	SQLQuery query = getSession().createSQLQuery(sql);
    	
    	query.executeUpdate();
  
    	
    	String searchSQL = "select id from customer_info where username ='" + username +
    			"' and telephone ='" + telephone + "' and address ='" + address +"'";
    	query = getSession().createSQLQuery(searchSQL);
    	System.out.println("1. " + searchSQL);
    	System.out.println("2. === " + query.list());
    	return (Integer) query.list().get(0);
    }
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding CustomerInfo instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from CustomerInfo as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByTelephone(Object telephone
	) {
		return findByProperty(TELEPHONE, telephone
		);
	}
	
	public List findByAddress(Object address
	) {
		return findByProperty(ADDRESS, address
		);
	}
	

	public List findAll() {
		log.debug("finding all CustomerInfo instances");
		try {
			String queryString = "from CustomerInfo";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public CustomerInfo merge(CustomerInfo detachedInstance) {
        log.debug("merging CustomerInfo instance");
        try {
            CustomerInfo result = (CustomerInfo) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(CustomerInfo instance) {
        log.debug("attaching dirty CustomerInfo instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(CustomerInfo instance) {
        log.debug("attaching clean CustomerInfo instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static CustomerInfoDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (CustomerInfoDAO) ctx.getBean("CustomerInfoDAO");
	}
}