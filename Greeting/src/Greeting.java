public class Greeting {
	private long id;
	private String name;
	
	//constructor 
	public Greeting(long id, String name) {
		super();
		this.id = id;
		this.name = name;

	}
	//methods
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}



