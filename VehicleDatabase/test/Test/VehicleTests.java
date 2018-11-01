/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vehiclestarter.FuelPurchase;
import vehiclestarter.RentalCost;
import vehiclestarter.Service;

/**
 *
 * @author J187384
 */
public class VehicleTests {
    
    public VehicleTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testFuel() {
        double expected = 4;
        FuelPurchase test = new FuelPurchase();
        test.purchaseFuel(4, 0.50);
        double actual = test.getFuel();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testRentalCostCalculation() {
        double expected = 1.925;
        RentalCost test = new RentalCost(true, 5.5, 0.35);
        double actual = test.calculateCost();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testScheduledServices() {
        int expected = 5;
        Service test = new Service();
        test.recordService(50000);
        int actual = test.getTotalScheduledServices();
        assertEquals(expected, actual);
    }
}
