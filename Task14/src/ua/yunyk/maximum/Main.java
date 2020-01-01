package ua.yunyk.maximum;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Manage manage = new Manage();
		while(true) {
			menu();
			String key = s.next();
		switch (key) {
			case "1":
				manage.add();
				break;
			case "2":
				manage.remove();
				break;
			case "3":
				manage.replace();
				break;
			case "4":
				manage.sortByName();
				break;
			case "5":
				manage.sortByLength();
				break;
			case "6":
				manage.sortByWidth();
				break;
			case "7":
				manage.sortByWeight();
				break;
			case "8":
				manage.printElement();
				break;
			case "9":
				manage.printAll();
				break;
			case "10":
				System.exit(0);
				break;
			default:
				System.out.println("������ 1-10");
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("�������� 1 ��� ������ �����");
		System.out.println("�������� 2 ��� �������� �����");
		System.out.println("�������� 3 ��� ������� �����");
		System.out.println("�������� 4 ��� ��������� �� �������");
		System.out.println("�������� 5 ��� ��������� �� ��������");
		System.out.println("�������� 6 ��� ��������� �� �������");
		System.out.println("�������� 7 ��� ��������� �� �����");
		System.out.println("�������� 8 ��� ������� �-��� ������� ��������");
		System.out.println("�������� 9 ��� ������� �� ������");
		System.out.println("�������� 10 ��� ����� � ��������");
	}
	
}
