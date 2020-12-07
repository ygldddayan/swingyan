package java120702;



public class APP {

	public static void main(String[] args) {
		int [][] arrayd2= {
				{1,2,3,4,5,6},
				{7,8,9,10,0,12},
				{7,8,9,10,11,12},
				{7,8,9,10,11,12}
				
		};  
		new Find().FindZero(arrayd2);
		new Find().FindLeft(arrayd2);
		new Find().FindRight(arrayd2);
		new Find().FindUp(arrayd2);
		new Find().FindDown(arrayd2);
	}
	
}
