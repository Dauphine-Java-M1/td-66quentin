package fr.dauphine.ja.guardiaquentin.td00;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Math; 

public class PrimeCollection 
{
	ArrayList<Integer> numbers = new ArrayList<Integer>();
    public void setNumber()
    {
    	numbers.add(0);
    }
    public void initRandom(int n, int m) {
        Random rand = new Random(); 
    	for(int i=0;i<n;i++) 
    		numbers.add(rand.nextInt(m));
    		
    }
    static boolean isPrime(int p) {
    	for(int i=2;i<=Math.sqrt(p);i++){
    		if (p%i==0)
    				return false;
    	}
    	return true;
    }
    public void printPrimes() {
    	for(int i=0;i<numbers.size();i++)
    		if(isPrime(numbers.get(i)))
    			System.out.println(numbers.get(i));
    	
    }
	public static void main( String[] args )
    {
		PrimeCollection test = new PrimeCollection();
		test.initRandom(100,2000);
		test.printPrimes();
    }
}
