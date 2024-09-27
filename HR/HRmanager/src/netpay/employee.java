package netpay;
import java.util.Scanner;
public class employee {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

String employeeName;
System.out.println("Enter Employee's Name:");
employeeName =input.nextLine();


double BasicSalary;
System.out.println("Enter Employee's Basic Salary:");
BasicSalary =input.nextDouble();


double Housingallowance = 0.10 * BasicSalary;



double Transportallowance =0.50 * Housingallowance;

double Grosspay = BasicSalary + Housingallowance + Transportallowance;
double NetPay;
String TaxStatus;


if (Grosspay >= 1000000) {
	NetPay =Grosspay -(0.10 * Grosspay);
	TaxStatus ="potential for tax";
}
  
else {
	NetPay =Grosspay;
	TaxStatus ="exemp from tax";
	
}


System.out.println("Employee's Name: " + employeeName);
System.out.println("Basic Salary: " + BasicSalary );
System.out.println("Housing Allowance is: " + Housingallowance);
System.out.println("Transport Allowence: " + Transportallowance);
System.out.println("Gross Pay: " + Grosspay);
System.out.println("Net Pay: " + NetPay);
System.out.println("Tax Status: " + TaxStatus);

	}

}
