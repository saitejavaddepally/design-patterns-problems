package org.problems.patternlevelapplications.chainofresponsibility.validator;

abstract class Validator {
    protected Validator nextValidator;

    public void setNextValidator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public abstract boolean validate(String data);
}
