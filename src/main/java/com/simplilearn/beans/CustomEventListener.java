package com.simplilearn.beans;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener{

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("event is handled !");
		System.out.println("Event : "+event.toString());
	}

}
