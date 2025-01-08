package org.problems.patternlevelapplications.decorator.texteditor;

class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<b>" + text.format() + "</b>";
    }
}
