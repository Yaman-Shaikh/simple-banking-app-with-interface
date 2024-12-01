import java.util.*;
interface Transaction
{	
	void Deposit(int Amount);
	void WithDraw(int Amount1);
	
}
class SavingAccount implements Transaction
{
	int balance=0,Amount,Amount1;
	public void Deposit(int Amount)
	{
		balance+=Amount;
		System.out.println("the balance in your saving Account is "+balance);
	}
	public void WithDraw(int Amount1)
	{
		if(Amount1<=balance)
		{
			balance-=Amount1;
			System.out.println("you withdraw  " + Amount1 + "Amount from your saving Account and the remain balance is " +balance);
		}
		else 
		{
			System.out.println("laudaya paise kama fir aa");
		}
	}
	public void Show(char ch)
	{
		System.out.println("the value is "+ch);
	}
}
class Current implements Transaction
{
	int balance=0,Amount,Amount1;
	public void Deposit(int Amount)
	{
		balance+=Amount;
		System.out.println("the balance in your Current Account is "+balance);
	}
	public void WithDraw(int Amount1)
	{
		if(Amount1<=balance)
		{
			balance-=Amount1;
			System.out.println("you withdraw  " + Amount1  + "Amount from your Current Account and the remain balance is " +balance);
		}
		else 
		{
			System.out.println("laudaya paise kama fir aa");
		}
	}
}
public class BankAccountyApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Transaction t=null;
		System.out.println("enter the number ");
		System.out.println("1- Saving account ");
		System.out.println("2- Current Account ");
		int result=xyz.nextInt();
		switch(result)
		{
			case 1:
			{
			
			System.out.println("enter the amount ");
			int Amount=xyz.nextInt();
				System.out.println("enter the withdraw ");
			int Amount1=xyz.nextInt();
				t=new SavingAccount();
				t.Deposit(Amount);
				t.WithDraw(Amount1);
				
				System.out.println("enter the number ");
				char ch=xyz.next().charAt(0);
				SavingAccount c=(SavingAccount)t;
				c.Show(ch);
				break;
			}
			
			
			case 2:
			{
			System.out.println("enter the amount ");
			int Amount=xyz.nextInt();
				
				System.out.println("enter the withdraw ");
			int Amount1=xyz.nextInt();
				t=new Current();
				t.Deposit(Amount);
				t.WithDraw(Amount1);
				break;
			}
			default :
			{
				System.out.println("invalid number ");
				return;
			}
		}
		
	}
}