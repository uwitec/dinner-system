package test.com.yummy.dao.impl;

import com.yummy.dao.impl.SearchDAO;

import junit.framework.TestCase;

public class SearchDAOTest extends TestCase {

	public void testGetFoods() {
		new SearchDAO().getFoods("d");
	}

}
