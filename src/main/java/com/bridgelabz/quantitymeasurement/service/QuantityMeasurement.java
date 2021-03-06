package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.utility.Unit;

public class QuantityMeasurement implements IQuantityMeasurement
{
    Unit unit;
    double value;
    Unit.QuantityType quantityType;

    /**
     * CONSTRUCTOR TO INITIATE "unit" AND "value"
     * @param value provides value for "value" of this class
     * @param unit  provides unit for "unit" of this class
     */
    public QuantityMeasurement(double value, Unit unit)
    {
        this.value = value;
        this.unit = unit;
        this.quantityType = unit.quantityType;
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
        if (value < 0)
            throw new QuantityMeasurementException("Negative values are not Excepted",
                    QuantityMeasurementException.TYPE.NEGATIVE_QUANTITY);
        return value * unit.unitValue;
    }

    /**
     * METHOD TO COMPARE 2 GIVEN VALUES
     * @param quantity provides object for second unit type
     * @return result in boolean
     */
    public boolean compare(QuantityMeasurement quantity)
    {
        if (quantityType != quantity.quantityType)
            throw new QuantityMeasurementException("Given different type quantities can't be compared",
                    QuantityMeasurementException.TYPE.NON_COMPARABLE_QUANTITY);
        if (this.unit == quantity.unit)
            return equals(quantity);
        return Double.compare(convertValue(quantity.unit, quantity.value), convertValue(unit, value)) == 0;
    }

    /**
     * METHOD TO COMPARE 2 GIVEN TEMPERATURE VALUES
     * @param quantity provides object for second temperature value
     * @return result in boolean
     */
    public boolean compareTemperature(QuantityMeasurement quantity)
    {
        if (this.unit == Unit.CELSIUS)
            return Double.compare(((quantity.value - quantity.quantityType.temperatureConstant2)
                    * 1/quantity.quantityType.temperatureConstant1 ), this.value) == 0;
        return Double.compare(((quantity.value * quantity.quantityType.temperatureConstant1)
                + quantity.quantityType.temperatureConstant2), this.value) == 0;
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