package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.utility.Unit;

@FunctionalInterface
public interface IQuantityMeasurement
{
    Double convertValue(Unit unit, double length);

    default double addValues(QuantityMeasurement quantity1, QuantityMeasurement quantity2)
    {
        return convertValue(quantity1.unit, quantity1.value) + convertValue(quantity2.unit, quantity2.value);
    }
}