class POWER{
	public static void power(int x,int n) {
		int sum = 1;
		for(int i = 1;i <= n;i++)
			sum *= x;
		System.out.println(x + "ªº" + n + "¦¸¤è =" + sum);
	}
}
public class Class07 {

	public static void main(String[] args) {
		POWER.power(2, 5);
		POWER.power(3, 2);
	}
}
