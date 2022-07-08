package com.dufuna.berlin.davidadediji.tax.controller;


import com.dufuna.berlin.davidadediji.tax.dto.TaxResponseDTO;
import com.dufuna.berlin.davidadediji.tax.service.TaxService;
import com.dufuna.berlin.davidadediji.tax.service.TaxServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TaxEntityController {

    @GetMapping("/{amount}")
    public TaxResponseDTO getTaxOwed(@PathVariable Integer amount){
        TaxService service =new TaxServiceImpl();

        TaxResponseDTO tax = TaxResponseDTO.builder().income(amount).taxOwed(service.getTaxOwed(amount)).build();
        return tax;

    }
}
