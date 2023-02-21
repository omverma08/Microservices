
public class A {

	public static void main(String[] args) {

		pattern1(5);

		System.out.println();
		pattern2(5);

		System.out.println();
		pattern3(5);

		System.out.println();
		pattern4(5);

		System.out.println();
		pattern5(5);
		System.out.println();
		pattern6(5);
		System.out.println();
		pattern7(4);

	}

	static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/*
	 * n=5 row 1 col 5 row 2 col 4 row 3 col 3
	 */

	static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}

			System.out.println();
		}

	}

	static void pattern4(int n) {
		int row = 0;
		for (row = 1; row <= 2 * n; row++) {
			int TotalNoOfRow = row > n ? 2 * n - row : row;
			for (int col = 1; col <= TotalNoOfRow; col++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	static void pattern5(int n) {
		int row = 1;
		for (row = 1; row <= 2 * n; row++) {

			int TotalNoOfRow = row > n ? 2 * n - row : row;
			int numberOfSpaces = n - TotalNoOfRow;

			for (int s = 1; s <= numberOfSpaces; s++) {
				System.out.print(" ");

			}

			for (int col = 1; col <= TotalNoOfRow; col++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}


	static void pattern6(int n) {
		
		for (int row = 1; row <= n; row++) {
			

			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
				
			}

			for(int col=row;col>=1;col--) {
				System.out.print(" "+col);						
			}
			
			for(int col=2;col<=row;col++) {
				System.out.print(" "+col);
				
				
			}
			System.out.println();
		}
		
		

	}
	
	static void pattern7(int n) {
		for (int row = 1; row <= n; row++) {
			
			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
				
			}
			int C=1;
			for(int col=1;col<=row; col++) {
				   System.out.print(C + " ");
	               C = C * (row - col) / col;
			}
			System.out.println();
		}
		
		
	}

}
