import java.util.Scanner ;
class Arm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

		if (isArm(ip))
		{
			System.out.println("Is armstrong number.") ;
		}
		else
		{
			System.out.println("Is not armstrong number.") ;
		}
	}

	public static int count(int num)
	{
		int count = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			count++ ;
		}
		return count ;
	}

	public static int power(int base, int raise)
	{
		int pow = 1 ;
		for (int i = 0; i < raise; i++)
		{
			pow *= base ;
		}
		return pow ;
	}

	public static boolean isArm(int num)
	{
		 int ct = count(num) ;
		 int sum = 0 ;
		 for (int i = num; i != 0; i /= 10)
		 {
			 int rem = i % 10 ;
			 sum += power(rem, ct) ;
		 }
		 return num == sum ;
	}
}
