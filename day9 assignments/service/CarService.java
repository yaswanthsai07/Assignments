package com.ey.sapient.asde.service;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.ey.sapient.asde.model.Car;

public interface CarService{
	public double sumOfPrices(List<Car> carList);
	public List<String> getCarNames(List<Car> carList);
	public Set<String> getCarMakers(List<Car> carList);
	//returns price of the car which has highest price
	public double getHighPricedCar(List<Car> carList);
	//returns Car which has lowest price
	public Car getCarWithLowPricedCar(List<Car> carList);
}
