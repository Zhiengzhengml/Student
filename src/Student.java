import java.util.Scanner;
import java.util.Arrays;

public class Student {
    
    Scanner reader = new Scanner(System.in);
    private String studentID;
    private String studentName;
    private String [] extraActivities;
    
    public Student(String studentID, String studentName, int number) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[number];
    }
    
    public Student(){}
    
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String[] getExtraActivities() {
        return extraActivities;
    }
    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    public void addActivities(int number){
        for(int i=0; i<extraActivities.length ; i++){
            System.out.println("Enter activity" + (i+1) + ":");
            extraActivities[i]=reader.nextLine();
        }

    }


    @Override
    public String toString(){
        return "Student details: studentID=" + studentID + ",studentName=" + studentName + "," + "extraActivities=" + Arrays.toString(extraActivities);
    }
}
