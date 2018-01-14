interface bank
{

abstract void deposit(int amt);
abstract void withdraw(int amt);
abstract int getbalance();
abstract double rateofintrest();

}

class account implements bank
{

int balance = 1000;

public void deposit(int amt)
{

balance+=amt;

}

public void withdraw(int amt)
{

balance-=amt;

}

public int getbalance()
{

return balance;

}

public double rateofintrest()
{

return 7.5;

}

}

class compute
{
public static void main(String[] args){
account ref= new account();

ref.deposit(5000);

ref.withdraw(2000);

System.out.println(ref.getbalance());

System.out.println(ref.rateofintrest());

}
}