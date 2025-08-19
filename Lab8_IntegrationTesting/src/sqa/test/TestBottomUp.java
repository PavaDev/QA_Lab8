package sqa.test;

import sqa.main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//นายปวริศ กุลแก้ว 663380019-2 sec.1

class TestBottomUp {

	@Test
	void liquid_conversion() {
		LiquidVolumeConverter liquid = new LiquidVolumeConverter();
		double expectedResult = 250;
		assertEquals(expectedResult, liquid.getConversionFactor("cup", "ml"));
	}

	@Test
	void mass_conversion() {
		MassConverter mass = new MassConverter();
		double expectedResult = 0.035;
		assertEquals(expectedResult, mass.getConversionFactor("gram", "oz"));
	}
	
	@Test
	void liquid_convert() {
		LiquidVolumeConverter liquid = new LiquidVolumeConverter();
		double expectedResult = 250;
		assertEquals(expectedResult, liquid.convert(1, "cup", "ml"));
	}
	
	@Test
	void mass_convert() {
		MassConverter mass = new MassConverter();
	    double expectedResult = 3.5;
	    
		assertEquals(expectedResult, mass.convert(100, "gram", "oz"), 0.0001);
	}
	
	@Test
	void temp_convert() {
		TemperatureConverter temp = new TemperatureConverter();
		double expectedResult = 77.0;
		assertEquals(expectedResult, temp.convert(25, "fahrenheit", "celsius"));
	}
	
	@Test
	void cooking_temperature() {
		CookingConversionCalculator temp = new CookingConversionCalculator();
		double expectedResult = 77;
		assertEquals(expectedResult, temp.convert(25, "temperature", "celsius", "fahrenheit"));
	}
	
	
}
