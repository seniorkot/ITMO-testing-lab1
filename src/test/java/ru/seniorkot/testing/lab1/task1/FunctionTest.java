package ru.seniorkot.testing.lab1.task1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionTest {

    private static final double EPS = 1E-6;
    private static final double DELTA = 1E-5;

    @Test
    public void testFuncPlusInfinity() { // x = +INFINITY
        double x = Double.POSITIVE_INFINITY;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncMinusInfinity() { // x = -INFINITY
        double x = Double.NEGATIVE_INFINITY;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncNaN() { // x = NaN
        double x = Double.NaN;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncOne() { // x = 1
        double x = 1.0;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncOneG() { // x = 1 + 0.01
        double x = 1.01;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncOneL() { // x = 1 - 0.01
        double x = 0.99;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncMinusOne() { // x = -1
        double x = -1.0;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncMinusOneG() { // x = -1 + 0.01
        double x = -0.99;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncMinusOneL() { // x = -1 - 0.01
        double x = -1.01;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncZero() { // x = 0
        double x = 0;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncZeroG() { // x = 0 + 0.01
        double x = 0.01;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncZeroL() { // x = 1 - 0.01
        double x = -0.01;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncGreater() { // x = 1.57
        double x = 1.57;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncLower() { // x = -1.48
        double x = -1.48;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep0() { // x = 0.5
        double x = 0.5;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep1() { // x = 0.5 + 0.01
        double x = 0.5 + 0.01;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep2() { // x = 0.5 + 0.02
        double x = 0.5 + 0.02;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep3() { // x = 0.5 + 0.03
        double x = 0.5 + 0.03;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep4() { // x = 0.5 + 0.04
        double x = 0.5 + 0.04;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep5() { // x = 0.5 + 0.05
        double x = 0.5 + 0.05;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep6() { // x = 0.5 + 0.06
        double x = 0.5 + 0.06;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep7() { // x = 0.5 + 0.07
        double x = 0.5 + 0.07;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep8() { // x = 0.5 + 0.08
        double x = 0.5 + 0.08;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncSmallStep9() { // x = 0.5 + 0.09
        double x = 0.5 + 0.09;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncPiMinus3(){ // x = 3.14.... - 3
        double x = Math.PI - 3;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncBigStep0() { // x = -0.9
        double x = -0.9;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncBigStep1() { // x = -0.7
        double x = -0.7;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncBigStep2() { // x = -0.5
        double x = -0.5;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncBigStep3() { // x = -0.3
        double x = -0.3;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncBigStep4() { // x = 0.1
        double x = 0.1;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncBigStep5() { // x = 0.3
        double x = 0.3;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncBigStep6() { // x = 0.7
        double x = 0.7;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncBigStep7() { // x = 0.9
        double x = 0.9;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncToOne0(){ // x = 0.96
        double x = 0.96;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncToOne1(){ // x = 0.961
        double x = 0.961;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncToOne2(){ // x = 0.962
        double x = 0.962;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncToOne3(){ // x = 0.97
        double x = 0.97;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncToMinusOne0(){ // x = -0.96
        double x = -0.96;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncToMinusOne1(){ // x = -0.961
        double x = -0.961;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncToMinusOne2(){ // x = -0.962
        double x = -0.962;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }

    @Test
    public void testFuncToMinusOne3(){ // x = -0.97
        double x = -0.97;
        assertEquals(Math.asin(x), Function.arcsin(x, EPS), DELTA);
    }
}
