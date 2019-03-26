
public class interest {

public double calSimpleInterest(float principle,float rateOfInterest,float timePeriod)
{
	return (principle*rateOfInterest*timePeriod)/100;
}

public double calCompoundInterest(float principle,float rateOfInterest,float timePeriod)
{
	return principle*(Math.pow((1+rateOfInterest/100), timePeriod));
}
}