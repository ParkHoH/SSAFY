package com.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UITest {

	public static void main(String[] args) {

		JFrame f = new JFrame("UI TEST");
//		f.setLayout(new FlowLayout()); // f 안에 내용물들을 어떤 방식으로 배치할 건지 지정. 붙이는 순서대로 화면에 나타남.
		f.setLayout(new BorderLayout()); // 전체 화면을 동서남북 중앙으로 나눠서 관리

		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		JLabel la = new JLabel("Cute Chat", JLabel.CENTER);
		la.setFont(font);

		JButton ok = new JButton("OK");
		JButton cancle = new JButton("CANCLE");
		JTextField tf = new JTextField(20); // 한줄 입력칸
		JTextArea ta = new JTextArea(10, 20); //
		ta.setEditable(false); // 수정 불가
		JScrollPane pane = new JScrollPane(ta); // scrollpane 위로 textarea가 올라가게 됨

//		flow 레이아웃일 때 사용
//		f.add(ok);
//		f.add(cancle);
//		f.add(tf);
//		f.add(pane);

		f.add(la, "North");
//		f.add(ok, "North");
		f.add(cancle, "East");
		f.add(tf, "South");
		f.add(pane, "Center");

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 눌렀을 때 동작 지정. 프로그램 종료(static)
		f.setSize(400, 500); // 사이즈
		f.setVisible(true); // 실행 시에 창이 눈에 보이도록 지정

		tf.requestFocus(); // 커서를 해당 위치로 이동

	}

}
