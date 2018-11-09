package tutorialPackage;

public class Lesson11 {

	public static void main(String[] args) {	
		
		int a,b = 0,c = 0,d = 0;
		for (a=0; a < 3; a++) {
			b = b+2;
			c = c+4;
			d = d+8;
		}
		 System.out.println(a + ", " + b + ", " + c + ", and " + d);
		 
		 int e,f = 0,g = 0,h = 0;
			for (e=0; e < 3; e++) {
				f = f+2;
				g = g+4;
				h = h+8;
			}
			 System.out.println(h + ", " + g + ", " + f + ", and " + e);
			 
			 int k = 0;
			 for(int j = 0; j <= 10; j++)
			 {
			 if (j == 5)
			 {
			 break;
			 }
			 else
			 {
			 k++;
			 }
			 }
			 System.out.println(k);
		 
			 int r, j;
			 for (j = 1; j < 10; j = j * 2)
			 r = 2 * j;
		
		
	}//end main

}//end class
