import java.io.*;
import java.util.*;


public class GPA {
   
public static void main(String[] args) {
        MyMap<String,Double> grade = new MyMap<>();
        grade.put("A",  4.00);
        grade.put("A-",3.67);
        grade.put("B+",  3.33);
        grade.put("B",3.00);
        grade.put("B-",2.67);
        grade.put("C+",2.33);
        grade.put("C",  2.00);
        grade.put("C-",1.67);
        grade.put("D+",1.33);
        grade.put("D",  1.00);
        grade.put("FX",0.00);
        grade.put("F",  0.00);
        grade.put("FC",0.00);


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double total =0;
        for (int i = 0; i <n ; i++) {
            String str = scanner.next();
            double grades =  grade.get(str);
            total+=grades;
        }
        double GPA = total/n;
        System.out.println(GPA);
        
    }
}

