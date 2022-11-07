import java.io.*;
import java.util.*;
import java.lang.*;

class GFG
{
static boolean divCount(int n)
{
	boolean hash[] = new boolean[n + 1];
	Arrays.fill(hash, true);
	for (int p = 2; p * p < n; p++)
		if (hash[p] == true)
			for (int i = p * 2; i < n; i += p)
				hash[i] = false;

	
	int total = 1;
    boolean kontrol=true;
	for (int p = 2; p <= n; p++)
	{
		if (hash[p])
		{
			int count = 0;
			if (n % p == 0)
			{
				while (n % p == 0)
				{
					n = n / p;
					count++;
				}
				total = total * (count + 1);
			}
		}
	}
  if(total % 2==0){
    kontrol=false;
  }else{
    kontrol=true;
  }
    
	return kontrol;
}

public static void main(String[] args)
{
  int count1=0;
  int count2=0;
  int count3=0;
  int count4=0;
  System.out.println("1. sýra için el kaldýrýlmýþ rakam sayýsý");
    System.out.println("");
  for(int i=1; i<=97;i+=4){
    if(divCount(i)==true){
      count1++;
    }
    
  }
  System.out.println(count1);
  System.out.println("");
  System.out.println("2. sýra için el kaldýrýlmýþ rakam sayýsý");
    for(int i=2; i<=98;i+=4){
    if(divCount(i)==true){
      count2++;
    }
    }
  System.out.println(count2);
  System.out.println("");
     System.out.println("3. sýra için el kaldýrýlmýþ rakam sayýsý");
    for(int i=3; i<=99;i+=4){
    if(divCount(i)==true){
      count3++;
    } 
    }
  System.out.println(count3);
  System.out.println("");
      System.out.println("4. sýra için el kaldýrýlmýþ rakam sayýsý");
    for(int i=4; i<=96;i+=4){
    if(divCount(i)==true){
      count4++;
    } 
    }
  System.out.println(count4);
      
   
	
}
}

