package com.example.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;

@Controller
public class CarController {

	@Autowired
	private Car cars;

	@Autowired
	private CarRepository repo;

	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public String initForm(Model model) {

		model.addAttribute("command", cars);

		return "addCar";

	}

	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Car cars, Model model) {

		// System.out.println(customer);

		int rowAdded = repo.addCars(cars);
		model.addAttribute("rowAdded", rowAdded);
		return "addCar";

	}

	@RequestMapping(value = "/cars/all", method = RequestMethod.GET)
	public String findAllCustomer(Model model) {

		List<Car> list = repo.getAllCars();
		model.addAttribute("list", list);

		return "showCars";

	}

	@RequestMapping(value = "/cars/status", method = RequestMethod.GET)
	public String getCarStatus(Model model) {

		List<Car> list = repo.getCarStatus();
		model.addAttribute("list", list);

		return "showSatus";

	}

	@ModelAttribute("status")
	public String[] status() {

		return new String[] { "sold", "unsold","blocked" };

	}

	@RequestMapping(value = "/cars/brand", method = RequestMethod.POST)
	public String findCarsByBrand(@ModelAttribute("command") @RequestParam("brand") String brand, Model model) {

		List<Car> list = repo.getsCarsByBrand(brand);

		model.addAttribute("list", list);
		return "carsbyBrandName";

	}

	@RequestMapping(value = "/cars/showbyBrand", method = RequestMethod.GET)
	public String initFormBrand(Model model) {

		model.addAttribute("command", cars);

		return "selectBrand";

	}

	@ModelAttribute("brands")
	public String[] brand() {

		String[] brands = repo.getBrand();
		return new String[] { "Maruti","TATA","Mahindra","Bmw" };
		
	}

}