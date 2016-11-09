package arrays;

public class ArraysNum {
	/*
	 * 首先定义一个数组，创建4个变量分别为最大值，最小值，临时储存值，平均值。
	 * 然后利用循环+判断分别判断大小，两个判断之后保存最大值与最小值。
	 * 最后打印输出。
	 * */
		public static void better(int a,int b,int c, int d,int e)
		{
			int [] nums=new int[]{a,b,c,d,e};
			int max=nums[0]; int min=nums[0]; int tmp;double avg;
			for(int i=1;i<=nums.length-1;i++)
			{
				tmp=nums[i];
				if(tmp>max)
				{
					max=tmp;
				}
				else
				{
					continue;
				}
			}
			for(int i=1;i<=nums.length-1;i++)
			{
				tmp=nums[i];
				if(tmp<min)
				{
					min=tmp;
				}
				else
				{
					continue;
				}
			}
			avg=((double)min+(double)max)/2;
			System.out.println("此数组内一共有"+nums.length+"个元素，分别是");
			for (int i : nums) {
				System.out.print(i+"\t");
			}
			System.out.println();
			System.out.println("其中最大值为:"+max+"\t其中最小值为:"+min);
			System.out.println("最大值和最小值的平均数为："+avg);
		}
}
