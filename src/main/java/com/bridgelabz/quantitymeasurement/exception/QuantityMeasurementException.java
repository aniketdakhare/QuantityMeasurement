package com.bridgelabz.quantitymeasurement.exception;

public class QuantityMeasurementException extends RuntimeException
{

    public enum TYPE
    {
        NEGATIVE_QUANTITY,NON_COMPARABLE_QUANTITY, NON_ADDABLE_QUANTITY
    }
    public TYPE type;

    public QuantityMeasurementException(String message, TYPE type)
    {
        super(message);
        this.type=type;
    }
}