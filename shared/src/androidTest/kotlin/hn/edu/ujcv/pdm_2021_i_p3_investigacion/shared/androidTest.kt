package hn.edu.ujcv.pdm_2021_i_p3_investigacion.shared

import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.test.assertEquals

class AndroidGreetingTest {

    @Test
    fun testExample() {
        assertEquals("320.0", CalcularPresion(2.0,640.0))
    }

    fun CalcularPresion(area:Double, fuerza:Double): String {
        var a:Double = area
        var b:Double = fuerza

        var tot:Double = b/a
        return tot.toString()

    }


}