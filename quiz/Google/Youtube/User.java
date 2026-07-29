
package Google.Youtube;

public class User extends Youtube{

	public String name;
	public int age;
	public String email;
	
	public User(String name , int age ,String email){
		super("Google", "Neal Mohan" , "Social Media");
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public void userDetails(){
		System.out.println("User Name : " + name);	
		System.out.println("Age : " + age);	
		System.out.println("Email : " + email);	
	}

}
