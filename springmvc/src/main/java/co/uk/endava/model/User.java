package co.uk.endava.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class User 
{
	@NotEmpty(message = "The username field cannot be empty") @Size(min=5,max=30)
	private String username;
	
	@NotEmpty(message = "The password field cannot be empty") @Size(min=5,max=30)
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
