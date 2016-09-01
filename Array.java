package arrayTraversal;

/** Write a method called powArray that takes a double
 * array,a, and returns a new array that contains the elements
 * of a squared.
 * @author zhang
 *
 */
public class ArrayTraversal {

	
		public static void powArray(double[]a){
		
			for (int i = 0; i < a.length; i++){
				a[i] = Math.pow(a[i], 2.0);
				System.out.println(a[i]);
				
			}
			
	}
		public static void main(String[] args) {
			int size = 5;
			double[] a = new double[size]; //array of doubles
			
			a[0] = 1; 
			a[1] = 2; 
			a[2] = 3; 
			a[3] ++;
			a[4] -= 60;
			
			ArrayTraversal arrayTraversal = new ArrayTraversal();
			arrayTraversal.powArray(a);
		}

	}


