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
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        Unit[] unitTypes = {Unit.FEET, Unit.FEET};
        boolean result = quantityMeasurement.compareLengths(unitTypes, 1.0, 1.0);
        Assert.assertTrue(result);
    }

}