package com.project.setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TrainTester {
	public static void main(String[] args) {
		Set<Train> container = new LinkedHashSet<Train>();
		container.add(new Train(1, "Jan shatabdi", "Bangalore", "Hubli", true));
		container.add(new Train(2, "Venkatadri-Express", "Tirupathi", "Hydrabad", true));
		container.add(new Train(3, "Rajdhani-Express", "Trivendrum", "New-Delhi", false));
		container.add(new Train(4, "JanmaBhumi-Express", "Vishakapattanam", "Banaglore", true));
		container.add(new Train(5, "Chalukya-Express", "Bangalore", "Dadar", false));
		container.add(new Train(0, null, null, null, false));
        
		Set<Train> duplicateConatiner=new HashSet<Train>();
		duplicateConatiner.addAll(container);
		
		for(Train tr:duplicateConatiner) {
			System.out.println(tr);
		}
        System.out.println(container.size());
		System.out.println(container);
		System.out.println("By using for-each Loop");
		for (Train train : container) {
			System.out.println(train.getName() + "  " + train.getDeparturePlace());
		}
		
		System.out.println("iterator interface,,,,,,,,,,,,,");
		Iterator<Train> itr=container.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().hashCode());
		}
	}

}
