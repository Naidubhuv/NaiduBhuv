import java.util.Scanner;
class student1{
    public 
        student1(){
            System.out.println("Hi! constructer has been created");
        }
        String fullName;
        int rollNum;
        double semPerentage;
        String collegeName;
        int collegeCode;
}
class student{
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        student1 naidu=new student1();
        System.out.println("Enter your name :");
        naidu.fullName=op.next();
        System.out.println("Enter your rollnumber :");
        naidu.rollNum=op.nextInt();
        System.out.println("Enter your sempercantage :");
        naidu.semPerentage=op.nextInt();
        System.out.println("Enter your collegename :");
        naidu.collegeName=op.next();
        System.out.println("Enter your collegecode :");
        naidu.collegeCode=op.nextInt();
        System.out.println("Name : "+naidu.fullName+"\nRoll number : "+naidu.rollNum+"\nSempercentage : "+naidu.semPerentage+"\nCollegename : "+naidu.collegeName+"\nCollegecode : "+naidu.collegeCode);

    }
}
