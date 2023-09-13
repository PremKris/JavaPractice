
public class Armstrong {
	public int armstrong(int num,int count)
	{
		int sum = 0;
		while (num!=0)
		{
			int rem = num%10;
			int powSum = (int) Math.pow(rem, count);
			sum = sum + powSum;
			num = num/10;
		}
		return sum;
	}

}
