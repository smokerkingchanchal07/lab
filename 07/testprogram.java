pacakage testprogram;
import java.utill.*;
public class primenumber {
 public static void main{String[]args) {
// TODO Auto-generated method stub 
 int temp,i,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
temp=sc.nextInt();
 for(i=2;i<temp; i++) {
if(temp%i==0) {
count++;
break;
 }
}
  if(count==0) {
     System.out.println("it is a prime number");
}else {
     System.out.println("it is not a prime number");
    }
  }
}