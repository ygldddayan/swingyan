package java1130;

public class R {
 
	static void Test() {
		String boy_fliePath = "img/boy.gif";
		String girl_fliePath = "img/girl.gif";
		int[][] array2d= {{1,2,3},{4,5,6}};
		System.out.println(boy_fliePath);
		System.out.println(girl_fliePath);
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.print(array2d[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
