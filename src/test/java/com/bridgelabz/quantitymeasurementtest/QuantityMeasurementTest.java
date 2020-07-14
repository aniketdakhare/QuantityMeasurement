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

    @Test
    public void givenLengthsInFeet_WhenCheckedForTheType_ShouldReturnFalse()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.FEET);
        Object length2 = new Object();
        boolean result = length1.equals(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInFeet_WhenCheckedForValue_ShouldReturnTrue()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(5.0, Unit.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(5.0, Unit.FEET);
        boolean result = length1.equals(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInch_WhenEqual_ShouldReturnTrue()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(0.0, Unit.INCH);
        boolean result = length1.equals(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInch_WhenOneOfTheLengthIsNull_ShouldReturnFalse()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.INCH);
        QuantityMeasurement length2 = null;
        boolean result = length1.equals(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInInch_WhenCheckedForTheReference_ShouldReturnFalse()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement();
        boolean result = length1.equals(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInInch_WhenCheckedForTheType_ShouldReturnFalse()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.INCH);
        Object length2 = new Object();
        boolean result = length1.equals(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInInch_WhenCheckedForValue_ShouldReturnTrue()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(5.0, Unit.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(5.0, Unit.FEET);
        boolean result = length1.equals(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInchAndFeet_WhenCheckedForValue_ShouldReturnTrue()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(12.0, Unit.INCH);
        QuantityMeasurement feetLength = new QuantityMeasurement(1.0, Unit.FEET);
        boolean result = inchLength.equals(feetLength);
        Assert.assertTrue(result);
    }
}