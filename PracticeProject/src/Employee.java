
public class Employee {
	
private String name;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

private int salary;

public Employee(String name,int salary){
	this.name = name;
	this.setSalary(salary);
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String toString(){
	return "Name:"+this.getName()+" Salary:"+this.getSalary();
	
}

}
