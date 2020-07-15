package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.quantitymeasurement.service.QuantityMeasurement;
import com.bridgelabz.quantitymeasurement.utility.Unit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class QuantityMeasurementTest
{
    @Test
    public void givenLengthsInFeet_WhenEqual_ShouldReturnTrue()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.FEET);
        QuantityMeasurement length2 = new QuantityMeasurement(0.0, Unit.FEET);
        boolean result = length1.compare(length2);
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
        QuantityMeasurement length1 = new QuantityMeasurement(2.0, Unit.FEET);
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
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInch_WhenEqual_ShouldReturnTrue()
    {
        QuantityMeasurement length1 = new QuantityMeasurement(0.0, Unit.INCH);
        QuantityMeasurement length2 = new QuantityMeasurement(0.0, Unit.INCH);
        boolean result = length1.compare(length2);
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
        QuantityMeasurement length1 = new QuantityMeasurement(2.0, Unit.INCH);
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
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInchAndFeet_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(12.0, Unit.INCH);
        QuantityMeasurement feetLength = new QuantityMeasurement(1.0, Unit.FEET);
        boolean result = inchLength.compare(feetLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(3.0, Unit.FEET);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = feetLength.compare(yardLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInFeetAndYard_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = feetLength.compare(yardLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInInchAndYard_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(1.0, Unit.INCH);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = inchLength.compare(yardLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInInchAndYard_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(36.0, Unit.INCH);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = inchLength.compare(yardLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInYardAndInch_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(36.0, Unit.INCH);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = yardLength.compare(inchLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInYardAndFeet_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(3.0, Unit.FEET);
        QuantityMeasurement yardLength = new QuantityMeasurement(1.0, Unit.YARD);
        boolean result = yardLength.compare(feetLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInchAndCentimeter_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement cmLength = new QuantityMeasurement(5.0, Unit.CENTIMETER);
        boolean result = inchLength.compare(cmLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInInchAndCentimeter_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement cmLength = new QuantityMeasurement(2.0, Unit.CENTIMETER);
        boolean result = inchLength.compare(cmLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInFeetAndCentimeter_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(2.0, Unit.FEET);
        QuantityMeasurement cmLength = new QuantityMeasurement(60.0, Unit.CENTIMETER);
        boolean result = feetLength.compare(cmLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInFeetAndCentimeter_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(2.0, Unit.FEET);
        QuantityMeasurement cmLength = new QuantityMeasurement(2.0, Unit.CENTIMETER);
        boolean result = feetLength.compare(cmLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInYardAndCentimeter_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement yardLength = new QuantityMeasurement(2.0, Unit.YARD);
        QuantityMeasurement cmLength = new QuantityMeasurement(180.0, Unit.CENTIMETER);
        boolean result = yardLength.compare(cmLength);
        Assert.assertTrue(result);
    }

    @Test
    public void givenLengthsInYardAndCentimeter_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement yardLength = new QuantityMeasurement(2.0, Unit.YARD);
        QuantityMeasurement cmLength = new QuantityMeasurement(2.0, Unit.CENTIMETER);
        boolean result = yardLength.compare(cmLength);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInInchAndInch_WhenAdded_ShouldReturnSumInInch()
    {
        QuantityMeasurement inchLength1 = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement inchLength2 = new QuantityMeasurement(2.0, Unit.INCH);
        double result = inchLength1.addValues(inchLength1, inchLength2);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenLengthsInFeetAndInch_WhenAdded_ShouldReturnSumInInch()
    {
        QuantityMeasurement feetLength = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement inchLength = new QuantityMeasurement(2.0, Unit.INCH);
        double result = feetLength.addValues(feetLength, inchLength);
        Assert.assertEquals(14, result, 0.0);
    }

    @Test
    public void givenLengthsInFeetAndFeet_WhenAdded_ShouldReturnSumInInch()
    {
        QuantityMeasurement feetLength1 = new QuantityMeasurement(1.0, Unit.FEET);
        QuantityMeasurement feetLength2 = new QuantityMeasurement(1.0, Unit.FEET);
        double result = feetLength1.addValues(feetLength1, feetLength2);
        Assert.assertEquals(24, result, 0.0);
    }

    @Test
    public void givenLengthsInInchAndCentimeter_WhenAdded_ShouldReturnSumInInch()
    {
        QuantityMeasurement inchLength = new QuantityMeasurement(2.0, Unit.INCH);
        QuantityMeasurement cmLength = new QuantityMeasurement(2.5, Unit.CENTIMETER);
        double result = inchLength.addValues(inchLength, cmLength);
        Assert.assertEquals(3, result, 0.0);
    }

    @Test
    public void givenVolumeInLitreAndLitre_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement litreValue1 = new QuantityMeasurement(2.0, Unit.LITRE);
        QuantityMeasurement litreValue2 = new QuantityMeasurement(2.0, Unit.LITRE);
        boolean result = litreValue1.compare(litreValue2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenVolumeInGallonAndGallon_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement gallonValue1 = new QuantityMeasurement(2.0, Unit.GALLON);
        QuantityMeasurement gallonValue2 = new QuantityMeasurement(2.0, Unit.GALLON);
        boolean result = gallonValue1.compare(gallonValue2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenVolumeInGallonAndLitre_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement gallonValue = new QuantityMeasurement(2.0, Unit.GALLON);
        QuantityMeasurement litreValue = new QuantityMeasurement(7.56, Unit.LITRE);
        boolean result = gallonValue.compare(litreValue);
        Assert.assertTrue(result);
    }

    @Test
    public void givenVolumeInGallonAndLitre_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement gallonValue = new QuantityMeasurement(2.0, Unit.GALLON);
        QuantityMeasurement litreValue = new QuantityMeasurement(2.0, Unit.LITRE);
        boolean result = gallonValue.compare(litreValue);
        Assert.assertFalse(result);
    }

        @Test
    public void givenVolumeInMillilitreAndMillilitre_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement mlValue1 = new QuantityMeasurement(2.0, Unit.MILLILITRE);
        QuantityMeasurement mlValue2 = new QuantityMeasurement(2.0, Unit.MILLILITRE);
        boolean result = mlValue1.compare(mlValue2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenVolumeInLitreAndMillilitre_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement litreValue = new QuantityMeasurement(2.0, Unit.LITRE);
        QuantityMeasurement mlValue = new QuantityMeasurement(2000.0, Unit.MILLILITRE);
        boolean result = litreValue.compare(mlValue);
        Assert.assertTrue(result);
    }

    @Test
    public void givenVolumeInLitreAndMillilitre_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement litreValue = new QuantityMeasurement(2.0, Unit.LITRE);
        QuantityMeasurement mlValue = new QuantityMeasurement(2.0, Unit.MILLILITRE);
        boolean result = litreValue.compare(mlValue);
        Assert.assertFalse(result);
    }

    @Test
    public void givenLengthsInFeetAndCentimeter_WhenValuesAreNegative_ShouldThrowException()
    {
        try
        {
            QuantityMeasurement feetLength = new QuantityMeasurement(-2.0, Unit.FEET);
            QuantityMeasurement cmLength = new QuantityMeasurement(60.0, Unit.CENTIMETER);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(QuantityMeasurementException.class);
            feetLength.compare(cmLength);
        }
        catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesInFeetAndLitre_WhenCompared_ShouldThrowException()
    {
        try
        {
            QuantityMeasurement feetValue = new QuantityMeasurement(2.0, Unit.FEET);
            QuantityMeasurement litreValue = new QuantityMeasurement(60.0, Unit.LITRE);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(QuantityMeasurementException.class);
            feetValue.compare(litreValue);
        }
        catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenValuesInInchAndLitre_WhenAdded_ShouldThrowException()
    {
        try
        {
            QuantityMeasurement inchValue = new QuantityMeasurement(2.0, Unit.INCH);
            QuantityMeasurement litreValue = new QuantityMeasurement(2.0, Unit.LITRE);
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(QuantityMeasurementException.class);
            inchValue.addValues(inchValue, litreValue);
        }
        catch (QuantityMeasurementException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenVolumeInGallonAndLitre_WhenAdded_ShouldReturnSum()
    {
        QuantityMeasurement gallonValue = new QuantityMeasurement(1.0, Unit.GALLON);
        QuantityMeasurement litreValue = new QuantityMeasurement(3.78, Unit.LITRE);
        double result = gallonValue.addValues(litreValue, gallonValue);
        Assert.assertEquals(7.56, result, 0.0);
    }

    @Test
    public void givenVolumeInLitreAndMillilitre_WhenAdded_ShouldReturnSum()
    {
        QuantityMeasurement litreValue = new QuantityMeasurement(2.0, Unit.LITRE);
        QuantityMeasurement mlValue = new QuantityMeasurement(2000.0, Unit.MILLILITRE);
        double result = litreValue.addValues(mlValue, litreValue);
        Assert.assertEquals(4, result, 0.0);
    }

    @Test
    public void givenWeightInKilogramAndKilogram_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement kgValue1 = new QuantityMeasurement(2.0, Unit.KILOGRAM);
        QuantityMeasurement kgValue2 = new QuantityMeasurement(2.0, Unit.KILOGRAM);
        boolean result = kgValue1.compare(kgValue2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenWeightInGramAndGram_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement gramValue1 = new QuantityMeasurement(2.0, Unit.GRAM);
        QuantityMeasurement gramValue2 = new QuantityMeasurement(2.0, Unit.GRAM);
        boolean result = gramValue1.compare(gramValue2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenWeightInTonneAndTonne_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement tonneValue1 = new QuantityMeasurement(2.0, Unit.TONNE);
        QuantityMeasurement tonneValue2 = new QuantityMeasurement(2.0, Unit.TONNE);
        boolean result = tonneValue1.compare(tonneValue2);
        Assert.assertTrue(result);
    }

    @Test
    public void givenWeightInKilogramAndGram_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement kgValue = new QuantityMeasurement(2.0, Unit.KILOGRAM);
        QuantityMeasurement gramValue = new QuantityMeasurement(2000.0, Unit.GRAM);
        boolean result = kgValue.compare(gramValue);
        Assert.assertTrue(result);
    }

    @Test
    public void givenWeightInKilogramAndGram_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement kgValue = new QuantityMeasurement(2.0, Unit.KILOGRAM);
        QuantityMeasurement gramValue = new QuantityMeasurement(2.0, Unit.GRAM);
        boolean result = kgValue.compare(gramValue);
        Assert.assertFalse(result);
    }

    @Test
    public void givenWeightInTonneAndKilogram_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement tonneValue = new QuantityMeasurement(2.0, Unit.TONNE);
        QuantityMeasurement kgValue = new QuantityMeasurement(2000.0, Unit.KILOGRAM);
        boolean result = tonneValue.compare(kgValue);
        Assert.assertTrue(result);
    }

    @Test
    public void givenWeightInTonneAndKilogram_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement tonneValue = new QuantityMeasurement(2.0, Unit.TONNE);
        QuantityMeasurement kgValue = new QuantityMeasurement(2.0, Unit.KILOGRAM);
        boolean result = tonneValue.compare(kgValue);
        Assert.assertFalse(result);
    }

    @Test
    public void givenWeightInTonneAndGram_WhenCheckedForValueAreEqual_ShouldReturnTrue()
    {
        QuantityMeasurement tonneValue = new QuantityMeasurement(2.0, Unit.TONNE);
        QuantityMeasurement gramValue = new QuantityMeasurement(2000000.0, Unit.GRAM);
        boolean result = tonneValue.compare(gramValue);
        Assert.assertTrue(result);
    }

    @Test
    public void givenWeightInTonneAndGram_WhenCheckedForValueAreNotEqual_ShouldReturnFalse()
    {
        QuantityMeasurement tonneValue = new QuantityMeasurement(2.0, Unit.TONNE);
        QuantityMeasurement gramValue = new QuantityMeasurement(2.0, Unit.GRAM);
        boolean result = tonneValue.compare(gramValue);
        Assert.assertFalse(result);
    }

    @Test
    public void givenWeightInTonneAndGram_WhenAdded_ShouldReturnSum()
    {
        QuantityMeasurement tonneValue = new QuantityMeasurement(1.0, Unit.TONNE);
        QuantityMeasurement gramValue = new QuantityMeasurement(1000.0, Unit.GRAM);
        double result = tonneValue.addValues(gramValue, tonneValue);
        Assert.assertEquals(1001, result, 0.0);
    }
}