package tutorialPackage;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		for (int i = 0; i <= 10; i++ ) {
			System.out.println(i);
		}
		
		System.out.println();
		for (int i = 10; i <= 0; i++ ) {
			System.out.println(i);
		}
		
		String name = "george";
		System.out.println(name.indexOf('r'));
		System.out.println(name.substring(2));
		for (int i = 0; i < name.length(); i++) {
			System.out.println(i);	
		}
		
		for(int i = 0; i <name.length(); i ++) {
			System.out.println(name.charAt(i));
			if(name.charAt(i) == 'r') {
				break;
			}
		}
		
		int sum=0;
		for (int k=0; k<5; k++) {
		sum+=k;
		}
		System.out.println(sum);
		
		double kk = 3;
		int j = 0;
		for( j = 0; j <= 100; j++) {
		kk = kk + Math.pow(j, 2);
		++kk;
		}
		System.out.println(j);
		
		double p = 0;
		for(int m =10; m > 6; --m)
		{
		if(m==7) {
		p = p+m;
		}
		else {
		++p;
		}
		} System.out.println(p);
		
		for(int m=1; m<10; m= m+2) { 
			System.out.println(m);
		
		}
		
		double x = 0;
		for(int b=0; b<101; b++)
		{
		x = x + 1;
		b--;
		}
		System.out.println(x);
		
		int r, q=5;
		for(r=0; r<5; r++); //notice the semicolon
		q = q+1;
		System.out.println(r + " " + q);
	}
		
}
