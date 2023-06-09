package compositeDesignPattern;

public class SalesDepartment implements Department {
	
	private Integer id;
	private String name;
	
	public SalesDepartment() {
		
	}
	
	public SalesDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
	}
	

	@Override
	public String toString() {
		return "SalesDepartment [id=" + id + ", name=" + name + "]";
	}

}
