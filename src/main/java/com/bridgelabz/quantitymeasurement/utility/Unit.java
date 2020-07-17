package com.bridgelabz.quantitymeasurement.utility;

public enum Unit
{
    INCH(1, QuantityType.LENGTH), FEET(12, QuantityType.LENGTH),
    YARD(36, QuantityType.LENGTH), CENTIMETER(0.4, QuantityType.LENGTH),
    GALLON(3.78, QuantityType.VOLUME), LITRE(1.0, QuantityType.VOLUME),
    MILLILITRE(0.001,QuantityType.VOLUME), KILOGRAM(1.0, QuantityType.WEIGHT),
    GRAM(0.001, QuantityType.WEIGHT), TONNE(1000.0, QuantityType.WEIGHT),
    CELSIUS(1, QuantityType.TEMPERATURE), FAHRENHEIT(1, QuantityType.TEMPERATURE);

    public enum QuantityType
    {
        LENGTH, VOLUME, WEIGHT, TEMPERATURE(1.8, 32);

        public double temperatureConstant1;
        public int temperatureConstant2;

        QuantityType() { }

        QuantityType(double temperatureConstant1, int temperatureConstant2)
        {
            this.temperatureConstant1 = temperatureConstant1;
            this.temperatureConstant2 = temperatureConstant2;
        }
    }

    public final double unitValue;
    public final QuantityType quantityType;

    Unit(double unitValue, QuantityType quantityType)
    {
        this.unitValue = unitValue;
        this.quantityType = quantityType;
    }
}