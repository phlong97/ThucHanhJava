/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.EventListener;

/**
 *
 * @author phlong
 */
public class TongAB extends Frame{
    public TongAB()
    {
        setTitle("Chuong trinh tinh tong A,B");
        setSize(300,300);
        GridLayout l = new GridLayout(4, 2);
        Panel p = new Panel();
        p.setLayout(new FlowLayout());
      
        lbA = new Label("a=");
        add(lbA);
        
        txtA = new TextField(20);
        add(txtA);
        
        lbB = new Label("b");
        add(lbB);
        
        txtB = new TextField(20);
        add(txtB);
        
        lbC = new Label();
        add(lbC);
        
        btnTong = new Button("+");
        btnTong.addActionListener((ActionListener) new TinhTong());
              
        
        
        btnHieu = new Button("-");
        btnHieu.addActionListener((ActionListener) new TinhHieu());
               
       
        
        btnTich = new Button("*");
        btnTich.addActionListener((ActionListener) new TinhTich());
        
        
        btnThuong = new Button("/");
        btnThuong.addActionListener((ActionListener) new TinhThuong());
          
        
        p.add(btnTong);
        p.add(btnHieu);
        p.add(btnTich);
        p.add(btnThuong);
        
        add(p);
        
        Label lbKq = new Label("KQ");
        add(lbKq);
        txtKq = new TextField();
        add(txtKq);
        WindowEvent xulisukiencuaso = new WindowEvent();
        addWindowListener(xulisukiencuaso);
        
        setVisible(true);
        
        
    }
    public class WindowEvent implements WindowListener
    {
        
        
        @Override
        public void windowOpened(java.awt.event.WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
             System.exit(0);
        }

        
        @Override
        public void windowClosed(java.awt.event.WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
        @Override
        public void windowIconified(java.awt.event.WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
        @Override
        public void windowDeiconified(java.awt.event.WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
        @Override
        public void windowActivated(java.awt.event.WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
        @Override
        public void windowDeactivated(java.awt.event.WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }  
    public class TinhTong implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính
           int Tong = a+b;
           // Xuất
           txtKq.setText(String.valueOf(Tong));   
        }
    
    }
    public class TinhHieu implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính
           int Hieu = a-b;
           // Xuất
           txtKq.setText(String.valueOf(Hieu));   
        }
    }
    public class TinhTich implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính
           int Tich = a*b;
           // Xuất
           txtKq.setText(String.valueOf(Tich));   
        }
    }
    public class TinhThuong implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            // Lấy A
           int a = Integer.parseInt(txtA.getText());
           // Lấy B
           int b = Integer.parseInt(txtB.getText());
           //Tính
           int Thuong = a/b;
           // Xuất
           txtKq.setText(String.valueOf(Thuong));   
        }
    }
    Label lbA, lbB, lbC,lbTong;
    TextField txtA, txtB, txtKq;
    Button btnTong, btnHieu, btnTich, btnThuong; 
    
}
