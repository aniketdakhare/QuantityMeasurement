package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.utility.Unit;

public class QuantityMeasurement
{
    private double length;

    public QuantityMeasurement(double length, Unit unit)
    {
        this.length = (length * unit.value);
    }

    public QuantityMeasurement()
    {
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.length, length) == 0;
    }
}