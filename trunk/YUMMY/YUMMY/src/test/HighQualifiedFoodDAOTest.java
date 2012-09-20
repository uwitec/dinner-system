package test;

import java.util.List;

import org.testng.Assert;

import com.yummy.dao.impl.HighQualifiedFoodDAO;

import junit.framework.TestCase;

public class HighQualifiedFoodDAOTest extends TestCase {

	public void testGetHighQualifiedFoods() {
		HighQualifiedFoodDAO test = new HighQualifiedFoodDAO();
		List foods = test.getHighQualifiedFoods();
		Assert.assertEquals(0, foods.size());
	}

}
