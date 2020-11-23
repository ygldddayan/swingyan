package java1123;

import java.awt.Point;
import java.util.Scanner;

public class SuiJiZuoBiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入数字");
		while (true) {
			 Scanner suinum =new Scanner(System.in);
			int num = suinum.nextInt();
			if(num==1) {
				int x= (int)(Math.random()*100%100);
				int y=  (int)(Math.random()*100%100);
				System.out.println("随机坐标：("+x+","+y+")"); 
			}else {
				System.out.println("输入数字错误");
			}
		}
	}
}
