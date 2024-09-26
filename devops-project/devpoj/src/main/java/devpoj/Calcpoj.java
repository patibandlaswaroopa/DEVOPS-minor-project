package devpoj;

public class Calcpoj {
    public int add(int a,int b) {
    	return a+b;
    }
    public int mul(int a,int b) {
    	return a*b;
    }
    public int sub(int a,int b) {
    	return a-b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcpoj obj = new Calcpoj();
		System.out.println("addition of two numbers: "+ obj.add(10, 10));
		System.out.println("subtraction of two numbers: "+ obj.sub(11, 30));
		System.out.println("multiplication of two numbers: "+ obj.mul(6, 8));
		

	}

}
