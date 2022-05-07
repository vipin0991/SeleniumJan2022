package package3;

import java.math.BigInteger;

public class BigIntPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger n1 = new BigInteger("1458752147893254015874102589630145870");
		BigInteger n2 = new BigInteger("1458752147893254015874102589630145870");
		//BigDecimal as well
		
		BigInteger n3 = n1.add(n2);
		
		System.out.println(n3);
		
		BigInteger mul = n1.multiply(n2);
		System.out.println(mul);

	}

}
