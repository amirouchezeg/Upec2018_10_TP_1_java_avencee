import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public  class Ex1 {
	
	public <T> void ex1_1(List<T> list) {
		Iterator<T> iterator =list.iterator();
		int j=0;
		while (iterator.hasNext()) {
			 iterator.next();
			j++;
			if (j%2==0) {
				iterator.remove();
			}			
		}
		/*
		int d=list.size();		
		if (d%2!=0) {
			d++;
		}
		for(int i=0;i<d/2;i++) {						
						
		}
		*/
		for(int i=0;i<list.size();i++) {			
			System.out.println(list.get(i));
		}
	}
		
	public <T> void ex1_2(Collection<? extends Collection <T> > list) {	
		
		Iterator <? extends Collection<T>  > iterator=list.iterator();
		while (iterator.hasNext()) {
			Collection courentList=iterator.next();
			if (courentList.isEmpty()) {
				iterator.remove();
			}			
		}	
	}
	

	public <T> void ex1_3(Collection <T> list ,Map<T, T> hm) {	
	    
		Iterator <T> iterator= list.iterator();
		
		while (iterator.hasNext()) {
			T c= iterator.next();
			hm.put(c, c);			
		}	
				
		for (T name: hm.keySet()){
            String key =name.toString();
            String value = hm.get(name).toString();  
            System.out.println(key + " " + value);  

		} 		
	}
	
	public <T> void ex1_4(Collection<? extends Collection <T> > list,Collection<T> mCollection) {			
		Iterator <? extends Collection<T>  > iterator=list.iterator();
		while (iterator.hasNext()) {
			Collection courentCollection=iterator.next();			
			mCollection.addAll(courentCollection);
		}
		System.out.println(mCollection.toString());
	}
	public <T extends Comparable<T>  > void ex1_5(Collection<T> list,T max ) {		
		Iterator<T> iterator= list.iterator();		
		while (iterator.hasNext()) {
			T courentI= iterator.next();
			if (courentI.compareTo(max) == 1) {
				iterator.remove();
			}		
		}				
		///////////////////////:
		Iterator<T> iterator2= list.iterator();
		while (iterator2.hasNext()) {
			T courentI= iterator2.next();
			//
			
			System.out.println(courentI);
		}
		
		
	}

}
