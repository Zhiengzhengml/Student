import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the count of student:");
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();
        reader.nextLine();
        Student [] studentArr = new Student[count];


        for(int i=0;i<count;i++){
            System.out.println("Enter student ID:");
            String ID = reader.nextLine();

            System.out.println("Enter student Name:");
            String Name = reader.nextLine();
            
            System.out.println("Enter number of extra activities:");
            int number = reader.nextInt();
            reader.nextLine();

            Student student = new Student(ID,Name, number);
           for(int j=0;j< number;j++);{
            student.addActivities(number);
        }
        studentArr[i]=student;
        
    }
        for(int i=0;i<count;i++){
        System.out.println(studentArr[i]);
        }
        reader.close();

    }
}
