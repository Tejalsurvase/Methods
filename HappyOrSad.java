import java.util.Scanner ;
class HappyOrSad 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

        int res = happySad(ip) ;
		
		while (true)
		{
			if (res == 1 || res == 4)
			{
				break ;
			}
			else
			{
				res = happySad(res) ;
			}
		}

		if (res == 1)
		{
			System.out.println("Happy Number.") ;
		}
	    else
	    {
			System.out.println("Sad Number.") ;
	    }
	}

	public static int happySad(int num)
	{
		int sum = 0 ;
		while (num != 0)
		{
			int rem = num % 10 ;
			sum += (rem * rem) ;
            num /= 10 ;
		}
		return sum ;
	}

}
