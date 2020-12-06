package com.sedesoft.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.sedesoft.payroll" })
public class PayrollApplication  {

	public static void main(String[] args) {
		SpringApplication.run(PayrollApplication.class, args);
	}

}
