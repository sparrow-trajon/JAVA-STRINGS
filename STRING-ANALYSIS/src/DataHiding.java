
public class DataHiding {
	
	private String name ;
	private String rollNo;
	
	
	public static void main(String[] args) {
		
		DataHiding dataHiding= new DataHiding();
		
		dataHiding.setName("Ram");
		dataHiding.setRollNo("Ayodhya");
		
		System.out.println("name is >>>"+dataHiding.getName());
		System.out.println("roll no is >>>"+dataHiding.getRollNo());
		
		
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public String getRollNo() {
		return this.rollNo;
		
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public void setRollNo(String rollNo) {
		this.rollNo=rollNo;
		
	}
}
