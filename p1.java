import java.io.*;
import java.util.Scanner;
class p1 {
public static void main(String[] args){

Scanner myobj = new Scanner(System.in);
System.out.println("enter number a and b:");
int a = myobj.nextInt();
int b = myobj.nextInt();


int ans = (a > b) ? a : b;
while (true) {
if (ans % a == 0 && ans % b == 0)
break;
ans++;
}
System.out.println("LCM of " + a + " and " + b + " : " + ans);
}
}