package com.bridgelabz.quantitymeasurement.service;

import com.bridgelabz.quantitymeasurement.utility.Unit;

public class QuantityMeasurement
{
    /**
     * METHOD TO CONVERT INTO CORRESPONDING LENGTHS AND TO COMPARE IT
     * @param units provides type of units
     * @param length provides corresponding lengths
     * @return result after comparing the values
     */
    public boolean compareLengths(Unit[] units,double... length)
    {
        double value1 = (length[0] * units[0].value);
        double value2 = (length[1] * units[1].value);
        return Double.compare(value1, value2) == 0;
    }
}