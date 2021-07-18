package cybersoft.java12.springdemo.model;

public class Author {
	private String name;
	private String email;
	private String facebook;
	
	public Author() {
		name = "Đăng Khoa";
		email = "khoa@gmail.com";
		facebook = "https://khoatini";
		
		
	}

	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public String getFacebook() {
		return facebook;
	}

}
