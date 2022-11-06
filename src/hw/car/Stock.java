package hw.car;

public class Stock {

	private int carModelId;
	private int warehouseId;
	private int quantity;

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(int carModelId, int warehouseId, int quantity) {
		super();
		this.carModelId = carModelId;
		this.warehouseId = warehouseId;
		this.quantity = quantity;
	}

	public int getCarModelId() {
		return carModelId;
	}

	public void setCarModelId(int carModelId) {
		this.carModelId = carModelId;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
