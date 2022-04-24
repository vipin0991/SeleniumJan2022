package package3;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 5, 6, 87, -19, 0 };
		
		int smal = a[0];
		int larg = a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(smal>a[i]) {
				smal = a[i];
			}
			
			if(larg<a[i]) {
				larg = a[i];
			}
		}
		
		System.out.println("Smallest no is : "+smal);
		System.out.println("Largest no is : "+larg);
		
		
	}

}
