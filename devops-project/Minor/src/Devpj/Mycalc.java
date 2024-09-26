package Devpj;

public class Mycalc {
	public int add(int a,int b) {
		return a+b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public static void main(String args[]) {
		Mycalc obj = new Mycalc();
		System.out.println("sum of two numbers: "+ obj.add(10,5));
		System.out.println("sum of mul numbers: "+ obj.mul(8,5));
	}

}
