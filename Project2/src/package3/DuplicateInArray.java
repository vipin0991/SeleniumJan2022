package package3;

public class DuplicateInArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 2, 7, 8, 8, 3, 2 };
		int b[] = new int[5];
		
		int dnum = 0;

		System.out.println("Duplicate numbers are : ");
		for(int i=0;i<a.length;i++) {
			int dup = 1;
			for(int j=i+1;j<a.length;j++) {
								//System.out.println(i+"****"+j);
								if(a[i]==a[j]) {
									
								//	b[j] = a[j];
									System.out.println(a[j]);
									break;
									}
				}
								
			}
			
			//
	//System.out.println(b.length);
		}
}