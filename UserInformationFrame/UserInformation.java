package UserInformationFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import vo.UserVo;



public class UserInformation extends JPanel {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JLabel label1;
	private JLabel label2;
	private JTextArea userinfor;
	private UserInformationCotroller UserInforCon;
public static void main(String args[]){

	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800,600);
	UserInformation gui = new UserInformation(new UserInformationCotrollerimpl());	
	frame.getContentPane().add(gui);
	frame.setVisible(true);
	
}
public UserInformation(UserInformationCotroller UserInforCon){
	this.UserInforCon = UserInforCon;
	this.setLayout(null);
	this.go();
	
}
public void go(){
	button1 = new JButton("ע����ҵ��Ա");
	button1.setBounds(20, 40, 100, 30);
	button1.addActionListener(new button1Listener());
	button2 = new JButton("ע����ͨ��Ա");
	button2.setBounds(20, 80, 100, 30);
	button2.addActionListener(new button2Listener());
	button3 = new JButton("�޸���Ϣ");
	button3.setBounds(20, 120, 100, 30);
	button3.addActionListener(new button3Listener());
	button4 = new JButton("��Ա����");
	button4.setBounds(20, 160, 100, 30);
	button4.addActionListener(new button4Listener());
	this.add(button1);
	this.add(button2);
	this.add(button3);
	this.add(button4);
	
	
	label1 = new JLabel("������Ϣ����     ��ǰ��ݣ��ͻ�");
	this.add(label1);
	label1.setBounds(0,0,200,27);
	userinfor = new JTextArea(10,5);
	userinfor.setEditable(false);
	userinfor.append("������\nID��\n��ϵ��ʽ��");
	userinfor.setFont(new Font("����", Font.PLAIN, 15));
    this.add(userinfor);
    userinfor.setBounds(150, 40, 200, 70);
    label2 = new JLabel("����ֵ��"+UserInforCon.getcredit()+"");
    this.add(label2);
    label2.setBounds(40, 40, 140, 270);
    this.setVisible(true);
}

class button3Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		userinfor.setEditable(true);
	}
	
}
//ע���Ա��Ϣ
class button1Listener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(200, 100);
		frame.setLayout(new FlowLayout());
		JLabel label = new JLabel("��ҵ����:");
		frame.getContentPane().add(label);
		JTextField text = new JTextField(10);
		frame.getContentPane().add(text);
		JButton button1 =new JButton("����");
		frame.getContentPane().add(button1);
		frame.setVisible(true);
	}
	
}

class button2Listener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(200, 100);
		frame.setLayout(new FlowLayout());
		JLabel label = new JLabel("���գ�xx/xx��:");
		frame.getContentPane().add(label);
		JTextField text = new JTextField(10);
		frame.getContentPane().add(text);
		JButton button1 =new JButton("����");
		frame.getContentPane().add(button1);
		frame.setVisible(true);
	}
	
}
class button4Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(200, 100);
		frame.setLayout(new FlowLayout());
		JButton button1 = new JButton("��ҵ��Ա");
		button1.addActionListener(new button1Listener());
		JButton button2 = new JButton("��ͨ��Ա");
		button2.addActionListener(new button2Listener());
		frame.add(button1);
		frame.add(button2);
		frame.setVisible(true);
		class button1Listener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
		class button2Listener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
	}
	
}
}

