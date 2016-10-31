// MathLab02st.java
// The Rational Class Program I
// This is the student, starting version of the MathLab02 assignment.


import javax.swing.JOptionPane;


public class MathLab02st
{
	public static void main (String args[])
	{   
		String strNbr1 = JOptionPane.showInputDialog("Enter Numerator "); 
		String strNbr2 = JOptionPane.showInputDialog("Enter Denominator ");

		int num = Integer.parseInt(strNbr1);
		int den = Integer.parseInt(strNbr2);

		Rational r = new Rational(num,den);
		JOptionPane.showMessageDialog(null,r.getOriginal() + " equals " + 
				r.getDecimal() + "\n and reduces to " + r.getRational());

          
		System.exit(0);
	}
}

				

class Rational
{
	int Num, Den;
	int Decimal;	
	int Rational;
	int Original;
	int Reduce;
	int firstNum;
	int firstDen;
	
//	Rational
	public Rational(int n, int d)
	{
		 firstNum = Num = n;
		 firstDen = Den = d;
		 reduce();
		 
	}
//	getNum
	public int getNum()
	{
		return Num;
	}
//	getDen
	public int getDen()
	{
		return Den;
	}

//	getDecimal
	public double getDecimal()
	{
		return (double) Num/Den;
	}

//	getRational 
	public String getRational()
	{
		return Num+"/"+Den;
	}
	
//	getOriginal
	public String getOriginal()
	{
		return firstNum+"/"+firstDen;
	}

//	reduce	
	public void reduce()
	{
		Num = firstNum / getGCF(firstNum, firstDen);
		Den = firstDen / getGCF(firstNum,firstDen);
	}

	private int getGCF(int n1,int n2)
	{
		int rem = 0;
		int gcf = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
		return gcf;
	}

} 




	

 


