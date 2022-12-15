package testProject1;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String numphone;
	private String name;
	private int age;
	private String gender;
	private String typeClient;
	//private List<Product> shopping;
	
	public Client() {
	}

	public Client(String numphone, String name, int age, String gender, String typeClient) {
		super();
		this.numphone = numphone;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.typeClient = typeClient;
		//this.shopping = new ArrayList<>();
	}

	
	public String getNumphone() {
		return numphone;
	}

	public void setNumphone(String numphone) {
		this.numphone = numphone;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	@Override
	public String toString() {
		return "Client [Numphone=" + numphone + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", typeClient=" + typeClient + "]";
	}
}
