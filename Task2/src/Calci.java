
public class Calci {

	public double Add(double num1,double num2)
	{
	return num1+num2;
	}
	
	public double Mul(double number1,double number2)
	{
	return number1*number2;
	}
	
	public double Div(double number1,double number2)
	{
		try
		{
			return (number1/number2);
		}
		catch(Exception e)
		{
			return Integer.parseInt(e.getMessage());
		}
	}
}