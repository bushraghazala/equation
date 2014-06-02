package models;

import java.util.*;
import play.data.validation.Constraints.*;

public class Equation  {
  @Required
public double a; 
  @Required
public double  b;
  @Required
public double c;   

public double sol1;
public double sol2;
public double d; 


public  void  calculate(Equation e)
{
d=e.b*e.b - 4*e.a*e.c;  
if(d>0) {
//int dd=Integer.parseInt(Math.sqrt(d));
double dd= Math.sqrt(d); 
e.sol1=(-e.b + dd)/(2*e.a);
e.sol2=(-e.b - dd)/(2*e.a); 
}
else if(d==0)
{e.sol1=-(e.b)/(2*e.a);  }
}
}