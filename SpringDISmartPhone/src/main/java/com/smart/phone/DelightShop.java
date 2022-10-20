package com.smart.phone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DelightShop implements ElecShop{
	@Autowired
	Gallaxy[] gallaxy;
	
	@Override
	public void productList() {
		for (SmartPhone smartPhone : gallaxy) {
			smartPhone.info();
		}
	}
}
