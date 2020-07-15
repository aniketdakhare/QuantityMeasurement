package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.utility.Unit;

@FunctionalInterface
public interface IQuantityMeasurement
{
    double convertValue(Unit unit, double value);

    /**
     * METHOD TO DO SUM OF 2 VALUES
     * @param quantity1 provides the object for first Unit type
     * @param quantity2 provides the object for second Unit type
     * @return sum of 2 values in double format
     */
    default double addValues(QuantityMeasurement quantity1, QuantityMeasurement quantity2)
    {
        return convertValue(quantity1.unit, quantity1.value) + convertValue(quantity2.unit, quantity2.value);
    }
}