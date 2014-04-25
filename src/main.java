import java.util.Scanner;

/*
 * Copyright (C) 2013 - Vladimir Jimenez
 * License: MIT
 */

//package main;

public class main
{
    public static void main (String args[])
    {
    	
        Polynomial myPolynomial = new Polynomial("-100x^(10) -2x^(4) - 10x^(3) + x^(2) + 9");
        Polynomial mySecondPolynomial = new Polynomial("3x^(6) + 4x^(4) + 10x^(3) + 2x^(2) + 19");
      

        System.out.println("1st polynomial is=");
        System.out.println(myPolynomial);
        
        System.out.println("2nd polynomial is=");
        System.out.println(mySecondPolynomial);
        
        System.out.println("Addition of these 2 polynomials=");
        System.out.println(myPolynomial.add(mySecondPolynomial));
        
        System.out.println("Substraction of these 2 polynomials=");
        System.out.println(myPolynomial.sub(mySecondPolynomial));
        
        System.out.println("multipication of these 2 polynomials=");
        System.out.println(myPolynomial.multiply(mySecondPolynomial).simplify());
        
        System.out.println("Devision of these 2 polynomials=");
        System.out.println(myPolynomial.devision(mySecondPolynomial).simplify());
    }
}
