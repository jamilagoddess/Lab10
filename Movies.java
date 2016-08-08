package Lab10;

public class Movies {

	private String title = "";
	private String category = "";
	
	//declare and initialize properties here
	/*private Movies(String title, String category) {
		setTitle(title);
		setCategory(category);*/
		
	
	public void setTitle(String title) {
		this.title = title;		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setCategory(String category) {
		this.category = category;		
	}
	
	public String getCategory() {
		return category;
	}

	//public void printMovie() {
		//System.out.println(title + ": " + category);
	//}
	
	public Movies(String title, String category) {
		//super();
		this.title = title;
		this.category = category;
	}

	public static void add(String title, String category) {
		// TODO Auto-generated method stub
		
	}
	}

//the following example code creates an object and lists items inside:
//ArrayList<Employee> list = new ArrayList();
//list.add(new Employee ("Jamila", "Carrington Smith","President",1));

