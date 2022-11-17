package Main;

public class Person {

	public int age;
	public int birthDay;
	public int birthMonth;
	public int birthYear;
	public String PersonsName;
	
	public void calculateAge(int currentDay, int currentMonth, int currentYear) {
		
		if(currentMonth >= birthMonth) {
			if(currentDay >= birthDay) {
				this.age = currentYear - birthYear;
			}else {
				this.age = currentYear - (birthYear + 1);
			}
		}else {
			this.age = currentYear - (birthYear + 1);
		}
		
	}

	public int informAge() {
		
		return this.age;
	}
	
	public String informName() {
		
		return this.PersonsName;
	}
	
	public void adjustDateOfBirth(int day, int month, int yearOfBirth) {
	
		this.birthDay = day;
		this.birthMonth = month;
		this.birthYear = yearOfBirth;
	}
	

}
