package com.MathDsa;

public class SqrtNo
{
/*
    public static void main(String[] args)
    {
        int n = 37;
        System.out.println(FindSqrt(n));
    }

    private static double FindSqrt(int n) {
        int s = 0;
        int e = n;
        int root = 0;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(mid*mid == n) return mid;
            if(mid*mid>n)  e = mid-1;
            else s = mid+1;
        }
        System.out.println("This program is only for perfect square root number.");
        return root;
    }
*/
    // NEWTON RAPHSON METHOD...
    public static void main(String[] args)
    {
        System.out.println(sqrt(123));
    }
    static double sqrt(int n)
    {
        double x = n;
        double root;
        double precision = 1e-15;
        while(true)
        {
            root = 0.5 * (x + (n/x));
            if(Math.abs(root - x) < precision) break;
            x = root;
        }
        return root;
    }
}
/*
   The Newton-Raphson method is an iterative numerical technique used for finding successively better approximations
    to the roots (or zeroes) of a real-valued function. It is a popular and efficient method for finding the roots
    of a real-valued function, especially when the function is differentiable.

The method starts with an initial guess, which can be any value, and then uses the derivative of the function to
find the tangent line to the graph of the function at that point. The method then computes the x-intercept of this
tangent line, which becomes the next approximation to the root. This process is repeated iteratively until the desired
 level of accuracy is achieved.

The formula for the Newton-Raphson method for finding the root of the function f(x) = 0 is:

It's important to note that the method may not always converge or may converge to a local minimum or maximum rather
 than a root, depending on the behavior of the function and the choice of the initial guess. Therefore, proper
  consideration should be given to the choice of the initial guess and the conditions of the function in the
   vicinity of the root.
 */