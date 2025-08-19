package sqa.test;

import sqa.main.TemperatureConverter;

public class TemperatureConverterStub extends TemperatureConverter {
	
	//convert 25°C to °F
	@Override
	public double convert(double tempValue, String fromUnit, String toUnit) {
		return 77.0;
	}
	
}
