package com.limited.app.service;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.limited.app.db.dao.AssetMapper;
import com.opensymphony.xwork2.interceptor.annotations.After;

public class AssetServiceTest {
	
	private static AssetService assetService;
	@BeforeClass
	public static void setUp() throws Exception {
		Resource res = new ClassPathResource("application-config.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		assetService = (AssetService)factory.getBean("assetService");
		AssetMapper assetMapper=(AssetMapper)factory.getBean("assetMapper");
		assetService.setAssetMapper(assetMapper);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCount() {
		int result = assetService.getCount();
		System.out.println("count:" + result);
	}

	@Test
	public void testDeleteByID() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetByID() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
