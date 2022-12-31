package by.academy.homework3;

import java.util.regex.Pattern;

public class BelorussianPhoneValidator implements Validator {

	private static final Pattern pattern = Pattern.compile(
			"\\+375([ .-]?)\\(?([0-9]{2})\\)?([ .-]?)([0-9]{3})([ .-]?)([0-9]{4})");

	@Override
	public Pattern getPattern() {
		return pattern;
	}
}
