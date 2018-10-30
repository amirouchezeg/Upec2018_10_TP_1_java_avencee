import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class mMains {

	public static void main(String[] args) {
		
		//ex1******************************
		//ex1.1*********
		System.out.println("ex1.1*********");
		Ex1 ex1=new Ex1();
		ArrayList <Integer>l=new ArrayList<Integer>();
		 l.add(1);
		 l.add(2);
		 l.add(3);
		 l.add(4);
		 l.add(5);
		 l.add(6);		 
		 ex1.ex1_1(l);		 
		 //ex1.2*********
		 System.out.println("ex1.2*********");
		 Ex1 mClass=new Ex1();
		 
		 ArrayList<ArrayList<String>  > listOfLists = new ArrayList<ArrayList<String> >();
		 ArrayList<String> l1=new ArrayList<>();
		 ArrayList<String> l2=new ArrayList<>();
		 ArrayList<String> l3=new ArrayList<>();
		 l1.add("a");
		 l3.add("a");
		 
		 listOfLists.add(l1);
		 listOfLists.add(l2);
		 listOfLists.add(l3);		 		
		 
		 System.out.println("avent "+listOfLists.size());
		 mClass.ex1_2(listOfLists);
		 System.out.println("apres "+listOfLists.size());		 
		 
		 //ex1.3*********
		 System.out.println("ex1.3*********");
		 Ex1 mClass3=new Ex1();
		 
		 ArrayList<String> l1_3=new ArrayList<>();
		 l1_3.add("1");
		 l1_3.add("b");
		 
		 Map<String, String> hm1 = new HashMap<String, String>();
		 mClass3.ex1_3(l1_3,hm1);
		 
		 //ex1.4*********
		 System.out.println("ex1.4*********");
		 ArrayList<ArrayList<String>  > listOfLists4 = new ArrayList<ArrayList<String> >();
		 ArrayList<String> l4=new ArrayList<>();
		 ArrayList<String> l5=new ArrayList<>();
		 ArrayList<String> l6=new ArrayList<>();
		 l4.add("a");
		 l4.add("b");
		 l4.add("c");		 
		 l5.add("d");
		 l6.add("e");
		 listOfLists4.add(l4);
		 listOfLists4.add(l5);
		 listOfLists4.add(l6);
		 
		 ArrayList<String> mColl = new ArrayList<String>();		
		 ex1.ex1_4(listOfLists4,mColl);		 
		 
		//ex1.5*********
		 System.out.println("ex1.5*********");
		 
		 
		 ArrayList<String> l66=new ArrayList<>();
		 l66.add("z");
		 l66.add("a");
		 l66.add("b");
		 l66.add("f");ex1.ex1_5(l66, "b");
		 
		 ArrayList<Integer> lInt=new ArrayList<>();
		 lInt.add(3);
		 lInt.add(4);
		 lInt.add(5);
		 lInt.add(6);
		 ex1.ex1_5(lInt, 4);		 
		 
		
		//ex2*******************************
		 System.out.println("ex2*******************************");
		 System.out.println("ex2.1*********");
		 Ex2 ex2=new Ex2();
		 
		 Map<Integer, String> hm=new HashMap<Integer, String> ();
		 hm.put(1, "A");hm.put(2, "B");hm.put(10, "A");hm.put(22, "Z");
		 
		 
		 Map<String, Collection<Integer>> retunedhm = ex2.ex2_1(hm);
		 System.out.println(retunedhm.toString());
		 
		 
		 
	}

}
