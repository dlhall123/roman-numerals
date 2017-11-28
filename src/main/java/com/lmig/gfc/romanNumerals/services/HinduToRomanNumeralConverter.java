package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int input) {
		String output = "";

		while (input / 1000 >= 1) {
			output += "M";
			input -= 1000;
		}

		if (input >= 900) {
			output += "CM";
			input -= 900;
		}

		if (input >= 500) {
			output += "D";
			input -= 500;
		}

		if (input >= 400) {
			output += "CD";
			input -= 400;
		}

		while (input / 100 >= 1) {
			output += "C";
			input -= 100;
		}

		if (input >= 90) {
			output += "XC";
			input -= 90;
		}

		if (input >= 50) {
			output += "L";
			input -= 50;
		}

		if (input >= 40) {
			output += "XL";
			input -= 40;
		}

		while (input / 10 >= 1) {
			output += "X";
			input -= 10;
		}

		if (input == 9) {
			output += "IX";
			input -= 9;
		}

		if (input >= 5) {
			output += "V";
			input -= 5;
		}

		if (input == 4) {
			output += "IV";
			input -= 4;
		}
		while (input > 0) {
			output += "I";
			input--;
		}

		return output;
	}

}
