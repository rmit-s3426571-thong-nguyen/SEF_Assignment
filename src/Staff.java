import java.util.Scanner;

public class Staff {
	private String name;
	private String username;
	private String password;
	private String rights;
	
	Scanner sc = new Scanner(System.in);

	public Staff(String name, String username, String password, String rights)
	{
		this.name = name;
		this.username = username;
		this.password = password;
		this.rights = rights;
	}
	
	//getters
	public String getName() { return name; }
	public String getUsername() { return username; }
	public String getPassword() { return password; }
	public String getRights() { return rights; }
	
	
}
