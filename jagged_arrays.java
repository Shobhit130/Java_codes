package hello;

public class jagged_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jagged arrays - each row of the 2d array can be of different size
		
		//initialization of jagged arrays
		
//		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
		//or
//		int a[][] = new int[4][];
//		a[0] = new int[] {1,1,1,1};
//		a[1] = new int[] {2,2};
//		a[2] = new int[] {3,3,3};
//		a[3] = new int[] {4,4,4,4};
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
//		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
//		for(int k[]:a) {
//			for(int m:k) {
//				System.out.print(m+ " ");
//			}
//			System.out.println();
//		}
		
		//passing jagged arrays to methods
		
//		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
//		display(a);
//		
//	}
//	
//	public static void display(int m[][]) {
//		for(int k[]:m) {
//			for(int i:k) {
//				System.out.print(i+ " ");
//			}
//			System.out.println();
//		}
//	}
		
		//returning a jagged array from a method
		
//		int m[][] = returnarray();
//		for(int k[]:m) {
//		for(int i:k) {
//			System.out.print(i+ " ");
//			}
//		System.out.println();
//		}
//	}
//	
//	public static int[][] returnarray(){
////		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
////		return a;
//		//returning an anonymous jagged array
//		return new int[][] {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
//	}
		
		//finding the sum of each row of a jagged array
		int a[][] = {{1,1,1,1},{2,2},{3,3,3},{4,4,4,4}};
		disp_sum(a);
		
	}
	
	public static void disp_sum(int k[][]) {
		int s = 0;
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<k[i].length;j++) {
				s += k[i][j];
			}
			System.out.println("The sum of row "+(i+1)+" " + "is " + s);
			s = 0;
		}
	}
	
}
