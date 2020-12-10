package com.example.mybatisspringboot;

import com.example.mybatisspringboot.mapper.CountryMapper;
import com.example.mybatisspringboot.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MybatisSpringbootApplication implements CommandLineRunner {
    @Autowired
    private CountryMapper countryMapper;
    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringbootApplication.class, args);
    }

    public void run(String... args) throws Exception {
        List<Country> countryList=countryMapper.selectAll();
        for (Country country:countryList){
            System.out.println(country.getId()+country.getCountryname()+country.getCountrycode());
        }
    }
}
