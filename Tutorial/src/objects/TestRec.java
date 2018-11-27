package objects;

public class TestRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rec r1 = new Rec();
		Rec r2 = new Rec(5 , 15 , 200 , 100);
		r1.getx();
		r1.setx(10+7);
		r2.translate(5, 20);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
	}//end main
}//end TestRec
