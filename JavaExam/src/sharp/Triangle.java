package sharp;

public class Triangle {
	
	/*正三角型图形打印方法，首先定义最外层的循环，控制输出的三角型的行数，
	 * 在外层循环中，套用两个循环分别控制空格和图形的打印，具体方法实现如下。
	 * */
	public static void CreatIsoscelesTriangle1(int num) {
			// 此类为正三角型图形打印
		//判断行数为0或者小于0
		if(num<=0)
		{
			System.out.println("输入行数非法");
			return;
		}
			for (int i = 1; i <= num; i++) {

				// 此循环为打印空格，图形为一个倒的直角三角形
				for (int j = num; j >= i; j--) {
					System.out.print(" ");
				}
				// 此循环为打印*
				for (int j = 1; j <= i * 2 - 1; j++) {
					System.out.print("*");
				}
				//换行
				System.out.println();
			}

	}

	/*正三角形空心图形打印
	 * 首先定义最外层的循环，控制输出的三角型的行数。
	 * 在外层循环内套用两个循环，第一个循环控制一个倒直角三角形空格,第二个循环控制图形。
	 * 在控制图形的循环中套用条件判断来具体实现打印图形还是空格。具体实现方法如下。
	 * */
	public static void CreatIsoscelesTriangle2(int num) {
		// 此类为正三角型空心图形打印
		//判断行数为0或者小于0
				if(num<=0)
				{
					System.out.println("输入行数非法");
					return;
				}
		for (int i = 1; i <= num; i++) {

			// 此循环为打印空格，图形为一个倒的直角三角形
			for (int j = num; j >= i; j--) {
				System.out.print(" ");
			}
			// 此循环为打印*
			for (int j = 1; j <= i * 2 - 1; j++) {
				if(i==num&&j%2==1)
				{
					//打印最后一行的时候的判断以及最后一行的美观，判断奇偶来打印*
					System.out.print("*");
				}
				else if(j==1||j==i*2-1)
				{
					//判断当打印第一个*和最后一个*时候打印图形
					System.out.print("*");
				}
				else
				{
					//其他打印空格实现空心
					System.out.print(" ");
				}
			}
			//换行
			System.out.println();
		}

	}
	/*倒三角型图形打印方法，首先定义最外层的循环，控制输出的三角型的行数，
	 * 在外层循环中，套用两个循环分别控制空格和图形的打印，具体方法实现如下。
	 * */
	public static void CreatIsoscelesTriangle3(int num) {
		//此处为倒等腰三角形
		//判断行数为0或者小于0
				if(num<=0)
				{
					System.out.println("输入行数非法");
					return;
				}
		for (int i = 0; i < num; i++) {
			//此处为打印空格，图型为一个正的直角三角形
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			//此处打印*
			for(int j=1;j<=2*(num-i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*倒三角形空心图形打印
	 * 首先定义最外层的循环，控制输出的三角型的行数。
	 * 在外层循环内套用两个循环，第一个循环控制一个正直角三角形空格,第二个循环控制图形。
	 * 在控制图形的循环中套用条件判断来具体实现打印图形还是空格。具体实现方法如下。
	 * */
	public static void CreatIsoscelesTriangle4(int num) 
	{
		//判断行数为0或者小于0
		if(num<=0)
		{
			System.out.println("输入行数非法");
			return;
		}
		for(int i=1;i<=num;i++)
		{
			//空格，打印图形为一个空的正直角三角形
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//形状
			for(int j=1;j<=(num-i)*2+1;j++)
			{
				
				if(j==1||j==(num-i)*2+1)
				{
				//此判断为打印第一个*和最后一个*的时候打印此图形
					System.out.print("*");
				}
				else if(i==1&&j%2==1)
				{
				//此判断为打印第一个行时候全部打印图形，且利用打印数的奇偶性来美化图形。
					System.out.print("*");
				}
				else
				{
					 //其他打印空格
					System.out.print(" ");
				}
			}
			//换行
			System.out.println();
		}
	}
}
