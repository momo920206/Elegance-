package cale;

import java.util.Scanner;

public class caleDemo {
	public static void caleChicken(int money,int num)
	{
		//最外层循环计量公鸡的数量，循环的次数为输入的数量的最大值
		for(int rooster=0;rooster<=num/5;rooster++)
		{
			//次循环计量母鸡的数量，循环的次数为输入数量除以单价3
			for(int hen=0;hen<=num/3;hen++)
			{
				//内循环小鸡的数量，循环的次数为输入数量除以单价5
				for(int chicken=0;chicken<=num;chicken=chicken+3)
				{
					//加判断，满足判断打印只数，判断条件是所有鸡的综合为num，金额分别是各自数量乘以单价。
					if(chicken+hen+rooster==num && chicken/3+hen*3+rooster*5==money)
					{
					System.out.println("公鸡一共"+rooster+"只，"+"母鸡一共"+hen+"只，"+"小鸡一共"+chicken+"只");
					}
				}
			}
		}
	}
	
	public static void print(int num,int money)
	{
		int rooster=0;
		//最外层循环计量小鸡的数量，循环的次数为输入的数量的最大值
		for(int chicken=0;chicken<=num;chicken=chicken+3)
		{
			//次循环计量母鸡的数量，循环的次数为输入数量除以单价3
			for(int hen=0;hen<=num/3;hen++)
			{
				rooster=num-chicken-hen;
				if(rooster<0)
				{
					continue;
				}
				if(chicken+hen+rooster==num && chicken/3+hen*3+rooster*5==money)
				{
					System.out.println("公鸡一共"+rooster+"只，"+"母鸡一共"+hen+"只，"+"小鸡一共"+chicken+"只");
				}
			}
		}
	}
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			int num;
			int money;
			num=Integer.valueOf(scanner.next());
			money=Integer.valueOf(scanner.next());
			caleChicken(money,num);
			System.out.println();
			print(200, 300);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("输入非法");
		}
		
	}
}
