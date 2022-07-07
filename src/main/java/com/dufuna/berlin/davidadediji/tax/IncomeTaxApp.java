package com.dufuna.berlin.davidadediji.tax;


import com.dufuna.berlin.davidadediji.tax.service.TaxService;
import com.dufuna.berlin.davidadediji.tax.service.TaxServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IncomeTaxApp {
    public static void main(String[] args) {
        SpringApplication.run(IncomeTaxApp.class, args);
        TaxService service = new TaxServiceImpl();
        System.out.println(service.getTaxOwed(190000));

    }

}
