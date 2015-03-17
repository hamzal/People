package People;

public class Faculty extends Employee {
	private String office_hours;
	private String rank;

	public Faculty(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}

	public String getOffice_hours() {
		return office_hours;
	}

	public void setOffice_hours(String office_hours) {
		this.office_hours = office_hours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + getName();

	}
}
