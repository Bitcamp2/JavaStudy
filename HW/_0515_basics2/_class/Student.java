package _0515_basics2._class;

public class Student {

   private String name;
   private int studentID;
   private String major;

   public Student(String name, int studentID, String major) {
      this.name = name;
      this.studentID = studentID;
      this.major = major;
   }
   public void setStudentInfo(String name, int studentID, String major) {
      this.name = name;
      this.studentID = studentID;
      this.major = major;
   }

   public void printStudentInfo() {
      System.out.println("Name: " + name);
      System.out.println("Student ID: " + studentID);
      System.out.println("Major: " + major);
   }


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getStudentID() {
      return studentID;
   }

   public void setStudentID(int studentID) {
      this.studentID = studentID;
   }

   public String getMajor() {
      return major;
   }

   public void setMajor(String major) {
      this.major = major;
   }
}
