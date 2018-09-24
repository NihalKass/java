//output using method calling 
class student{
    int id;
    String name;
    void insert(int i,String n){            //method in student class for insert data
        id=i;
        name=n;
    }
    void display(){                         //method in student class for display output
        System.out.println(id+" "+name);
    }
}

class Testclass1{                            //main class or driver class
    public static void main(String args[])
    {
        student s1 = new student();
        student s2 = new student();
        s1.insert(101,"Rahul");
        s2.insert(102,"Ranjan");
        s1.display();
        s2.display();
    }
}