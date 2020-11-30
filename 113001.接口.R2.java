package java1130;

public interface R2 {
	static void Test() {
		String boy_fliePath = "img/boy.gif";
		String girl_fliePath = "img/girl.gif";
		int[][] array2d= {{1,2,3},{4,5,6}};
		System.out.println(boy_fliePath);
		System.out.println(girl_fliePath);
		for (int i = 0; i < array2d.length; i++) {//array2d.length 行的长度
			for (int j = 0; j < array2d[i].length; j++) {//array2d[i].length 列
				System.out.print(array2d[i][j]+" ");
			}
			System.out.println();
		}
	}
}
