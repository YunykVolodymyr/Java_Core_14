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
		System.out.println("¬вед≥ть назву");
			String name = s.next();
		System.out.println("¬вед≥ть довжину");
			double length = s.nextDouble();
		System.out.println("¬вед≥ть ширину");
			double width = s.nextDouble();
		System.out.println("¬вед≥ть вагу");
			double weight = s.nextDouble();
	
		commodities.add(new Commodity(name, length, width, weight));
	}
	
	public void remove() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("¬вед≥ть назву");
			String name = s.next();
		System.out.println("¬вед≥ть довжину");
			double length = s.nextDouble();
		System.out.println("¬вед≥ть ширину");
			double width = s.nextDouble();
		System.out.println("¬вед≥ть вагу");
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
		System.out.println("¬вед≥ть назву старого товару");
			String name = s.next();
		System.out.println("¬вед≥ть довжину старого товару");
			double length = s.nextDouble();
		System.out.println("¬вед≥ть ширину старого товару");
			double width = s.nextDouble();
		System.out.println("¬вед≥ть вагу старого товару");
			double weight = s.nextDouble();
		
			Iterator<Commodity> iterator = commodities.iterator();
			
			while(iterator.hasNext()) {
				Commodity next = iterator.next();
				if(next.getName().equalsIgnoreCase(name) && next.getWeight() == weight
					&& next.getLength() == length && next.getWidth() == width) {
					
					System.out.println("¬вед≥ть назву нового товару");
						next.setName(s.next());
					System.out.println("¬вед≥ть довжину нового товару");
						next.setLength(s.nextDouble());
					System.out.println("¬вед≥ть ширину нового товару");
						next.setWidth(s.nextDouble());
					System.out.println("¬вед≥ть вагу нового товару");
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
		System.out.println("¬вед≥ть номер елемента");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		List<Commodity> list = new ArrayList<Commodity>();
		list.addAll(commodities);
		System.out.println(list.get(n));
	}
	
	public void printAll() {
		System.out.println("—писок товар≥в");
		System.out.println(commodities);
	}
}











