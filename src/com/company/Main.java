package com.company;


public class Main
{

    public static void main(String[] args)
    {


    }

    public int factorial(int number){
        if (number>=0){
            int fact = 1;
            for(int i=1;i<=number;i++){
                fact=fact*i;
            }
            //System.out.println("Factorial of "+number+" is: "+fact);
            return fact;

        }
          throw new IllegalArgumentException("We don't do that here, positive vibes only");



    }



//fibonacci
    public int fibonacci(int number) {
        int n1=0,n2=1,n3,i;

        System.out.printf("\n%d %d",n1,n2);//printing 0 and 1
        for(i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.printf(" %d",n3);
            n1=n2;
            n2=n3;
        }
        return 0;

    }




}