package ua.yunyk.minimum;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Apple> set = new LinkedHashSet<>();
		set.add(new Apple("McIntosh", 3));
		set.add(new Apple("Cameo", 1));
		set.add(new Apple("Empire", 2));
		set.add(new Apple("Cortland", 7));
		set.add(new Apple("Fuji", 10));

		System.out.println("Unsorted set");
		System.out.println(set);
		System.out.println();
		
		List<Apple> list = new ArrayList<>();
		list.addAll(set);
		list.sort(new AppleAllFieldsComparator());
		set.clear();
		set.addAll(list);
		
		System.out.println("Sorted set");
		System.out.println(set);
	}
	
}
