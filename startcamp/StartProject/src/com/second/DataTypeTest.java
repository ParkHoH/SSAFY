package com.second;

// ���� �ڵ� ����: ��Ʈ�� + ����Ʈ + F
// java���� ����ϴ� �����͵��� ����
// �����: ���ֻ����� ǥ��
// �ĺ���(Ŭ����, ����, �޼ҵ� �̸� ��): ������ �� ��. ���ڷ� �����ؾ� ��.
public class DataTypeTest {
	public static void main(String[] args) {
		
		// ����
		boolean flag = false;
		boolean flag2 = true;
		System.out.println(flag || flag2);
		
		
		// ������
		byte b = 127; // 1 ����Ʈ
//		b = b - 1; 
		// ���� ���ͷ��� ���꿡 ���Ǵ� ��쿡�� �⺻������ 4 byte�� �������. => ũ�Ⱑ ���� �ʱ� ������ ���� �߻�
		int b2 = b + 1; // 1��° �ذ� ���
		b = (byte)(b + 1); // 2��° �ذ� ���: �� ��ȯ
		
		short s = 12345; // 2 ����Ʈ
		int i = 7890; // 4 ����Ʈ
		long l = 200000000000L; // 8 ����Ʈ
		// char c = 78; 
		// �̷��� ����ϱ� ���ٴ� �Ʒ�ó�� ���
		char c = 'c'; // 2 ����Ʈ. ������. �� ���� ���忡 ���
		System.out.println("b:" + b);
		System.out.println("s:" + s);
		System.out.println("i:" + i);
		System.out.println("l:" + l);
		System.out.println("c:" + c);
		
		
		// �Ǽ���
//		float f = 3.14;
		// �Ǽ� ���ͷ��� ������ �Ҵ��ϴ� ��쿡 �⺻������ 8 ����Ʈ�� �������. => ũ�Ⱑ ���� �ʱ� ������ ���� �߻�
		float f = 3.14f; // == (float)3.14;
		double d = 8.92;
		System.out.println(f);
		System.out.println(d);
		
		
		// ������
		String name = "tommy";
		System.out.println(name);
		
	}
}
