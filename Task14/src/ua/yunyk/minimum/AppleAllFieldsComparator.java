package ua.yunyk.minimum;

import java.util.Comparator;

public class AppleAllFieldsComparator implements Comparator<Apple>{

	@Override
	public int compare(Apple o1, Apple o2) {
		
		if(o1.getWeight() > o2.getWeight()) {
			return 1;
		} else if(o1.getWeight() < o2.getWeight()) {
			return -1;
		} else {
			if(o1.getSort().compareTo(o2.getSort()) > 0) {
				return 1;
			} else if(o1.getSort().compareTo(o2.getSort()) < 0) {
				return -1;
			}
		}
		
		
		return 0;
	}

	

}
