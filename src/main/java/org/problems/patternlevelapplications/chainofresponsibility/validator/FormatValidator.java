package org.problems.patternlevelapplications.chainofresponsibility.validator;

class FormatValidator extends Validator {
    @Override
    public boolean validate(String data) {
        if (data.matches("[a-zA-Z]+")) {
            System.out.println("Format validation passed.");
            return nextValidator == null || nextValidator.validate(data);
        }
        System.out.println("Format validation failed.");
        return false;
    }
}
