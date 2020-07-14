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
    public void givenLengthsInInch_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(5.0, Unit.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(5.0, Unit.FEET);
        boolean result = length1.equals(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInchAndFeet_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(12.0, Unit.INCH);
        QuantityMeasurement feetLength = new QuantityMeasurement(1.0, Unit.FEET);
        boolean result = inchLength.equals(feetLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(3.0, Unit.FEET);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = feetLength.equals(yardLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = feetLength.equals(yardLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInInchAndYard_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(1.0, Unit.INCH);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = inchLength.equals(yardLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInInchAndYard_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(36.0, Unit.INCH);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = inchLength.equals(yardLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInYardAndInch_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(36.0, Unit.INCH);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = yardLength.equals(inchLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInYardAndFeet_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(3.0, Unit.FEET);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = yardLength.equals(feetLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInchAndCentimeter_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement cmLength = new QuantityMeasurement(5.0, Unit.CENTIMETER);
        boolean result = inchLength.equals(cmLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInchAndCentimeter_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement cmLength = new QuantityMeasurement(2.0, Unit.CENTIMETER);
        boolean result = inchLength.equals(cmLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInFeetAndCentimeter_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(2.0, Unit.FEET);
        QuantityMeasurement cmLength = new QuantityMeasurement(60.0, Unit.CENTIMETER);
        boolean result = feetLength.equals(cmLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInFeetAndCentimeter_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(2.0, Unit.FEET);
        QuantityMeasurement cmLength = new QuantityMeasurement(2.0, Unit.CENTIMETER);
        boolean result = feetLength.equals(cmLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInYardAndCentimeter_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement yardLength = new QuantityMeasurement(2.0, Unit.YARD);
        QuantityMeasurement cmLength = new QuantityMeasurement(180.0, Unit.CENTIMETER);
        boolean result = yardLength.equals(cmLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInYardAndCentimeter_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement yardLength = new QuantityMeasurement(2.0, Unit.YARD);
        QuantityMeasurement cmLength = new QuantityMeasurement(2.0, Unit.CENTIMETER);
        boolean result = yardLength.equals(cmLength);
        Assert.assertFalse(result);
    }
}