package com.mycompany.salesapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
/**
 *
 * @author lab_services_student
 */
public class SalesFrame extends JFrame implements ActionListener {

    JTextArea txtOutput;
    JLabel lblYears;
    JButton btnLoad, btnSave;
    JMenuItem menuLoad, menuSave, menuClear, menuExit;
    
    ProductSales sales = new ProductSales();

public SalesFrame() {
    setTitle("Product Sales Application");
    setSize(500, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu toolsMenu = new JMenu("Tools");

    menuExit = new JMenuItem("Exit");
    menuLoad = new JMenuItem("Load Product Data");
    menuSave = new JMenuItem("Save Product Data");
    menuClear = new JMenuItem("Clear");

    fileMenu.add(menuExit);
    toolsMenu.add(menuLoad);
    toolsMenu.add(menuSave);
    toolsMenu.add(menuClear);
    menuBar.add(fileMenu);
    menuBar.add(toolsMenu);
    setJMenuBar(menuBar);

    JPanel topPanel = new JPanel();
    topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
    topPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

    btnLoad = new JButton("Load Product Data");
    btnSave = new JButton("Save Product Data");

    btnLoad.setAlignmentX(Component.CENTER_ALIGNMENT);
    btnSave.setAlignmentX(Component.CENTER_ALIGNMENT);

    topPanel.add(Box.createVerticalStrut(10));
    topPanel.add(btnLoad);
    topPanel.add(Box.createVerticalStrut(10));
    topPanel.add(btnSave);
    topPanel.add(Box.createVerticalStrut(10));
    add(topPanel, BorderLayout.NORTH);

    txtOutput = new JTextArea(10, 40);
    txtOutput.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(txtOutput);
    add(scrollPane, BorderLayout.CENTER);

    JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    lblYears = new JLabel("Years Processed: ");
    bottomPanel.add(lblYears);
    add(bottomPanel, BorderLayout.SOUTH);

    btnLoad.addActionListener(this);
    btnSave.addActionListener(this);
    menuLoad.addActionListener(this);
    menuSave.addActionListener(this);
    menuClear.addActionListener(this);
    menuExit.addActionListener(this);

    setVisible(true);
}

public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnLoad || e.getSource() == menuLoad) {
        loadData();
    } else if (e.getSource() == btnSave || e.getSource() == menuSave) {
        saveData();
    } else if (e.getSource() == menuClear) {
        txtOutput.setText("");
        lblYears.setText("Years Processed: ");
    } else if (e.getSource() == menuExit) {
        dispose();
    }
}

private void loadData() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nTotal Sales: ").append(sales.GetTotalSales());
        sb.append("\nAverage Sales: ").append(String.format("%.2f", sales.GetAverageSales()));
        sb.append("\nSales Over Limit: ").append(sales.GetSalesOverLimit());
        sb.append("\nSales Under Limit: ").append(sales.GetSalesUnderLimit());

        txtOutput.setText(sb.toString());
        lblYears.setText("Years Processed: " + sales.GetProductaProcessed());
    }

private void saveData() {
    try (FileWriter fw = new FileWriter("data.txt")) {
        fw.write(txtOutput.getText());
        JOptionPane.showMessageDialog(this, "Data saved to data.txt");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error saving file");
    }
  }
}


 

