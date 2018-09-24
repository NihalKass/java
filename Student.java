//program with main class and student class in same class
class Student
{
    int id;
    String name;
    int roll;

    public static void main(String args[]) 
    {                                            //main class in java
    Student s1=new Student();               //creating object for student or creating variable for the data type student
    s1.id=100;                              //input method
    s1.name="Nihal";
    s1.roll=31;  

    System.out.println(s1.id);
    System.out.println(s1.name);
    System.out.println(s1.roll);
    }

}