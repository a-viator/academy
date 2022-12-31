package by.academy.homework3;

import java.util.regex.Pattern;

public interface Validator {

	Pattern getPattern();

	default boolean validate(String x) {
		return getPattern().matcher(x).matches();
	}
}
