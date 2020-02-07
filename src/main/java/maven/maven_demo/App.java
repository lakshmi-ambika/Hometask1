package maven.maven_demo;

/**
 * Hello world!
 *
 */
import java.util.*;
class Sweets
{
 Scanner sc=new Scanner(System.in);
 static int no_of_chos;
 static int no_of_candies;
 int quan=0;
 public Sweets() {}
 public Sweets(int choco,int candi,int quantity)
 {
  no_of_chos=choco;
  no_of_candies=candi;
  quan=quantity;
 }
 public void cal_weight()
 {
  System.out.println(no_of_chos+no_of_candies+quan);
 }
 
}
class Choclates extends Sweets
{
 String temp;
 Scanner sc=new Scanner(System.in);
 String names[]=new String[no_of_chos];
 public void input()
 {
 Scanner sc=new Scanner(System.in);
 for(int i=0;i<no_of_chos;i++)
 {
  System.out.println("enter choclate name");
  names[i]=sc.next();
 }
 }
 public void sort(String ch)
 {
  for(int i=0; i<no_of_chos; i++)
        {
            for(int j=1; j<no_of_chos; j++)
            {
                if(names[j-1].compareTo(names[j])>0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
  if(ch.equals("a"))
   for(int i=0;i<no_of_chos;i++)
    System.out.println(names[i]);
  else
   for(int i=(no_of_chos-1);i>=0;i--)
    System.out.println(names[i]);
 }
}
class Candies extends Sweets
{
 public void count()
 {
  if(no_of_candies<=10 && no_of_candies>0)
   System.out.println("no. of candies lies in between 1 and 10 ");
  else if(no_of_candies<=50 && no_of_candies>10)
   System.out.println("no. of candies lies in between 50 and 10 ");
  else
   System.out.println("candies are more than 50");
   
 }
}
public class App
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  int nchoc,ncand,ch,nsweet;
  System.out.println("enter no. of gifts");
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
  {
   System.out.println("enter total sweet quantity");
   nsweet=sc.nextInt();
   System.out.println("enter no. of candies");
   ncand=sc.nextInt();
   System.out.println("enter no. of choclates");
   nchoc=sc.nextInt();
   Sweets s1=new Sweets(nchoc,ncand,nsweet);
   Choclates c1=new Choclates();
   c1.input();
   while(true)
   {
   System.out.println("1.Total weight\n2.sorting the choclates\n3.no. of candies\n4.exit");
   ch=sc.nextInt();
   if(ch==1)
    s1.cal_weight();
   else if(ch==2)
   {
    System.out.println("enter 'a' for ascending order\n enter 'd' for descending order");
    String a=sc.next();
    c1.sort(a); 
   }
   else if(ch==3)
   {
    if(ncand==0)
     System.out.println("zero candies");
    else
    {
     Candies c2=new Candies();
     c2.count();
    }
   }
   else
    break;
   }
   System.out.println((i+1)+" gift completed");
   System.out.println("enter new gift details");
  }
   
 }
}

