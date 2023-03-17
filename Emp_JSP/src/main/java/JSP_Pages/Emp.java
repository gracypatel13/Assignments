package JSP_Pages;

public class Emp {
	
		private String name,email,password,city;
		private int id;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Emp(String name, String email, String password,String city, int id) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
			this.city= city;
			this.id = id;
		}
		public Emp() {
			// TODO Auto-generated constructor stub
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		

	

}
