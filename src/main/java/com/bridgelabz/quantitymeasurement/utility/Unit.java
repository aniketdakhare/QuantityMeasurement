package com.bridgelabz.quantitymeasurement.utility;

public enum Unit
{

    INCH(1), FEET(12), YARD(36);

    public final double value;

    Unit(double value)
    {
        this.value = value;
    }
}