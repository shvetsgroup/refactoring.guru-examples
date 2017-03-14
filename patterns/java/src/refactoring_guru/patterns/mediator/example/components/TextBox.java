package refactoring_guru.patterns.mediator.example.components;

import refactoring_guru.patterns.mediator.example.mediator.Editor;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class TextBox extends JTextArea {
    private Editor mediator;

    public TextBox() {}

    public void setMediator(Editor mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }
}
