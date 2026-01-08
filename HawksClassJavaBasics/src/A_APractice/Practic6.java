package A_APractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Practic6 {
	
	public static void main(String[] args) {
		
		int []	a=new int [4];
		
		
		try{
		a[1]=200;
		a[6]=100;
		
			
			System.out.println(a[1]);
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Hanled Exception");
		}
		
		
		System.out.println("______________________________________");
		ArrayList ar=new ArrayList();
		
		ar.add(100);
		ar.add("ahmad");
		ar.add(12.33);
		ar.add('A');
		ar.add(true);
		
		System.out.println("before removing" +ar);
		System.out.println(ar.size());
		System.out.println(ar.remove(1));
		System.out.println("after removing" +ar);
		ar.add("Ahmad Shekaib");
		System.out.println("after adding" +ar);
		
		
		
	}
		
	
		
	}
