package com.jyf.config;

import org.nutz.dao.impl.NutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenterImpl {

	@Autowired
	private NutDao nutDao;
	
	/**
	   *  事件监听器
	 * @param eventImpl
	 */
	@EventListener
	public void event(EventImpl eventImpl) {
		eventImpl.createTable(nutDao);
	}
}
