package com.water.ch3.aware;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	
	private ResourceLoader loader;
	
	
	
	public ResourceLoader getLoader() {
		return loader;
	}

	public void setLoader(ResourceLoader loader) {
		this.loader = loader;
	}

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		this.beanName = beanName;
	}
	
	public void outputResult() {
		System.out.println("bean的名称为:" + beanName);
		
		//不能加载决定路径的文件
		//Resource resource = loader.getResource("C:\\Users\\zhaoguofu\\Desktop\\1.txt");
		Resource resource = loader.getResource("classpath:com\\water\\ch3\\aware\\1.txt");
		
		try {
			InputStream in = resource.getInputStream();
			String inStr = IOUtils.toString(in);
			System.out.println("ResourceLoader加载文件内容为:" + inStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
