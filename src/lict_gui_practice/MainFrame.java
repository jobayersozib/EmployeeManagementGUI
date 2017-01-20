/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lict_gui_practice;
import AddEmployee.AddEmployeeFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author jobayer
 */
public class MainFrame implements ActionListener{
    private JFrame mainFrame;
    private JPanel myPanel;
    private JButton newClerkBtn;
    private JButton newExitBtn;
    private JButton newSuperviserkBtn;
    private JButton newDriverBtn;
    private JButton newDeveloperBtn;
    private JButton newProgrammerBtn;
    private JButton newProjectCoordinatorBtn;
    private JFrame[] jf=new JFrame[1];
    
     public MainFrame(){
         
      
         
         /*newClerkbtn block start*/
            this.newClerkBtn=new JButton("Add Clerk");
            this.newClerkBtn.setBounds(15,7,200,30);
            this.newClerkBtn.addActionListener(this);
         /*newClerkbtn block end*/
         
         /*newSuperviserkbtn block start*/
            this.newSuperviserkBtn=new JButton("Add Superviser");
            this.newSuperviserkBtn.setBounds(15,37,200,30);
            this.newSuperviserkBtn.addActionListener(this);
         /*newSuperviserbtn block end*/   
         
        /*newDriverkbtn block start*/
            this.newDriverBtn=new JButton("Add Driver");
            this.newDriverBtn.setBounds(15,67,200,30);
            this.newDriverBtn.addActionListener(this);
         /*newDriverbtn block end*/  
         
        /*newDeveloperbtn block start*/
            this.newDeveloperBtn=new JButton("Add Developer");
            this.newDeveloperBtn.setBounds(15,97,200,30);
            this.newDeveloperBtn.addActionListener(this);
        /*newDeveloperbtn block end*/  
        
        /*newProgrammerbtn block start*/
            this.newProgrammerBtn=new JButton("Add Programmer");
            this.newProgrammerBtn.setBounds(15,127,200,30);
            this.newProgrammerBtn.addActionListener(this);
        /*newProgrammerbtn block end*/  
        
        /*newProgectCoordinatorbtn block start*/
            this.newProjectCoordinatorBtn=new JButton("Add Progect Co-ordinator");
            this.newProjectCoordinatorBtn.setBounds(15,157,200,30);
            this.newProjectCoordinatorBtn.addActionListener(this);
        /*newProjectCoordinatorbtn block end*/  
            
        /*newExitbtn block start*/
            this.newExitBtn=new JButton("Exit");
            this.newExitBtn.setBounds(15,207,200,30);
            this.newExitBtn.addActionListener(this);
        /*newExitbtn block end*/      
            
         /*myPanel block start*/
            this.myPanel=new JPanel();
            this.myPanel.add(this.newClerkBtn);
            this.myPanel.add(this.newSuperviserkBtn);
            this.myPanel.add(this.newDriverBtn);
            this.myPanel.add(this.newDeveloperBtn);
            this.myPanel.add(this.newProgrammerBtn);
            this.myPanel.add(this.newProjectCoordinatorBtn);
            this.myPanel.add(this.newExitBtn);
         /*myPanel block end*/
        
      /*mainFrame block start*/
            this.mainFrame=new JFrame("Add Employee");
            this.myPanel.setLayout(new BorderLayout());
            this.mainFrame.setBounds(500,100,240,270);
            this.mainFrame.setVisible(true);
            this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.mainFrame.setResizable(false);
            this.mainFrame.add(myPanel);
      /*mainFrame block end*/
            
         
            
     
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.newExitBtn){
            this.mainFrame.dispose();
        }else{
           
           AddEmployeeFrame.AddEmployee(e.getActionCommand());
        }
        
    }
}
