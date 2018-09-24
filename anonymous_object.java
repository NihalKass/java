//prime class for anonymous object call
class prime
{
    void p(int n)                       //method to acess anonymous object 
    {
        for(int i=1;i<=n;i++)
        {
            int count =0;
           for(int j=1;j<=n;j++)
           {
               if(i%j==0)
               count++;
           } 
           if(count==2)
           System.out.println(i+" ");
        }
    }
}
class anonymous_object{                         //main class or driver
    public static void main(String args[])
    {
        new prime().p(10);                      //way to initialize anonymous object
    }
}