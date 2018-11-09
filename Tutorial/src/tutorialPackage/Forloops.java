package tutorialPackage;

public class Forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, q=5;
		for(r=0; r<5; r++); //notice the semicolon
		q = q+1;
		System.out.println(r + " " + q);
		
		int j, k;
		int count = 0;
		for(j=0; j<4; j++)
		{
		for( k = 0; k < 10; k++ )
		{
		count++;
		}
		}
		System.out.print(count--);
		System.out.println(count);
		
		int y = 0;
		for (int g = 0; g <5; g++)
		y++;
		System.out.println(y);
		
		int s = 1;
		for (int u = 3; u >= 0; u--)
		{
		s = s + u;
		}
		System.out.println(s);
	}

}
