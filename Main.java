import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findKthMagicNumber(13));
	
	}
	//Design an algorithm to find the kth number such that the only prime factors are 3,5,7	
		public static int findKthMagicNumber(int k){
			//if(k==1)return 1;
			LinkedList<Integer> l3=new LinkedList<Integer>();l3.add(3);
			LinkedList<Integer> l5=new LinkedList<Integer>();l5.add(5);
			LinkedList<Integer> l7=new LinkedList<Integer>();l7.add(7);

			int x=1;
			for(int i=2;i<=k;i++){
				int val=Math.min(l3.getFirst(), Math.min(l5.getFirst(), l7.getFirst()));
				if(val==l3.getFirst()){
					x=l3.removeFirst();
					l3.add(3*x);
					l5.add(5*x);
					l7.add(7*x);
					
				}else if(val==l5.getFirst()){
					x=l5.removeFirst();
					l5.add(5*x);
					l7.add(7*x);
				}else{
					x=l7.removeFirst();
					l7.add(7*x);
				}
			}
			
			return x;
		}

}
