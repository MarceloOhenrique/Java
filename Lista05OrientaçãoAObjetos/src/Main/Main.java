package Main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		item04();
	}
	
	public static void item01() {

		RemoteControl control = new RemoteControl(20,10);
		
		control.turnDownSound();
		control.changeChannel(50);
		control.increaseChannel();
		control.increaseChannel();
		
		System.out.println("Volume Sound: " + control.soundVolumeStatus());
		System.out.println("Channel Number: " + control.channelNumberStatus());
	}

	public static void item02() {
		
		Person person1 = new Person();
		Person person2 = new Person();

		person1.PersonsName = "Albert Einstein";
		person1.adjustDateOfBirth(14, 3, 1879);
		person1.calculateAge(23, 9, 2022);
		System.out.println("Name: " + person1.informName());
		System.out.println("Age: " + person1.informAge());
		
		System.out.println();
		
		person2.PersonsName = "Isaac Newton";
		person2.adjustDateOfBirth(4, 1, 1643);
		person2.calculateAge(23, 9, 2022);
		System.out.println("Name: " + person2.informName());
		System.out.println("Age: " + person2.informAge());
	}
	
	public static void item03() {
		
		Scanner sc = new Scanner(System.in);
		
		Circle circle1 = new Circle();
		
		System.out.print("Enter the Radius: ");
		circle1.radius = sc.nextDouble();
		
		System.out.println("Area: " + circle1.area());
		System.out.println("Circumference: " + circle1.circumference());

		System.out.print("Enter the Percentage of Radius Increase: ");
		double percentage = sc.nextDouble();
		circle1.enlargeCircle(percentage);
		
		System.out.println("New Area: " + circle1.area());
		System.out.println("New Circumference: " + circle1.circumference());
		
		sc.close();
	}
	
	public static void item04() {
		
		Scanner sc = new Scanner(System.in);

		Product product1 = new Product();
		
		System.out.print("Enter the Product Name: ");
		product1.productName = sc.nextLine();
		System.out.print("Enter the Cost Price: ");
		product1.costPrice = sc.nextFloat();
		System.out.print("Enter the Sale Price: ");
		product1.salePrice = sc.nextFloat();
		
		product1.calculationOfProfitMargin();
		
		System.out.println("Profit Margin: " + product1.profitMargin + "%");

		sc.close();
	}
	
	public static void item05() {
		
		Random rd = new Random(); 
		
		Employee employee1 = new Employee(514365, "Davy", "Alves");
		
		employee1.monthlySalary = 15000;
		
		System.out.println("First Name: " + employee1.firstName );
		System.out.println("Last Name: " + employee1.latName );
		System.out.println("id: " + employee1.id );

		System.out.println("Monthly Salary: " + employee1.monthlySalary );

		System.out.print("Worked Days:");
		for (int i = 0; i < employee1.workedDays.length; i++) {
			employee1.workedDays[i] = rd.nextBoolean();
			if(employee1.workedDays[i] == false) {
				employee1.workedDays[i] = rd.nextBoolean();
			}
			if(employee1.workedDays[i] == true) {
				System.out.print(" " + i);
				employee1.aux++;
			}
		}
		
		System.out.println("\nEmployee Salary: " + employee1.calculateEmployeeSalary());
	}
	
	public static void item06() {
		
		Elevator elevator1 = new Elevator();
		
		elevator1.start(10, 4);
		
		System.out.println("Current Floor: " + elevator1.getCurrentFloor());
		elevator1.up();
		elevator1.up();
		System.out.println("Current Floor: " + elevator1.getCurrentFloor());
		elevator1.down();
		System.out.println("Current Floor: " + elevator1.getCurrentFloor());
		
		
		elevator1.setPeopleInTheElevator(2);
		System.out.println("People In The Elevator: " + elevator1.getPeopleInTheElevator());
		elevator1.getOut();
		elevator1.getOut();
		System.out.println("People In The Elevator: " + elevator1.getPeopleInTheElevator());
		elevator1.getOut();
		System.out.println("People In The Elevator: " + elevator1.getPeopleInTheElevator());
	}
}
