package People;

public class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + getName();
	}

}
