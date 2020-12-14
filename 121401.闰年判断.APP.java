package java2020121401;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		闰年判断
		System.out.println("请输入年份：");
		while (true) {
			Scanner numday = new Scanner(System.in);
			int yeasday =numday.nextInt();
			if(yeasday%4 == 0 && yeasday%100 != 0) {
				System.out.println(yeasday+"是闰年");
			}else if(yeasday%400 == 0) {
				System.out.println(yeasday+"是闰年");
			}else {
				System.out.println(yeasday+"是平年");
			}
			
		}
	
	}

}
