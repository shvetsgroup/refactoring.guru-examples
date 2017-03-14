package refactoring_guru.patterns.mediator.example.components;

import refactoring_guru.patterns.mediator.example.mediator.Editor;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Save extends JButton {
    private Editor mediator;

    public Save() {
        super("Save");
    }

    public void setMediator(Editor mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }
}
