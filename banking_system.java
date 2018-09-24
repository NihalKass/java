class account
{
    int Id;
    float amount;
    String name;
    void insert(int i,float amt,String n)
    {
        Id=i;
        amount=amt;
        name=n;
    }
    void chcekbalance(int i,String n )
    {
        if(i==Id && n==name)
        System.out.println("Current balance is"+amount);
    }
    void debit(int i,float amt,String n)
    {
        if(i==Id && n==name)
        {
            amount = amount - amt;
        }
    }
    void credit(int i,float amt,String n)
    {
        if(i==Id && n==name)
        {
            amount = amount + amt;
        }
    }

}

class banking_system{
    public static void main(String args[])
    {
        account a1 = new account();
        a1.insert(101,5000,"Nihal");
        a1.chcekbalance(101,"Nihal");
        a1.debit(101,2000,"Nihal");
        a1.chcekbalance(101,"Nihal");
        a1.credit(101,6000,"Nihal");
        a1.chcekbalance(101,"Nihal");
    }
}