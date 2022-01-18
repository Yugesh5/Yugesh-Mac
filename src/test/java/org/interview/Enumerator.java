package org.interview;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class Enumerator {
	public static void main(String[] args) {
		Vector< Integer> v = new Vector<>();
		v.add(10);
		
		v.add(20);
		
		v.add(30);
		
		Enumeration<Integer> em = v.elements();
		
		while (em.hasMoreElements()) {
			Integer yuu = em.nextElement();
			
			System.out.println(yuu);
		}
		
		Iterator<Integer> i = v.iterator();
		
		while (i.hasNext()) {
			Integer ii = i.next();
			System.out.println(ii);
		}
		
		Set<Integer> s = new LinkedHashSet<>();
		
		s.add(101);
		
		s.add(202);
		
		s.add(303);
		
		Iterator<Integer> is = s.iterator();
		
		while (is.hasNext()) {
			Integer si = is.next();
			
			System.out.println(si);
		}
		
		List< Integer>  li = new LinkedList<>();
		
		li.add(72);
		
		li.add(50);
		
		li.add(732);
		
		ListIterator<Integer> li1 = v.listIterator();
		while (li1.hasNext()) {
			Integer iuu = li1.next();
			if (iuu==732) {
				li1.remove();
			}
		}
		
		for (Integer integer : v) {
			System.out.println(integer);
		}
//	System.out.println(li1);
		
		
	
	}
}
