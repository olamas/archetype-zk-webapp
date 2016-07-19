package co.centauri.archetype.zk.webapp.domain;

public class User {
	  
	private Integer id;
	
	private String name;
	
	private String lastName;
	
	private String userName;
	
	private String image;
	
	private String password;
	
	private String email;
	
	public User() {
		
	}

	public User(Integer id, String name, String lastName, String userName, String image, String password,
			String email) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.userName = userName;
		this.image = image;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
