package arrays;

public class Chapter18Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		double sgt[] = new double [800];
		//2. 
		double dfw[] = new double[21];
		System.out.println(dfw.length);
		//3.
		for(int i = 0; i < sgt.length; i++) {
			System.out.println(sgt[i] = Math.sqrt(i));
		}
		//4. 
		double rtl[] = new double[10];
		//double rtl_len = rtl.length(); 	
		//5. 
		char cr[] = {'a','b','c','d','e'};
		//6.
		System.out.println(cr.length);
		//7.
		double total = 0;
		for(int i = 0; i < sgt.length; i++) {
			total += sgt[i];
		}
		System.out.println(total);
		//8.
		//for(int k = 2; k <homer.length; k++) {
			//homer[k+1] = k;
		//}
		//9.
		//boolean bbc = heroWorship(double dbx[]);
		//public boolean heroWorship(double vb[]);
		//10.
		int adc[] = {34,56,-102,18,5};
		System.out.println(adc[1]);
		//11.
		System.out.println(adc[3]+adc[4]);
		//12.
		//System.out.println(adc[5]);
		
	}

}
