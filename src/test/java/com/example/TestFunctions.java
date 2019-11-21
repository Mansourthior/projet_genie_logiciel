package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestFunctions {

    private Myfunctions a ;

    @Before
    public void setup() {
        a = new Myfunctions() ;
    }

    @Test
    public void test() {
       assertEquals(4, 2, 2);
    }

    @Test
    public void test1() {
        assertEquals('a', a.add(2, 1));
    }

    @Test
    public void test2() {
        assertEquals(2, a.add( 'n', 0));
    }
    
    @Test
    public void test3() {
        assertEquals( 4 , a.mul(2, 2)) ;
    }

    @Test
    public void test4() {
        assertEquals(12, a.mul('l', '4'));
    }

    @Test
    public void test5() {
        assertEquals('0', a.mul(0, 1));
    }

    @Test
    public void test6() {
        assertEquals(0, a.mul(0,0));
    }

}
