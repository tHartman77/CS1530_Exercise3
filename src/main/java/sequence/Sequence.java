package sequence;
import java.lang.*;
public class Sequence
{
	public static void main(String[] args) {

		if (args.length != 1)
		{
			System.exit(1);
		}

		int cmdline = -1;
		
		try {
    		cmdline = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
    		System.out.println("Not a number");
    		System.exit(1);
		}

		System.out.println("Tri(n) = " + triangle(cmdline));
		System.out.println("Lazy(n) = " + lazycaterer(cmdline));
	}

	public static int triangle (int x)
	{
		int ans = x + 1;
		ans = ans * x;
		ans = ans / 2;
		return ans;
	}

	public static int lazycaterer (int x)
	{
		double pow = Math.pow(x,2);
		int ans = (int)pow + x + 2;
		ans = ans / 2; 
		return ans;
	}
}