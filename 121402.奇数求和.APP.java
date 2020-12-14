package java2020121401;

public class Test02 {

	public static void main(String[] args) {
		// 奇数求和
		long sum =0;
		for (long i = 1; i<=2147483647; i++) {
//			System.out.println(i);
			if(i%2!=0) {
				sum=i+sum;
			}
		}

		System.out.println("1至2147483647的奇数和"+sum);
	}

}
