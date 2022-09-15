package com.ui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ObjectTest {

	public static void main(String[] args) {
		Frame f = new Frame("frame test"); // 창
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		
		Button b1 = new Button("OK"); // 버튼
		Button b2 = new Button("CANCLE"); // 버튼
		Checkbox cb1 = new Checkbox("spring", true);
		Checkbox cb2 = new Checkbox("summer");
		
		f.add(b1); // 창에 버튼을 붙임
		f.add(b2); // 창에 버튼을 붙임
		f.add(cb1);
		f.add(cb2);
		
		f.setSize(300, 300);
		f.setVisible(true);
		
	}
}
