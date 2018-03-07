package es.tfg.ejemplos;

import org.junit.Test;

import  static org.junit.Assert.assertEquals;

public class BusinessLogicTest {

    private void shouldGetPrice(int amount, boolean hasCoupon, int price){
        assertEquals(price, new BusinessLogic().getPrecio(amount, hasCoupon));
    }

    @Test
    public void shouldGetNormalPricingForOneItem(){
        shouldGetPrice(1, false, 17);
    }

    @Test
    public void shouldGetDiscountPricingForOneItem(){
        shouldGetPrice(1, true, 15);
    }

    @Test
    public void shouldGetDiscountPricingByAmount(){
        shouldGetPrice(100, false, 1500);
    }
}
