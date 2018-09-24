// using constructor overloading program in java
class constr_overloading
{
    int id;
    String name;
    float salary;
    constr_overloading(int i,String n){               //passed to the constructor or special type of method without void 
        id=i;
        name=n;
    }

    constr_overloading(int i,String n,float s){               //this is other part for pass constructer overloading 
        id=i;
        name=n;
        salary=s;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }
    public static void main(String args[])
    {
        constr_overloading s1 = new constr_overloading(101,"Ambuj");    //in condtructor parameter passed here during object declaration
        constr_overloading s2 = new constr_overloading(102,"Nihal",3000);
        s1.display();
        s2.display();
    }
}