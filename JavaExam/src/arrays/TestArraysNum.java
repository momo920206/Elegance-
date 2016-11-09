package arrays;

public class TestArraysNum {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			int a=Integer.valueOf(args[0]);
			int b=Integer.valueOf(args[1]);
			int c=Integer.valueOf(args[2]);
			int d=Integer.valueOf(args[3]);
			int e=Integer.valueOf(args[4]);
			ArraysNum.better(a,b,c,d,e);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("您输入的值非法");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("您输入的值缺少");
		}
	}

}
