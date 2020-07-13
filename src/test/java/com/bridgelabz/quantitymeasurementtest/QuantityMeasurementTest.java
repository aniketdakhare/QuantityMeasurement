package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.service.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.utility.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest
{
    @Test
    public void givenLengthsInFeet_WhenEqual_ShouldReturnTrue()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(0.0, Unit.FEET);
        boolean result = length1.equals(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInFeet_WhenOneOfTheLengthIsNull_ShouldReturnFalse()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.FEET);
        QuantityMeasurement length2 = null;
        boolean result = length1.equals(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInFeet_WhenCheckedForTheReference_ShouldReturnFalse()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement();
        boolean result = length1.equals(length2);
        Assert.assertFalse(result);
    }


}