package com.yummy.dao;

import java.util.List;

import com.yummy.pojo.Shop;

public interface IShopDAO {

	public abstract void save(Shop transientInstance);

	public abstract void delete(Shop persistentInstance);

	public abstract Shop findById(java.lang.String id);

	public abstract List findAll();

}