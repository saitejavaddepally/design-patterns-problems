package org.problems.bdesignpatterns.decorator.texteditor;

class ItalicText extends TextDecorator {
    public ItalicText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<i>" + text.format() + "</i>";
    }
}
