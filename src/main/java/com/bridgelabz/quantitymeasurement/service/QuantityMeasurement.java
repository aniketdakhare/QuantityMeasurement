package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.utility.Unit;

public class QuantityMeasurement implements IQuantityMeasurement
{
    Unit unit;
    double value;

    public QuantityMeasurement(double value, Unit unit)
    {
        this.value = value;
        this.unit = unit;
    }

    public QuantityMeasurement() { }

    @Override
    public Double convertValue(Unit unit, double length)
    {
        return length * unit.unitValue;
    }

    public boolean compare(QuantityMeasurement quantityType)
    {
        if (this.unit == quantityType.unit || quantityType == null)
            return equals(quantityType);
        return Double.compare(convertValue(quantityType.unit, quantityType.value), convertValue(unit, value)) == 0;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }
}