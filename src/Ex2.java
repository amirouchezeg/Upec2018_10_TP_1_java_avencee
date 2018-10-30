import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public  class Ex2<K,V> {// l'implimentation 
	
	
	public <T,V> Map<V, Collection<T>> ex2_1 (Map <T ,V> map) {
		Set <V> set =new TreeSet<V>();
		for (T key :map.keySet()) {
			set.add(map.get(key));
		}				
		Map<V, Collection<T>> hm =new HashMap<V, Collection<T>>();		
		Iterator<V> iteratorSet =set.iterator();				
		while (iteratorSet.hasNext()) {
			V courentSetIterator=iteratorSet.next();			
			Collection<T> temperarList= new ArrayList<T>();			
			
			for (T key :map.keySet()) {
				if (map.get(key).equals(courentSetIterator)) {
					temperarList.add(key);
				}
			}						
			hm.put(courentSetIterator, temperarList);						
		}
		
		return hm;
	}
	
	public void ex2_2() {
		
	}
}
