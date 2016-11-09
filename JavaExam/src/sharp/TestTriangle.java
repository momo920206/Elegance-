package sharp;

public class TestTriangle {

	public static void main(String[] args) {
		
		try {
			int num=Integer.valueOf(args[0]);
			// TODO Auto-generated method stub
			//正等腰三角形
			Triangle.CreatIsoscelesTriangle1(num);
			//正空心等腰三角形
			Triangle.CreatIsoscelesTriangle2(num);
			//倒等腰三角形
			Triangle.CreatIsoscelesTriangle3(num);
			//倒等腰空心三角形
			Triangle.CreatIsoscelesTriangle4(num);
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("输入行数非法");
		}

	}

}
