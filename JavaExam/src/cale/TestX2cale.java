package cale;

public class TestX2cale {
	public static void main(String[] args) {
		try {
			int a=Integer.valueOf(args[0]);
			int b=Integer.valueOf(args[1]);
			int c=Integer.valueOf(args[2]);
			X2cale.cale(a, b, c);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("输入值非法");
		}

	}
}
