
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;
        Scanner sc = new Scanner(System.in);
        System.out.println("marks obtain in Maths");
        m1 = sc.nextInt();
        System.out.println("marks obtain in Science");
        m2 = sc.nextInt();
        System.out.println("marks obtain in So.Science");
        m3 = sc.nextInt();
        System.out.println("marks obtain in English");
        m4 = sc.nextInt();
        System.out.println("marks obtain in Hindi");
        m5 = sc.nextInt();

        int total = m1+m2+m3+m4+m5;
        System.out.println("Total marks obtain:"+total);

        float avg = total*100/500;
        System.out.println("Average Percentage obtain:"+avg);

        if (avg>=90){
            System.out.println("Grade Obtain:A");
        }
        else if (avg>=80){
            System.out.println("Grade Obtain:B");
        }
        else if (avg>=60){
            System.out.println("Grade Obtain:C");
        }
        else if (avg>=40){
            System.out.println("Grade Obtain:D");
        }
        else if (avg>=30){
            System.out.println("Grade Obtain:E");
        }
        else if (avg>=10){
            System.out.println("Grade Obtain:F");
        }
    }
}