import java.util.Scanner;
public class Task2_GradeCal 
{

    public static void main(String a[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("number of  subject are :");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.print("enter each subject marks out of 100 :");
        System.out.println();
        

        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
        }
        
        int sum=0;

        for(int i =0;i<marks.length;i++)
        {
            sum+=marks[i];
        }
        System.out.println("sum of marks is : " + sum);

        double average_percentage = sum/n;

        if(average_percentage>=90)
        {
            System.out.println("A+");
        }
        else if(average_percentage>=75 && average_percentage<=90)
        {
            System.out.println("A");
        }
        else if(average_percentage<=75 && average_percentage>=50 )
        {
            System.out.println("B+");
        }
        else if(average_percentage<=50 && average_percentage>=35)
        {
            System.out.println("B");
        }
        else if(average_percentage<=35 && average_percentage>=0)
        {
            System.out.println("C");
        }
        sc.close();

    }
    
}
