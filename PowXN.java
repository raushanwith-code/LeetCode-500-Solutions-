import java.util.*;
public class PowXN {

  public static void main(String[] args) {

    int ans=1;

    System.out.println("Enter A Number:=");
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();

    System.out.println("Enter Times of multiple:=");
    int x=Sc.nextInt();
    
    


  for(int i=0; i<x; i++){

   ans *=n;


  }

  System.out.println("Final ans is:=");

  System.out.println(ans);
    
  }
    
    
}
