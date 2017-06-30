import java.io.*;
import java.util.*;
public class CheckNo
{
public static void main(String args[])
{
Scanner sc=Scanner(System.in);
int n;
System.out.println("Enter the number");
n=sc.nextInt();
if(n>=1)
{
System.out.println("Positive");
}
else if(n<1)
{
System.out.println("Negative");
}
else if(n==0)
{
System.out.println("Zero");
}
}}
