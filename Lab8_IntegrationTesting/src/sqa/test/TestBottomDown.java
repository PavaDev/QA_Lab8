package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.CookingConversionCalculator;

//นายปวริศ กุลแก้ว 663380019-2 sec.1

class TestBottomDown {
	
	@Test
	void cooking_liquid() {
		CookingConversionCalculatorStub stub = new CookingConversionCalculatorStub();
		double expectedResult = 250;
		assertEquals(expectedResult, stub.convert(1, "liquid", "cup", "ml"));
	}
	
	@Test
	void cooking_mass() {
		CookingConversionCalculatorStub stub = new CookingConversionCalculatorStub();
		double expectedResult = 3.5;
		assertEquals(expectedResult, stub.convert(100, "mass", "gram", "oz"));
	}
	
	@Test
	void cooking_temperature() {
		CookingConversionCalculatorStub stub = new CookingConversionCalculatorStub();
		double expectedResult = 77;
		assertEquals(expectedResult, stub.convert(25, "temperature", "celsius", "fahrenheit"));
	}
	
	@Test
	void liquid_convert() {
		LiquidVolumeConverterStub stub = new LiquidVolumeConverterStub();
		double expectedResult = 250;
		assertEquals(expectedResult, stub.convert(1, "cup", "ml"));
	}
	
	@Test
	void liquid_conversion() {
		LiquidVolumeConverterStub stub = new LiquidVolumeConverterStub();
		double expectedResult = 250;
		assertEquals(expectedResult, stub.getConversionFactor("cup", "ml"));
	}
	
	@Test
	void mass_convert() {
		MassConverterStub stub = new MassConverterStub();
		double expectedResult = 3.5;
		assertEquals(expectedResult, stub.convert(100, "g", "oz"));
	}
	
	@Test
	void mass_conversion() {
		MassConverterStub stub = new MassConverterStub();
		double expectedResult = 0.035;
		assertEquals(expectedResult, stub.getConversionFactor("g", "oz"));
	}
	
	@Test
	void temp_convert() {
		TemperatureConverterStub stub = new TemperatureConverterStub();
		double expectedResult = 77.0;
		assertEquals(expectedResult, stub.convert(25, "celsius", "fahrenheit"));
	}
	
	

}
