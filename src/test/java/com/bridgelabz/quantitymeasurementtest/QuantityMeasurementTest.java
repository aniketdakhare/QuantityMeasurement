package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.service.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.utility.Unit;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest
{
    @Test
    public void givenLengthsInFeetAndInch_WhenCompared_ShouldReturnTrue()
    {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Unit[] unitTypes = {Unit.INCH, Unit.FEET};
        boolean result = quantityMeasurement.compareLengths(unitTypes, 12.0, 1.0);
        Assert.assertTrue(result);
    }
}