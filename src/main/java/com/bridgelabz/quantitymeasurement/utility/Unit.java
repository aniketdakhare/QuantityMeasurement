package com.bridgelabz.quantitymeasurement.utility;

public enum Unit
{

    INCH(1), FEET(12), YARD(36), CENTIMETER(0.4);

    public final double unitValue;

    Unit(double unitValue)
    {
        this.unitValue = unitValue;
    }
}