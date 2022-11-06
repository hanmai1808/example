package hw.car;

public class CarModel {
	private int id;
	private String name;
	private String speed;
	private String color;
	private String height;
	private String weight;
	private double price;
	private int totalInStockNumber;
	private int brandId;

	public CarModel() {
		// TODO Auto-generated constructor stub
	}

	public CarModel(int id, String name, String speed, String color, String height, String weight, double price,
			int totalInStockNumber) {
		super();
		this.id = id;
		this.name = name;
		this.speed = speed;
		this.color = color;
		this.height = height;
		this.weight = weight;
		this.price = price;
		this.totalInStockNumber = totalInStockNumber;
	}

	public int getTotalInStockNumber() {
		return totalInStockNumber;
	}

	public void setTotalInStockNumber(int totalInStockNumber) {
		this.totalInStockNumber = totalInStockNumber;
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

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

}
