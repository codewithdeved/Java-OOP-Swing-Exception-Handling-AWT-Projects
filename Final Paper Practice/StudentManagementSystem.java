import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class StudentManagementSystem {

    private JFrame jFrame;
    private JTable jTable;
    private DefaultTableModel model;
    private JTextField idField, nameField, rollNoField;
    private JComboBox<String> courseField;

    public StudentManagementSystem() {

        jFrame = new JFrame("Student Management System");
        jFrame.setSize(600, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel();
        idField = new JTextField(6);
        nameField = new JTextField(6);
        rollNoField = new JTextField(6);
        courseField = new JComboBox<>(new String[] { "OOP", "HTML5", "CSS3" });

        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("NAME:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("ROLL #:"));
        inputPanel.add(rollNoField);
        inputPanel.add(new JLabel("COURSES:"));
        inputPanel.add(courseField);

        model = new DefaultTableModel(new String[] { "1D", "NAME", "ROLL #", "COURSES" }, 0);
        jTable = new JTable(model);

        model.addRow(new Object[] { "1", "Tayyab", "003", "OOP" });
        model.addRow(new Object[] { "2", "Tayyab", "003", "OOP" });
        model.addRow(new Object[] { "3", "Tayyab", "003", "OOP" });
        model.addRow(new Object[] { "4", "Tayyab", "003", "OOP" });
        model.addRow(new Object[] { "5", "Tayyab", "003", "OOP" });

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Create");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        addButton.addActionListener(e -> {
            if (!idField.getText().isEmpty()) {
                model.addRow(new Object[] {
                        idField.getText(),
                        nameField.getText(),
                        rollNoField.getText(),
                        courseField.getSelectedItem()
                });
                clearFields();
            }
        });

        jTable.getSelectionModel().addListSelectionListener(e -> {
            int row = jTable.getSelectedRow();
            if (row != -1) {
                idField.setText(model.getValueAt(row, 0).toString());
                nameField.setText(model.getValueAt(row, 1).toString());
                rollNoField.setText(model.getValueAt(row, 2).toString());
                courseField.setSelectedItem(model.getValueAt(row, 3));
            }
        });

        updateButton.addActionListener(e -> {
            int row = jTable.getSelectedRow();
            if (row != -1) {
                model.setValueAt(nameField.getText(), row, 1);
                model.setValueAt(rollNoField.getText(), row, 2);
                model.setValueAt(courseField.getSelectedItem(), row, 3);
                clearFields();
            }
        });

        deleteButton.addActionListener(e -> {
            int row = jTable.getSelectedRow();
            if (row != -1) {
                model.removeRow(0);
                clearFields();
            }
        });

        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);

        jFrame.setLayout(new BorderLayout());
        jFrame.add(inputPanel, BorderLayout.NORTH);
        jFrame.add(new JScrollPane(jTable), BorderLayout.CENTER);
        jFrame.add(buttonPanel, BorderLayout.SOUTH);

        jFrame.setVisible(true);

    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        rollNoField.setText("");
        courseField.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        new StudentManagementSystem();
    }

}