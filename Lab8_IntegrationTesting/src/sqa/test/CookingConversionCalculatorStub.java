package sqa.test;

import sqa.main.CookingConversionCalculator;

public class CookingConversionCalculatorStub extends CookingConversionCalculator {

	//choose temperature convert 25°C to °F 
	@Override
	public double convert(double value, String choice, String fromUnit, String toUnit) {
		
		if (choice.equals("temperature")) {
			return 77.0;
		} else if (choice.equals("mass")) {
			return 3.5;
		} else if (choice.equals("liquid")) {
			return 250;
		} 
		
		return 0.0;
	}
}
