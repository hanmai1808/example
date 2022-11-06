package hw.car;

import java.util.ArrayList;
import java.util.List;

public class CarMain {

	public static void main(String[] args) {
		Brand brandMec = new Brand(1, "Mecedes");
		Brand brandToy = new Brand(2, "Toyota");

		CarModel car1 = new CarModel(1, "mec G63 2022B", "200", "black", "2m", "1000", 52000, 3); // refBrandID = 1
		CarModel car2 = new CarModel(2, "mec G63 2023W", "200", "white", "2m", "1000", 50000, 5); // refBrandID = 1
		CarModel car3 = new CarModel(3, "mec G63 2023B", "200", "blue", "2m", "1000", 50000, 5); // refBrandID = 1
		CarModel car4 = new CarModel(4, "mec G63 2023Y", "200", "yellow", "2m", "1000", 50000, 5); // refBrandID = 1

		car1.setBrandId(brandMec.getId());
		car2.setBrandId(brandMec.getId());
		car3.setBrandId(brandMec.getId());
		car4.setBrandId(brandMec.getId());

		CarModel car5 = new CarModel(5, "camry 2000", "200", "black", "2m", "1000", 50000, 0); // refBrandID = 2
		car5.setBrandId(brandToy.getId());

		Warehouse warehouseSydney = new Warehouse(1, "Syd", "12 nguyen binh khiem Q1");
		Warehouse warehouseMel = new Warehouse(2, "Mel", "78 To Ky Q12");

		Stock stockCamrySyd = new Stock(5, 1, 3);
		Stock stockCamryMel = new Stock(5, 2, 2);

		CarModel[] cars = { car1, car2, car3, car4, car5 };
		Brand[] brands = { brandMec, brandToy };
		Warehouse[] warehouses = { warehouseSydney, warehouseMel };
		Stock[] stocks = { stockCamrySyd, stockCamryMel };

		// BRAND (1) - (n) CARMODEL (RELATIONSHIP) -> 1 - n

		// function list out all Car Models of a specific Brand "Mecedes/1"
		// ng dung chon "Mecedes"

		List<CarModel> carList = getCarModelsByBrandName("Mecedes", brands, cars);

		for (CarModel carModel : carList) {
			System.out.println("carModel : " + carModel.getName() + ", " + carModel.getPrice());
		}

		for (Brand brand : brands) {
			System.out.println("brand : " + brand.getName());
		}

		// A Car Dealer sells cars
		// Car has name, speed, color, heigh, weight, price �
		// There are many brands (Mescedes, Honda, Toyota�)
		// one Car belong to 1 brand -> brand has many cars ?
		// Car belong to 1 type (C, S, B �)
		// Store manager can check stock and location where the car is stored.
		// Customer can make order to buy car, they can buy more than one car each time.

	}

	public static List<CarModel> getCarModelsByBrandName(String brandName, Brand[] brands, CarModel[] cars) {
		// get brandID from input brandName
		int brandId = getBrandIdFromBrandName(brandName, brands);
		List<CarModel> list = new ArrayList<CarModel>();

		for (CarModel carModel : cars) {
			if (carModel.getBrandId() == brandId) {
				list.add(carModel);
			}
		}

		return list;
	}

	public static int getBrandIdFromBrandName(String brandName, Brand[] brands) {
		for (Brand brand : brands) {
			if (brand.getName().equals(brandName)) {
				return brand.getId();
			}
		}
		return 0;
	}

}
