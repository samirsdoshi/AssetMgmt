package com.limited.app.service;

import static org.junit.Assert.fail;

import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.limited.app.bean.Alloctype;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-config.xml"})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
public class AlloctypeServiceTest extends AbstractTransactionalJUnit4SpringContextTests{
	@Autowired
	private AlloctypeService allocTypeService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Resource res = new ClassPathResource("application-config.xml");
		//XmlBeanFactory factory = new XmlBeanFactory(res);
		//allocTypeService = (AlloctypeService)factory.getBean("alloctypeService");
		//AlloctypeMapper allocTypeMapper=(AlloctypeMapper)factory.getBean("alloctypeMapper");
		//allocTypeService.setAllocTypeMapper(allocTypeMapper);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCount() {
		//Integer result=allocTypeService.getCount();
		//System.out.println(result);
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
	@Rollback(true)
	public void testInsert() throws Exception {
		Alloctype a=new Alloctype();
		a.setDescription("test");
		
		Alloctype a1=new Alloctype();
		a1.setDescription("test1");
		
		allocTypeService.insert(a);
		System.out.println("Added: " + a.getId());
		allocTypeService.insert(a1);
		System.out.println("Added: " + a1.getId());

	}

	@Test
	public void testgetByDesc(){
		Assert.assertNotNull(allocTypeService);
		List<Alloctype> l = allocTypeService.getByDescription("Cash");
		for (Alloctype a:l){
			System.out.println(a.getId() + ":" +a.getDescription());
		}
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
