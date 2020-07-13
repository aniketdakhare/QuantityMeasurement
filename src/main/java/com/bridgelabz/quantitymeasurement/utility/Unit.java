package com.bridgelabz.quantitymeasurement.utility;

public enum Unit
{
    INCH(1), FEET(12);

    public double value;

    Unit(double value)
    {
        this.value = value;
    }
}