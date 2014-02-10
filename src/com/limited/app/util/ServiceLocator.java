package com.limited.app.util;

import java.util.Properties;
import java.util.ResourceBundle;

import com.limited.app.service.BaseService;

public class ServiceLocator{
	
	static ResourceBundle bundle=null;
	static{
		bundle=ResourceBundle.getBundle("asset");
	}
	public static BaseService getService(String serviceName) throws Exception{
		return (BaseService)Class.forName(serviceName).newInstance();
	}

	public static String getProp(String key){
		return bundle.getString(key);
	}
	
}
