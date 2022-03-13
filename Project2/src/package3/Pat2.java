package package3;

public class Pat2 {
	public static void main(String[] args) {
		
		System.out.println("------Pattern 2------");
		
		for(int j=1;j<=5;j++) {
			for(int i=5;i>=j;i--){
				System.out.print("*");
		}
			System.out.println();
	}
		
	System.out.println("------Pattern 3------");
		
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	System.out.println("------Pattern 4------");
	
	int k=1;
	for(int i=1;i<=4;i++) {
		
		for(int j=1;j<=i;j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
		//k++;
	}


}
}