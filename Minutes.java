import java.util.Scanner;
public class Minutes 
{
     public static void main(String []args)
     {
            double minutesinayear=24*60*365;
            Scanner s=new Scanner(System.in);
            System.out.print("Input the number of minutes:");
            double minutes=s.nextDouble();
            long years=(long)(minutes/minutesinayear);
            int days=(int)((minutes/60/24)%365);
            System.out.println((int)minutes+" minutes is approximately "+years+" years and"+days+" days");
       }
} 
