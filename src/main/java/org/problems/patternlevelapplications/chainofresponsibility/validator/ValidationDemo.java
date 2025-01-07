package org.problems.patternlevelapplications.chainofresponsibility.validator;

public class ValidationDemo {
    public static void main(String[] args) {
        Validator lengthValidator = new LengthValidator();
        Validator formatValidator = new FormatValidator();

        lengthValidator.setNextValidator(formatValidator);

        boolean result = lengthValidator.validate("ValidData");
        System.out.println("Validation result: " + result);
    }
}
