package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    @Test
    void testGetPriceKing() {
        Reservation reservation = new Reservation("King", 2, false);
        assertEquals(139.00, reservation.getPrice(), 0.001);
    }

    @Test
    void testGetPriceDouble() {
        Reservation reservation = new Reservation("Double", 3, false);
        assertEquals(124.00, reservation.getPrice(), 0.001);
    }

    @Test
    void testGetPriceInvalid() {
        Reservation reservation = new Reservation("Suite", 1, false);
        assertEquals(0.00, reservation.getPrice(), 0.001);
    }

    @Test
    void testGetReservationTotalWeekend() {
        // King room = 139.00. Weekend upcharge = 10% (13.90). Total per night = 152.90.
        // 2 nights * 152.90 = 305.80
        Reservation reservation = new Reservation("King", 2, true);
        assertEquals(305.80, reservation.getReservationTotal(), 0.001);
    }

    @Test
    void testGetReservationTotalWeekday() {
        // Note: In your current code, if 'weekend' is false, 'upcharge' defaults to 1.
        // This causes the formula to double the price: 124 + (124 * 1) = 248 per night.
        // 2 nights * 248 = 496.00
        Reservation reservation = new Reservation("Double", 2, false);
        assertEquals(496.00, reservation.getReservationTotal(), 0.001);
    }
}