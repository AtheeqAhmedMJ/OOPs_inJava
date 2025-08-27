import java.util.Arrays;
class Student{
    String name;
    int rollNumber;
    int[] marks; 
    char grade;
    
    Student(String n, int rn, int[] m){
        this.name=n;
        this.rollNumber=rn;
        this.marks=m;
    }
    
    public int calculateTotal() {
        int tsum = 0;
        for(int i : marks){
            tsum += i;
        }
        return tsum;
    }
    public double calculateAverage() {
        return calculateTotal() * 1.0 / marks.length;
    }
    
    public void calculateGrade(){
        double avg = calculateAverage();
        if(avg > 90){
            grade = 'A';
        } else if(avg > 80){
            grade = 'B';
        } else if(avg > 70){
            grade = 'C';
        } else {
            grade = 'F';
        }
    }
    public void displayStudentDetails(){
        calculateGrade();
        System.out.println("Name "+name);
        System.out.println("Roll Number "+rollNumber);
        System.out.println("Marks "+(Arrays.toString(marks)));
        System.out.println("Total "+calculateTotal());
        System.out.println("Grade "+grade);
    }
}

public class Main {
    public static void main(String[] args){
        int[] marks1 = {100, 85, 73, 91, 43};
        int[] marks2 = {78, 82, 69, 74, 80};
        int[] marks3 = {92, 95, 98, 90, 94};

        Student s1 = new Student("MJ", 1, marks1);
        Student s2 = new Student("Bhavana", 2, marks2);
        Student s3 = new Student("Arshiya", 3, marks3);

        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
        
    }
}
