//default constructor example 
class student1                  //class name student1
{
    int id;
    String name;
    void student1()             //method name student1
    {
        System.out.println(id+" "+name);
    }


public static void main(String args[])
{
    student1 s1 = new student1();
    s1.student1();                 //calling without parameter 
}
}