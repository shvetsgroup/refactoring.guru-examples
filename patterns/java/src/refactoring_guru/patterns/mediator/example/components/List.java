package refactoring_guru.patterns.mediator.example.components;

import refactoring_guru.patterns.mediator.example.mediator.Mediator;

import javax.swing.*;

@SuppressWarnings("unchecked")
public class List extends JList {
    private Mediator mediator;
    private DefaultListModel listModel;

    public List(DefaultListModel listModel) {
        super(listModel);
        this.listModel = listModel;
        setModel(listModel);
        this.setLayoutOrientation(JList.VERTICAL);
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void addElement(Note note) {
        listModel.addElement(note);
        int index = listModel.size() - 1;
        setSelectedIndex(index);
        ensureIndexIsVisible(index);
        mediator.sendToFilter(listModel);
    }

    public void deleteElement() {
        int index = this.getSelectedIndex();
        try {
            listModel.remove(index);
            mediator.sendToFilter(listModel);
        } catch (ArrayIndexOutOfBoundsException ex) {}
    }

    public Note getCurrentElement() {
        return (Note)getSelectedValue();
    }
}
