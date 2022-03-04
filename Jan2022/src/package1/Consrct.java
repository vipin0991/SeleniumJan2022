package package1;

public class Consrct {
	
	int a,b,c,d,e;
	
	public Consrct(int a1, int b1, int c1, int d1, int e1) {
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1;		
	}
	
	public static void main(String[] args) {
		Consrct c1=new Consrct(4,3,7,1,10);
		System.out.println(c1.a);
	}

}
