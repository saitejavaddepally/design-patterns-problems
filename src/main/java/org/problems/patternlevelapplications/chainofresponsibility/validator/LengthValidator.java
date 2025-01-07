package org.problems.patternlevelapplications.chainofresponsibility.validator;

class LengthValidator extends Validator {
    @Override
    public boolean validate(String data) {
        if (data.length() > 5) {
            System.out.println("Length validation passed.");
            return nextValidator == null || nextValidator.validate(data);
        }
        System.out.println("Length validation failed.");
        return false;
    }
}
