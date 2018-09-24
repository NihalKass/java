class Student{
    int id;
    String name;
}

class Testclass{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.id=111;
        s1.name="Nihal";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}