// using constructor parameter program in java
class student2
{
    int id;
    String name;
    student2(int i,String n){               //passed to the constructor or special type of method without void 
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        student2 s1 = new student2(101,"Ambuj");    //in condtructor parameter passed here during object declaration
        student2 s2 = new student2(102,"Nihal");
        s1.display();
        s2.display();
    }
}