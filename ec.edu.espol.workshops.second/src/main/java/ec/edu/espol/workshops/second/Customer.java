package ec.edu.espol.workshops.second;

public class Customer {
	private int age;
	private char sex;
	private boolean isMarried;
	
	public Customer(int age, char sex, boolean isMarried) {
		this.age = age;
		this.sex = sex;
		this.isMarried = isMarried;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setIsMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
}
