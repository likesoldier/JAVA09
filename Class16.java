class CCircle{
	private static double pi = 3.14;
	private double radius;
	
	public CCircle(double r) {
		radius = r; 
	}
	public static double average(CCircle c[]) {
		double sum = 0.0;
		for(int i = 0;i < c.length;i++)
			sum += c[i].radius;
		return (sum/c.length);
	}
	public void show(){
		System.out.print("radius = " + radius + ",area = " + pi * radius * radius);
	}
}

public class Class16 {

	public static void main(String[] args) {
		CCircle cir[];
		cir = new CCircle[6];
		
		for(int i = 0;i < cir.length;i++) {
			cir[i] = new CCircle((double)i);
			cir[i].show();
		}
	}
}