package org.interview;

import java.util.Iterator;

public class Class2 {
	public static void main(String[] args) {
//		odd or even
		
		int a = 10;
		
		if (a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		System.out.println();
		int aa=0, b=0;
//		odd or even
		int sumodd=0, sumeven=0;
		for(int i=0; i<5; i++) {
			if (i%2==0) {
				System.out.println("even");
				sumodd=i+sumodd;
				aa++;
			}
			
			else {
				System.out.println("odd");
				sumeven = i +sumeven;
			b++;
			}
		}
		
		System.out.println("sum of odd = "+sumodd);
		System.out.println("sum of even ="+sumeven);
		
		System.out.println("count odd = "+aa);
		System.out.println("even c= "+b);
		System.out.println();
		
//		rev num
		
		int e=0,c = 127, d=0;
		int f=c;
		while(c>0) {
			d=c%10;
			e=e*10+d;
			c=c/10;
		}
		if(e==f) {
			System.out.println("palian");
		}
		else {
			System.out.println("no palian");
		}
		System.out.println(e);
		System.out.println();
		
//		sum of the digits
		
		int y =12345, m=0, n=0;
		
		while(y>0) {
			m=y%10;
			n=n+m;
			y=y/10;
		}System.out.println(n);
		System.out.println();
//		fibornacci
		System.out.println(0);
		
		System.out.println(1);
		
		int x =0, yy=1, tem=0;
		
		for (int j = 0; j < 5; j++) {
			tem=yy+x;
			System.out.println(tem);
			x=yy;
			yy=tem;
		}
		
//		fact
		int o=1;
		for (int i = 6; i > 0; i--) {
			o=i*o;
		}
		System.out.println(o);
		
		System.out.println();
		
//		string
		
//		strrev
		
		String h="yugesh";
		
		for(int i=h.length()-1; i>=0; i--) {
			char g = h.charAt(i);
			
			System.out.print(g);
		}
		System.out.println();
		
		String s ="yuge good";
		String[] sd = s.split(" ");
		String h1="";
		for (int i = 0; i < sd.length; i++) {
			for (int j = sd[i].length()-1; j >= 0; j--) {
				char gf = sd[i].charAt(j);
				h1=h1+gf;
			}
			h1=h1+" ";
			System.out.println(h1);
		}
		
		String hh="yugesh";
		int co=0;
		for (int i = 0; i < hh.length(); i++) {
			char vv = hh.charAt(i);
			if (vv=='a' ||vv== 'e' ||vv== 'i' ||vv== 'o' ||vv== 'u') {
				System.out.println("vowels");
				co++;
			}
		}
		System.out.println(co);
		
//		capital small
		String tt="YugESH1762";
		String gt =""; int a2=0; int a3=0; int a4=0;
		for (int i = 0; i < tt.length(); i++) {
			char gf = tt.charAt(i);
			if (Character.isLowerCase(gf)) {
				char he = Character.toUpperCase(gf);
				gt=gt+he;
				a2++;
			}
			
			else if (Character.isUpperCase(gf)) {
				char hgg = Character.toLowerCase(gf);
				gt=gt+hgg;
				a3++;	
			}
			else {
				a4++;
			}
		}
		System.out.println(gt);
		System.out.println(a2);
		System.out.println(a3);
		
		
//		duplicate 
		String se = "welcome";
		String hh1="";
		for (int i = 0; i < se.length(); i++) {
			char fe = se.charAt(i);
			
			if (!hh1.contains(String.valueOf(fe))) {
				hh1=hh1+fe;
			}
			
		}System.out.println(hh1);
		
		
		
		
		
	}
}
