package com.yummy.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.yummy.dao.IShopWorkerDAO;
import com.yummy.pojo.ShopWorker;

/**
 * A data access object (DAO) providing persistence and search support for
 * ShopWorker entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.yummy.pojo.ShopWorker
 * @author MyEclipse Persistence Tools
 */

public class ShopWorkerDAO extends HibernateDaoSupport implements IShopWorkerDAO{
	private static final Logger log = LoggerFactory
			.getLogger(ShopWorkerDAO.class);
	// property constants
	public static final String PASSWORD = "password";
	public static final String EMAIL = "email";
	public static final String REGISTER_DATE = "registerDate";

	protected void initDao() {
		// do nothing
	}

	public void save(String username, String shopName, String password, String email,String registerDate) throws SQLException {
//		log.debug("saving ShopWorker instance");
//		try {
//			getHibernateTemplate().save(transientInstance);
//			log.debug("save successful");
//		} catch (RuntimeException re) {
//			log.error("save failed", re);
//			throw re;
//		}
		
//        Connection conn = (Connection) getHibernateTemplate().getSessionFactory().openSession(); 
//        Statement st=(Statement) conn.createStatement();
//        
//        
//        String sql = "insert into shop_worker("+username+","+password+","+shopName+","+email+","+registerDate+")";
//        st.execute(sql);
//           try{
//            if(st!=null)
//             st.close();
//            if(conn!=null)
//             conn.close();
//           }catch(Exception e){
//            System.out.println(e.toString());
//           }
//		
		
		String sql = "insert into `shop_worker` values( ?, ?, ?, ?, ?)";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setParameter(0, username);
		query.setParameter(1, password);
        query.setParameter(2, shopName);
        query.setParameter(3, email);
        query.setParameter(4, registerDate);
		query.executeUpdate();
	}

	public void delete(ShopWorker persistentInstance) {
		log.debug("deleting ShopWorker instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ShopWorker findById(java.lang.String id) {
		log.debug("getting ShopWorker instance with id: " + id);
		try {
			ShopWorker instance = (ShopWorker) getHibernateTemplate().get(
					"com.yummy.pojo.ShopWorker", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ShopWorker instance) {
		log.debug("finding ShopWorker instance by example");
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
		log.debug("finding ShopWorker instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ShopWorker as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByRegisterDate(Object registerDate) {
		return findByProperty(REGISTER_DATE, registerDate);
	}

	public List findAll() {
		log.debug("finding all ShopWorker instances");
		try {
			String queryString = "from ShopWorker";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ShopWorker merge(ShopWorker detachedInstance) {
		log.debug("merging ShopWorker instance");
		try {
			ShopWorker result = (ShopWorker) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ShopWorker instance) {
		log.debug("attaching dirty ShopWorker instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ShopWorker instance) {
		log.debug("attaching clean ShopWorker instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ShopWorkerDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ShopWorkerDAO) ctx.getBean("ShopWorkerDAO");
	}

	public ShopWorker findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(ShopWorker shopWorker) {
		// TODO Auto-generated method stub
		
	}

	public void save(ShopWorker transientInstance) {
		// TODO Auto-generated method stub
		
	}
}