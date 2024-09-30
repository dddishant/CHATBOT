import java.util.Scanner;
 class employee {
	String[] emp_id;
	String[] emp_name;
}

class Salary extends employee {
	String[] Designation;
	double[] monthly_salary;

	Salary(int j) {
		emp_name = new String[j];
		emp_id = new String[j];
		Designation = new String[j];
		monthly_salary = new double[j];
	}
void display(int j) {
	System.out.println("*************");
	System.out.println("Details of employee with salary > 20000");
	System.out.println("*************");

	System.out.format("%-15s %-15s %-25s %-10s %n", "emp_id", "emp_name", "Designation", "monthly_salary");
	System.out.println("*************");

	for(int i =0;i <j;i++) {
		if(monthly_salary[i] >= 20000) {
			System.out.format("%-15s %-15s %-25s %-10s %n", emp_id[i], emp_name[i], Designation[i], monthly_salary[i]);
		}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = args.length;
		Salary obj = new Salary(length);

		if (length == 0) {
			System.out.println("Please employee id");
		}
		for (int i = 0; i < length; i++) {
			obj.emp_id[i] = args[i];
			System.out.println("Enter details of employee id :" + args[i]);
			System.out.println("Name of employee");
			obj.emp_name[i] = sc.next();
			System.out.println("Designation-->");
			obj.Designation[i] = sc.next();
			System.out.println("Monthly salary-->");
			obj.monthly_salary[i] = sc.nextDouble();
		}
		obj.display(length);
}
}