package Main;

public class Elevator {

	private int currentFloor = 0;
	private int totalFloors;
	private int elevatorCapacity;
	private int peopleInTheElevator;
	
	public void start(int elevatorCapacity, int totalFloors) {
		
		this.elevatorCapacity = elevatorCapacity;
		this.totalFloors = totalFloors + 1;
	}
	
	public void getIn() {
		if(peopleInTheElevator < elevatorCapacity) {
			peopleInTheElevator++;
		}
	}
	
	public void getOut() {
		if(peopleInTheElevator != 0) {
			peopleInTheElevator--;
		}
	}
	
	public void up() {
		if(currentFloor != totalFloors) {
			currentFloor++;
		}
	}
	
	public void down() {
		if(currentFloor != 0) {
			currentFloor--;
		}
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		if(this.currentFloor <= totalFloors) {
			this.currentFloor = currentFloor;
		}
	}

	public int getTotalFloors() {
		return totalFloors;
	}

	public void setTotalFloors(int totalFloors) {
		if(totalFloors > 0) {
			this.totalFloors = totalFloors;
		}
	}

	public int getElevatorCapacity() {
		return elevatorCapacity;
	}

	public void setElevatorCapacity(int elevatorCapacity) {
		if(elevatorCapacity > 0) {
			this.elevatorCapacity = elevatorCapacity;
		}
	}

	public int getPeopleInTheElevator() {
		return peopleInTheElevator;
	}

	public void setPeopleInTheElevator(int peopleInTheElevator) {
		if(this.peopleInTheElevator <= elevatorCapacity) {
			this.peopleInTheElevator = peopleInTheElevator;
		}
	}
	
	
}
