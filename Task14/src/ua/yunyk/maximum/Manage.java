package ua.yunyk.maximum;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Manage {

	private Set<Commodity> commodities = new LinkedHashSet<Commodity>();
	
	public void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("������ �����");
			String name = s.next();
		System.out.println("������ �������");
			double length = s.nextDouble();
		System.out.println("������ ������");
			double width = s.nextDouble();
		System.out.println("������ ����");
			double weight = s.nextDouble();
	
		commodities.add(new Commodity(name, length, width, weight));
	}
	
	public void remove() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ �����");
			String name = s.next();
		System.out.println("������ �������");
			double length = s.nextDouble();
		System.out.println("������ ������");
			double width = s.nextDouble();
		System.out.println("������ ����");
			double weight = s.nextDouble();
			
		Iterator<Commodity> iterator = commodities.iterator();
		
		while(iterator.hasNext()) {
			Commodity next = iterator.next();
			if(next.getName().equalsIgnoreCase(name) && next.getWeight() == weight
				&& next.getLength() == length && next.getWidth() == width) {
				iterator.remove();
			}
		}
		
	}

	public void replace() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("������ ����� ������� ������");
			String name = s.next();
		System.out.println("������ ������� ������� ������");
			double length = s.nextDouble();
		System.out.println("������ ������ ������� ������");
			double width = s.nextDouble();
		System.out.println("������ ���� ������� ������");
			double weight = s.nextDouble();
		
			Iterator<Commodity> iterator = commodities.iterator();
			
			while(iterator.hasNext()) {
				Commodity next = iterator.next();
				if(next.getName().equalsIgnoreCase(name) && next.getWeight() == weight
					&& next.getLength() == length && next.getWidth() == width) {
					
					System.out.println("������ ����� ������ ������");
						next.setName(s.next());
					System.out.println("������ ������� ������ ������");
						next.setLength(s.nextDouble());
					System.out.println("������ ������ ������ ������");
						next.setWidth(s.nextDouble());
					System.out.println("������ ���� ������ ������");
						next.setWeight(s.nextDouble());
						
				}
			}
	}
	
	public void sortByName() {
		List<Commodity> list = new ArrayList<Commodity>();
		list.addAll(commodities);
		list.sort(new CommodityNameComparator());
		commodities.clear();
		commodities.addAll(list);
	}
	
	public void sortByLength() {
		List<Commodity> list = new ArrayList<Commodity>();
		list.addAll(commodities);
		list.sort(new CommodityLengthComparator());
		commodities.clear();
		commodities.addAll(list);
	}
	
	public void sortByWidth() {
		List<Commodity> list = new ArrayList<Commodity>();
		list.addAll(commodities);
		list.sort(new CommodityWidthComparator());
		commodities.clear();
		commodities.addAll(list);
	}
	
	public void sortByWeight() {
		List<Commodity> list = new ArrayList<Commodity>();
		list.addAll(commodities);
		list.sort(new CommodityWeightComparator());
		commodities.clear();
		commodities.addAll(list);
	}
	
	public void printElement() {
		System.out.println("������ ����� ��������");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		List<Commodity> list = new ArrayList<Commodity>();
		list.addAll(commodities);
		System.out.println(list.get(n));
	}
	
	public void printAll() {
		System.out.println("������ ������");
		System.out.println(commodities);
	}
}











