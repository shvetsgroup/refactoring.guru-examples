package refactoring_guru.patterns.mediator.example.components;

import refactoring_guru.patterns.mediator.example.mediator.Mediator;

import javax.swing.*;

public class TextBox extends JTextArea {
    private Mediator mediator;

    public TextBox() {
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
