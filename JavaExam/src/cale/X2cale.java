package cale;

public class X2cale {
	/*
	 * 首先定义两个变量x1，x2。再定义b平方-4ac的一个变量。首先判断a的值为不为0；
	 * 当a=0时这个式子无意义，所以直接先判断，如果为0直接跳出。
	 * 然后根据公式来实现这个式子。
	 * */
	public static void cale(int a,int b, int c)
	{
		double x1=0; double x2=0;
		double dat=b*b-4*a*c;
		if(a==0)
		{
			System.out.println("输入值非法");
			return;
		}
		//当dat小于0的判断
		else if(dat<0)
		{
			System.out.println("此二元一次方程没有实数根");
		}
		//当dat等于0的判断
        else if(dat==0) 
		{
			x1=x2=(-b)/2*a;
			System.out.println("此一元二次方程组其中一个解X1="+x1+"另一个解X2="+x2);
		}
		//当dat大于0的判断
		else if(dat>0)
		{
			x1=(-b+Math.sqrt(dat))/2*a;
			x2=(-b-Math.sqrt(dat))/2*a;
			System.out.println("此一元二次方程组其中一个解X1="+x1+"另一个解X2="+x2);
		}
		
	}
}
