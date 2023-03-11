package TestNG_Demo_Suit;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Generics <T,M>{

	int b ;
	String d ;
	T c ;
	M p ;
	
	public M demo(T j) {
		return p ;
	}
	
	public static void main(String[] args) {
		
		Hashtable <String, Integer>student = new Hashtable <String, Integer>();
		student.put("science", null);
		student.put("maths", 40);
		student.put("history", 30);
		student.put("marathi", 20);
		student.put("hindi", 46);
		
		for(Map.Entry<String, Integer>d : student.entrySet()) {
			System.out.println("key =" +d.getKey()+ " value =" +d.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

			
		
		
		
		
		//        key , value
//		HashMap <Integer,String>map = new HashMap<Integer,String>();
//		map.put(32, "suchit");
//		map.put(12, "null");
//		map.put(65, "null");
//		map.put(95, "ronaldo");
//		map.put(76, "suchit");
//		for(Map.Entry<Integer,String> k : map.entrySet()) {
//			System.out.println("key = " +k.getKey() +"value = "+ k.getValue());
//		}
//		System.out.println("============");
//		map.put(95, "mhappe");
//		for(Map.Entry<Integer,String> k : map.entrySet()) {
//			System.out.println("key = " +k.getKey() +"value = "+ k.getValue());
//		}
		
		
		
		
		
		
		
		
		
		//deletion and retrieval
//		HashSet <Character> n = new HashSet <Character> ();
//		n.add('$');
//		n.add('*');
//		n.add('@');
//		n.add('$'); 
//		n.add('r');
//		n.add('k');
//		n.add('$'); 
//		Iterator i = n.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		n.remove('$');
//		System.out.println("=======");
//		i = n.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
		
		
		
		
		
		
		//insertion
//		for(char y: n) {
//			System.out.println(y);
//		}
//		System.out.println("=================");
//		Iterator i = n.iterator();
//		for(char x:n){
//			System.out.println(i.next());
//		}
//		System.out.println("========");
//		i = n.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//----------------------------------------------		
	
//		ArrayList a = new ArrayList();
//		a.add(98);
//		a.add("jarvis");
//		a.add(98.9);
//		a.add(true);
//		
//		for (Object r : a  ) {
//			System.out.println(r);
//		}
//		a.remove(2);
//		System.out.println("=========");
//		for (Object r : a  ) {
//			System.out.println(r);
//		}
//		System.out.println("------------------------");
//		ArrayList<Integer> e = new ArrayList<Integer>();
//		e.add(98);
//		e.add(45);
//		e.add(98);
//		e.add(65);
//		for (Integer h: e) {
//			System.out.println(h);
//		}
//		Generic  s x = new Generics ();
//		Object d =x.demo(985);
//		Generics <String, Integer> k= new Generics() ;
//		int g = k.demo("asdf");
	
		
		
		
//		k.c = "mumbai";
//		k.p = 90 ;
//		
	}   
	
	
	
	
//	Generics abc = new Generics ();
//	abc.b = 65 ;
//	abc.d = "suchit salvi";
//	abc.c = 98 ;
//	abc.c = "velocity";
//	abc.c = 89.9 ;
//	abc.c = new SoftAssertexample ();
//	   
//	
//	
//	Generics def = new Generics ();
//	def.b = 98 ;
//	def.d = "salvi suchit";
	
	
	
}
