public class Person {
    private String name;
    private int age,number;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age,int number) {
        this.name = name;
        this.age = age;
        this.setNumber(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}