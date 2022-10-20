package com.smart.phone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HiMart implements ElecShop{
	@Autowired
	Gallaxy[] gallaxy;
	
	@Autowired
	IPhone[] iPhone;

	@Override
	public void productList() {
		for (SmartPhone smartPhone : gallaxy) {
			smartPhone.info();
		}
		
		for (SmartPhone smartPhone : iPhone) {
			smartPhone.info();
		}
	}
}
