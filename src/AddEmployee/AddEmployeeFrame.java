/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddEmployee;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jobayer
 */
public class AddEmployeeFrame{
    private static int labelFieldHeight=30;
    private static int labelFieldWidth=83;
    private static  ButtonGroup genderButtonGroup;
    private static JRadioButton maleButton;
    private static JRadioButton femaleButton;
    private static JFrame addFrame;
    private static JPanel addPanel;
    private static int count=0;
    private static JLabel name;
    private static JLabel userId;
    private static JLabel passWord;
    private static JLabel email;
    private static JLabel mobile;
    private static JLabel dateOfjoin;
    private static JLabel genderLabel;
    private static JLabel documents;
    private static JLabel role;
    private static JTextField nameField;
    private static JTextField userIdField;
    private static JPasswordField passwordField;
    private static JTextField emailField;
    private static JTextField mobileField;
    private static JTextField dateOfjoinField;
    private static JTextField documentsField;
    private static JTextField roleField;
    private static JButton saveBtn;
    
    
    public static void AddEmployee(String title){
            if(AddEmployeeFrame.count>0){
                AddEmployeeFrame.addFrame.dispose();
            }
            
            AddEmployeeFrame.genderButtonGroup=new ButtonGroup();
            
            AddEmployeeFrame.addFrame=new JFrame(title);
            AddEmployeeFrame.addFrame.setVisible(true);
            AddEmployeeFrame.addFrame.setBounds(300,20,420,450);
            AddEmployeeFrame.addFrame.setResizable(false);
            
            AddEmployeeFrame.addPanel=new JPanel();
            AddEmployeeFrame.addPanel.setLayout(null);
            AddEmployeeFrame.addFrame.add(AddEmployeeFrame.addPanel);
            
            /*labels  and field block start*/
            
            AddEmployeeFrame.name=new JLabel("Name :");
            AddEmployeeFrame.name.setBounds(7,3,AddEmployeeFrame.labelFieldWidth,AddEmployeeFrame.labelFieldHeight);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.name);
            
            
            
            AddEmployeeFrame.nameField=new JTextField();
            AddEmployeeFrame.nameField.setBounds(90,7,300,25);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.nameField);
            
            
            
            AddEmployeeFrame.userId=new JLabel("User ID :");
            AddEmployeeFrame.userId.setBounds(7,36,AddEmployeeFrame.labelFieldWidth,AddEmployeeFrame.labelFieldHeight);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.userId);
            
            
            AddEmployeeFrame.userIdField=new JTextField();
            AddEmployeeFrame.userIdField.setBounds(90,39,300,25);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.userIdField);
            
            
            AddEmployeeFrame.passWord=new JLabel("Password :");
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.passWord);
            AddEmployeeFrame.passWord.setBounds(7,66,AddEmployeeFrame.labelFieldWidth,AddEmployeeFrame.labelFieldHeight);
            
            
            AddEmployeeFrame.passwordField=new JPasswordField();
            AddEmployeeFrame.passwordField.setBounds(90,71,300,25);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.passwordField);
            
            
            AddEmployeeFrame.email=new JLabel("E-mail :");
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.email);
            AddEmployeeFrame.email.setBounds(7,99,AddEmployeeFrame.labelFieldWidth,AddEmployeeFrame.labelFieldHeight);
            
            
            AddEmployeeFrame.emailField=new JTextField();
            AddEmployeeFrame.emailField.setBounds(90,102,300,25);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.emailField);
            
            
            AddEmployeeFrame.mobile=new JLabel("Mobile No :");
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.mobile);
            AddEmployeeFrame.mobile.setBounds(7,130,AddEmployeeFrame.labelFieldWidth,AddEmployeeFrame.labelFieldHeight);
            
            
            AddEmployeeFrame.mobileField=new JTextField();
            AddEmployeeFrame.mobileField.setBounds(90,134,300,25);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.mobileField);
            
            
            AddEmployeeFrame.dateOfjoin=new JLabel("Joining Date :");
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.dateOfjoin);
            AddEmployeeFrame.dateOfjoin.setBounds(7,161,AddEmployeeFrame.labelFieldWidth,AddEmployeeFrame.labelFieldHeight);
            
            AddEmployeeFrame.dateOfjoinField=new JTextField();
            AddEmployeeFrame.dateOfjoinField.setBounds(90,165,300,25);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.dateOfjoinField);
            
            AddEmployeeFrame.genderLabel=new JLabel("Gender :");
            AddEmployeeFrame.genderLabel.setBounds(7,193,AddEmployeeFrame.labelFieldWidth,AddEmployeeFrame.labelFieldHeight);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.genderLabel);
            
            
            AddEmployeeFrame.maleButton=new JRadioButton("Male");
            AddEmployeeFrame.maleButton.setBounds(90,190,55,35);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.maleButton);
            AddEmployeeFrame.genderButtonGroup.add(AddEmployeeFrame.maleButton);
            
            AddEmployeeFrame.femaleButton=new JRadioButton("Female");
            AddEmployeeFrame.femaleButton.setBounds(180,190,85,35);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.femaleButton);
            AddEmployeeFrame.genderButtonGroup.add(AddEmployeeFrame.femaleButton);

            AddEmployeeFrame.radioButtonEvent(AddEmployeeFrame.maleButton);
            AddEmployeeFrame.radioButtonEvent(AddEmployeeFrame.femaleButton);
            
            
            
            AddEmployeeFrame.documents=new JLabel("Documents :");
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.documents);
            AddEmployeeFrame.documents.setBounds(7,230,AddEmployeeFrame.labelFieldWidth,AddEmployeeFrame.labelFieldHeight);
            
            
            AddEmployeeFrame.documentsField=new JTextField();
            AddEmployeeFrame.documentsField.setBounds(90,233,300,25);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.documentsField);
            
            
            AddEmployeeFrame.role=new JLabel("Role :");
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.role);
            AddEmployeeFrame.role.setBounds(7,261,AddEmployeeFrame.labelFieldWidth,AddEmployeeFrame.labelFieldHeight);
            
            
            AddEmployeeFrame.roleField=new JTextField();
            AddEmployeeFrame.roleField.setBounds(90,267,300,25);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.roleField);
            
            /*label field block end*/
            
            
            AddEmployeeFrame.saveBtn=new JButton("Save");
            AddEmployeeFrame.saveBtn.setBounds(17,350,95,35);
            AddEmployeeFrame.saveBtn.setVisible(false);
            AddEmployeeFrame.addPanel.add(AddEmployeeFrame.saveBtn);
            AddEmployeeFrame.buttonEvent(AddEmployeeFrame.saveBtn);

            AddEmployeeFrame.count=1;
            
    }
    private static void buttonEvent(JButton jb){
    
    jb.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Hellow");
            
        }
    });
    
    }
    
    private static void radioButtonEvent(JRadioButton jr){
    jr.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            AddEmployeeFrame.saveBtn.setVisible(true);
        
        }
    });
    
    }

    

    

    
    
    
}
