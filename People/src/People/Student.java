package People;

public class Student extends Person {

	public Student(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}

	public static final int Freshman = 1;
	public static final int Sophmore = 2;
	public static final int Junior = 3;
	public static final int Senior = 4;

	@Override
	public String toString() {
		return this.getClass().getName() + getName();
	}

}