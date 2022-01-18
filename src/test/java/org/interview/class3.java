package org.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class class3 {
	public static void main(String[] args) {
//		count of letters
		String a="welcomeeee";
		List<Integer> li = new LinkedList<>();
		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);
			int hyy = Character.hashCode(b);
			li.add(hyy);			
//		}
//		int count=0;
//		for (int i = 0; i < li.size(); i++) {
//			for (int j = i+1; j < li.size(); j++) {
//				if (li.get(i)==li.get(j)) {
//					count=count+1;
//				}
//			}System.out.println(li.get(i));
//			System.out.println(count);
//			count=0;
//		}
		}
		
		String e ="Yugesh";
		
		char[] ch = e.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<>();
		
		for (int i = 0; i < ch.length; i++) {
			if (m.containsKey(ch)) {
				Integer in = m.get(ch);
				m.put(ch[i], in+1);
			} 
			else {
				m.put(ch[i], 1);
			}
		}System.out.println(m);
		
		String h = "welcome to to my house";
		
		String[] gf = h.split(" ");
		
		Map<String, Integer> mp = new LinkedHashMap<>();
		
		for (int i = 0; i < gf.length; i++) {
			if (mp.containsKey(gf[i])) {
				Integer yu = mp.get(gf[i]);
				mp.put(gf[i], yu+1);
			}
			
			else {
				mp.put(gf[i], 1);
			}
		}System.out.println(mp);
		int t=0;
		int aa[] = {50, 20, 45000, 60, 100, 153, 12001};
//		for (int i = 0; i < aa.length; i++) {
//			for (int j = i+1; j < aa.length; j++) {
//				if (aa[i]>aa[j]) {
//					t = aa[i];
//					aa[i]=aa[j];
//					aa[j]=t;
//				}
//			}
//		}
		
		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}
		System.out.println();
		
		int max=0;
		max=aa[0];
		for (int i = 0; i < aa.length; i++) {
			if (aa[i]>max) {
				max = aa[i];
			}
		}System.out.println(max);
		
		Integer y[] = {10, 30, 50};
		List<Integer> li1 = Arrays.asList(y);
		System.out.println(li1);
		for (int i = 0; i < li1.size(); i++) {
			System.out.println(li1.get(i));
		}
		
		Object[] arr = li1.toArray();
		
		System.out.println(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Set<Integer> s = new LinkedHashSet<>(Arrays.asList(y));
		
		System.out.println(s);
		
		for (Integer integer : s) {
			System.out.println(integer);
		}
		 int y1=10;
		 
		 Integer ii = new Integer(y1);
		 
		 System.out.println(ii);
		
		 Integer iu =10;
		 
		 int e1 =iu;
		 
		 System.out.println(e1);
		 
		 
		
	}
}
