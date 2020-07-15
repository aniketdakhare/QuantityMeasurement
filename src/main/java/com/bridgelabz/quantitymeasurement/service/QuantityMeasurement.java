package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.utility.Unit;

public class QuantityMeasurement implements IQuantityMeasurement
{
    Unit unit;
    double value;

    /**
     * CONSTRUCTOR TO INITIATE "unit" AND "value"
     * @param value provides value for "value" of this class
     * @param unit  provides unit for "unit" of this class
     */
    public QuantityMeasurement(double value, Unit unit)
    {
        this.value = value;
        this.unit = unit;
    }

    public QuantityMeasurement() { }

    /**
     * METHOD TPO CONVERT VALUES IN REQUIRED UNIT TYPE
     * @param unit provides unit type
     * @param value provides value to get convert
     * @return returns converted value
     */
    @Override
    public double convertValue(Unit unit, double value)
    {
        return value * unit.unitValue;
    }

    /**
     * METHOD TO COMPARE 2 GIVEN VALUES
     * @param quantityType provides object for second unit type
     * @return result in boolean
     */
    public boolean compare(QuantityMeasurement quantityType)
    {
        if (this.unit == quantityType.unit || quantityType == null)
            return equals(quantityType);
        return Double.compare(convertValue(quantityType.unit, quantityType.value), convertValue(unit, value)) == 0;
    }

    /**
     * METHOD TO CHECK WHETHER GIVEN VALUES ARE EQUAL OR NOT
     * @param o provides the object for second unit type
     * @return result in boolean
     */
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