package com.bridgelabz.quantitymeasurementtest;

import com.bridgelabz.quantitymeasurement.service.QuantityMeasurement;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class QuantityMeasurementTest
{
    @InjectMocks
    QuantityMeasurement quantityMeasurement;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

}
