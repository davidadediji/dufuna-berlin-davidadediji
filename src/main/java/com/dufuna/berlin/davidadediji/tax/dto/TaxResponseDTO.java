package com.dufuna.berlin.davidadediji.tax.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TaxResponseDTO - class to build custom json response
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaxResponseDTO {
    private int income;
    private double taxOwed;
}
