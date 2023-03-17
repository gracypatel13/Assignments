package Personal_Details;

public class User {
	private int id;
	private String name,address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void createUser(User u1) {
		// TODO Auto-generated method stub
		
	}
	
	

}
