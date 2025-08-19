package sqa.test;

import sqa.main.MassConverter;

public class MassConverterStub extends MassConverter {
	
	//convert 1g to oz
	@Override
	public double convert(double massValue, String fromUnit, String toUnit) {
		return 3.5;
	}
	
	//get multiplier from gram to oz
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 0.035;
	}
}
