package com.dufuna.berlin.davidadediji.tax.controller;


import com.dufuna.berlin.davidadediji.tax.dto.TaxResponseDTO;
import com.dufuna.berlin.davidadediji.tax.service.TaxService;
import com.dufuna.berlin.davidadediji.tax.service.TaxServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.lang.annotation.Documented;

/**
 * TaxEntityController - http class for Tax entity calculation
 */

@RestController
@RequestMapping("/api/v1")

public class TaxEntityController {
    TaxService service =new TaxServiceImpl();

    /**
     *
     * @param amount in integer
     * @return TaxResponse as Response entity
     */

    @GetMapping("/{amount}")
    @ResponseStatus(HttpStatus.OK)
    @RolesAllowed("admin")
    public TaxResponseDTO getTaxOwed(@PathVariable Integer amount){
        TaxResponseDTO tax = TaxResponseDTO.builder().income(amount).taxOwed(service.getTaxOwed(amount)).build();
        return tax;

    }
}
