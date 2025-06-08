package org.example.pdf.tool;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // 新建窗体
            JFrame frame = new JFrame("PDF Tool");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
            // 新增按钮
            JButton openButton = new JButton("Open PDF");
            frame.add(openButton);
        });
    }
}