// write a java program to find a factorial number.

package testprogram;
import java.utill.*;
 public class Factorialnumber {
public static void main(String[]args) {
  int i;
int fact =1;
  int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
num=sc.nextInt();
 for (i=1;i<=num;i++) {
   fact=fact*i;
Sysrem.out.println("factorial is"+fact);
   }
 }
}
