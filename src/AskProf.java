import java.util.ArrayList;
import java.util.List;

public class AskProf {
		
		class A {}
		class B extends A {}
		class C extends B {}
				
		static <T > void g ( List <? super T > lt , List <? extends T > ls ){
			
		}
		
		public static void main ( String [] args ) {
			//ne  modifie pas ca************
			List <? extends B > lbc = new ArrayList <C >();
			ArrayList <? super B > lba = new ArrayList <A >();
			
			
			g ( lbc , lba );
			
			
		}
	}
