package People;
import java.util.Date;

public class Employee extends Person {
	private String office;
	private String salary;
	private Date date_hired = new java.util.Date();

	public Employee(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getDate_hired() {
		return date_hired;
	}

	public void setDate_hired(Date date_hired) {
		this.date_hired = date_hired;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + getName();
	}
}