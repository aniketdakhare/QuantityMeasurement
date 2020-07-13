package com.bridgelabz.quantitymeasurement.utility;

public enum Unit
{

    INCH(1), FEET(12);

    private final double value;

    Unit(double value)
    {
        this.value = value;
    }

    public double returnValue()
    {
        return value;
    }
}
