package java120702;

public class Find {

	void FindZero(int arrayd2[][]) {
		for (int row = 0; row < arrayd2.length; row++) {
			for (int colum = 0; colum < arrayd2[0].length; colum++) {
				if(arrayd2[row][colum]==0){
				System.out.println("R_zero：("+colum+","+row+")");	
				}
			}
		}
	}
	void FindLeft(int arrayd2[][]) {
		for (int row = 0; row < arrayd2.length; row++) {
			for (int colum = 0; colum < arrayd2[0].length; colum++) {
				if(arrayd2[row][colum]==0){
				int	leftX=colum-1;
				if(leftX<0) {
					leftX = colum;
				}
				System.out.println("R_left：("+leftX+","+row+")");	
				}
			}
		}
	}
	void FindRight(int arrayd2[][]) {
		for (int row = 0; row < arrayd2.length; row++) {
			for (int colum = 0; colum < arrayd2[0].length; colum++) {
				if(arrayd2[row][colum]==0){
				int	RightX=colum+1;
				System.out.println("R_Right：("+RightX+","+row+")");	
				}
			}
		}
	}
	void FindUp(int arrayd2[][]) {
		for (int row = 0; row < arrayd2.length; row++) {
			for (int colum = 0; colum < arrayd2[0].length; colum++) {
				if(arrayd2[row][colum]==0){
				int	upY=row-1;
				System.out.println("R_Up：("+colum+","+upY+")");	
				}
			}
		}
	}
	void FindDown(int arrayd2[][]) {
		for (int row = 0; row < arrayd2.length; row++) {
			for (int colum = 0; colum < arrayd2[0].length; colum++) {
				if(arrayd2[row][colum]==0){
				int	DownY=row+1;
				System.out.println("R_Down：("+colum+","+DownY+")");	
				}
			}
		}
	}

}
