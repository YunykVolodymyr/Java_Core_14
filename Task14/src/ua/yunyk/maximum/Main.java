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
				System.out.println("Введіть 1-10");
				break;
			}
		}
	}
	
	public static void menu() {
		System.out.println("Натисніть 1 щоб додати товар");
		System.out.println("Натисніть 2 щоб видалити товар");
		System.out.println("Натисніть 3 щоб замінити товар");
		System.out.println("Натисніть 4 щоб сортувати за назвоню");
		System.out.println("Натисніть 5 щоб сортувати за довжиною");
		System.out.println("Натисніть 6 щоб сортувати за шириною");
		System.out.println("Натисніть 7 щоб сортувати за вагою");
		System.out.println("Натисніть 8 щоб вивести і-тий елемент колекції");
		System.out.println("Натисніть 9 щоб вивести всі товари");
		System.out.println("Натисніть 10 щоб вийти з програми");
	}
	
}
