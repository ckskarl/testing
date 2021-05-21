package problemdomain;

public class Gizmo {
	private int id;
	private String name;
	private int quantity;
	private double price;
	
	public Gizmo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Gizmo(int id, String name, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Gizmo [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}


	public void add(Gizmo gizmo) {
		// TODO Auto-generated method stub
		
	}
	
	

}
