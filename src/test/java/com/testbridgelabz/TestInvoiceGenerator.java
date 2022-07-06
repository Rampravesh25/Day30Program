package com.testbridgelabz;

import com.mainbridgelabz.InvoiceGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestInvoiceGenerator {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
       InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;

        double fare = invoiceGenerator.calculateFare(distance, time);
        assertEquals(25.0, fare, 0.0);
    }
}
