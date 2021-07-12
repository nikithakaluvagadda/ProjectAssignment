
package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public class CarRepository {

	@Autowired
	private JdbcTemplate template;

	public int addCars(Car car) {

		SimpleJdbcInsert inserter = new SimpleJdbcInsert(template);

		inserter.withTableName("car").usingColumns("model", "year", "kilometers", "brand", "status");
		BeanPropertySqlParameterSource sql = new BeanPropertySqlParameterSource(car);
		return inserter.execute(sql);

	}

	public List<Car> getAllCars() {

		String sql = "select * from car";

		List<Car> carsList = template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));

		return carsList;

	}

	public List<Car> getCarStatus() {

		String sql = "select * from car where status='unsold'";

		List<Car> carsStatus = template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));

		return carsStatus;

	}

	public List<Car> getsCarsByBrand(String brand) {

		String sql = "select * from car where brand=?";
		List<Car> cars = template.query(sql, new Object[] { brand }, new BeanPropertyRowMapper<>(Car.class));

		return cars;

	}

	public String[] getBrand() {
		String sql = "select distinct(brand) from car";
		List<String> list = template.queryForList(sql, String.class);
		String[] brands = list.toArray(new String[list.size()]);

		return brands;

	}

}