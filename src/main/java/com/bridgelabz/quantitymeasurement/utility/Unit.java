package com.bridgelabz.quantitymeasurement.utility;

public enum Unit
{

    INCH(1, QuantityType.LENGTH), FEET(12, QuantityType.LENGTH),
    YARD(36, QuantityType.LENGTH), CENTIMETER(0.4, QuantityType.LENGTH),
    GALLON(3.78, QuantityType.VOLUME), LITRE(1.0, QuantityType.VOLUME),
    MILLILITRE(0.001,QuantityType.VOLUME);

    public enum QuantityType
    {
        LENGTH, VOLUME
    }

    public final double unitValue;
    public final QuantityType quantityType;


    Unit(double unitValue, QuantityType quantityType) {
        this.unitValue = unitValue;
        this.quantityType = quantityType;
    }
}