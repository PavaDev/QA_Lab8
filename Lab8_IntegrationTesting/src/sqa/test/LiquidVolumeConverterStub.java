package sqa.test;

import sqa.main.LiquidVolumeConverter;

public class LiquidVolumeConverterStub extends LiquidVolumeConverter {
	
	//convert 1cup to ml
	@Override
	public double convert(double liquidValue, String fromUnit, String toUnit) {
		return 250;
	}
	
	//get multiplier from cup to ml
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 250;
	}
}
