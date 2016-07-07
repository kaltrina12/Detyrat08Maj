import javax.swing.*;
public class sieveofEratosthenes {
	  public static void main(String[] args) 
	   { int N=new Integer(JOptionPane.showInputDialog("Write a number to find all primes less than the number: ")).intValue();
	   /* assume all integers less than N
		 * to be prime by default initializing
		 * corresponding primes array to false
		 */
		  boolean[] primes = new boolean[N];
		/* mark all multiples starting with 2
	    * as not prime by setting corresponding
	    * index of prime array to true
	    */
		  for (int i = 2; i < Math.sqrt(N); i++)
		  {
		    for (int j = 2; j*i < N; j++)
		    {
		    	if (!primes[j*i])
		    	{
			    primes[j*i] = true;
		    	}
		    	}
		    }
		// output list of primes
		  for (int i = 2; i<N; i++)
		  {
			  { if (!primes[i])
			System.out.print(i + " ");
			
			  }
			   
		  }
		  
	   }
	  
	  
	 }




