package package3;

public class Pat4 {
	
	public static void main(String[] args) {
		System.out.println("-----Pattern 5-----");
		for(int i=1;i<=5;i++){
			
			for(int j=5;j>i;j--){
					
					System.out.print(" ");
				}
			
			for(int k=1;k<=i;k++) {
			
				System.out.print("*");
			}
		System.out.println("");
	}
		
	System.out.println("-----Pattern 6-----");
	for(int i=0;i<=4;i++) {
		for(int j=5;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<2*i+1;k++) {
			System.out.print("*");
		}
		System.out.println("");
	}

}
}