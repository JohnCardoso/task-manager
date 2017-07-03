package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import task.*;

/**
 * Created by matheuslc on 6/29/17.
 */
public class ViewTaskManager {
    private JFrame view;
    private TaskManager taskManager = new TaskManager();

    public void draw() {
        this.view = new JFrame("TaskManager");
        this.view.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton create = new JButton("Add new task");
        JButton filterBy = new JButton("Filter by");

        this.addCreateNewTaskViewListener(create);
        this.addCreateNewTaskViewListener(filterBy);
        this.view.add(create);

        this.prepare(this.view);
    }

    public void addFilterByListener(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel listModel = new DefaultListModel();
            }
        });
    }

    public void addCreateNewTaskViewListener(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title;
                String description;
                String[] options = {"MEDIUM", "LOW", "HARD"};

                title = JOptionPane.showInputDialog("What's the task title?");
                description = JOptionPane.showInputDialog("What's the task description?");
                int position = JOptionPane.showOptionDialog(
                       null,
                       "What's the task priority?",
                       "Choose one priority",
                       JOptionPane.DEFAULT_OPTION,
                       JOptionPane.INFORMATION_MESSAGE,
                       null,
                       options,
                       options[0]
                );

            }
        });
    }

    public void prepare(JFrame view) {
        view.pack();
        view.setSize(540, 540);
        view.setVisible(true);
    }
}
