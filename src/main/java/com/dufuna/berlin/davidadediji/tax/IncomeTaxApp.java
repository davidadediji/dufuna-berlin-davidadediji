package com.dufuna.berlin.davidadediji.tax;

import com.dufuna.berlin.davidadediji.tax.service.TaxService;
import com.dufuna.berlin.davidadediji.tax.service.TaxServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Income Tax App
 * @author davidadediji
 */
@SpringBootApplication
public class IncomeTaxApp {
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(IncomeTaxApp.class, args);
        TaxService service = new TaxServiceImpl();
        System.out.println(service.getTaxOwed(190000));

    }

}
