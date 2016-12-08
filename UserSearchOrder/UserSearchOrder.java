package UserSearchOrder;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import vo.OrderVo;




public class UserSearchOrder extends JPanel{
	private JFrame frame2;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button6;
	private JButton button7;
	private JScrollPane scrollPane;
	private JTable orderTable;
	private DefaultTableModel orderListModel;
	private JTextField textfield1;
	private JComboBox combobox;
	private UserSearchOrderCotroller UserSearchOrderCon;
	private int userId;
	private Vector<OrderVo> vData;

public static void main(String[] args){
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(800,600);
	UserSearchOrder gui = new UserSearchOrder(new UserSearchOrderCotrollerimpl());	
	frame.getContentPane().add(gui);
	frame.setVisible(true);
}
public UserSearchOrder(UserSearchOrderCotrollerimpl UserSearchOrderCon) {
	// TODO Auto-generated constructor stub
	this.UserSearchOrderCon = UserSearchOrderCon;
	this.userId = UserSearchOrderCon.getUserID();
	this.go();
}
public void go(){
	panel1 = new JPanel();
	panel2 = new JPanel();
	panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
	panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
	
	label1 = new JLabel("������Ϣ����     ��ǰ��ݣ��ͻ�                         ");
	this.setLayout(new FlowLayout(FlowLayout.LEFT));
	this.add(label1);
	
	button1 = new JButton("δִ����������");
	button1.addActionListener(new button1Listener());
	button2 = new JButton("��ִ����������");
	button2.addActionListener(new button2Listener());
	button3 = new JButton("�쳣����");
	button3.addActionListener(new button3Listener());
	button4 = new JButton("�ѳ�������");
	button4.addActionListener(new button4Listener());
	label2 = new JLabel("                                                                                      ");
	panel1.add(button1);
	panel1.add(button2);
	panel1.add(button3);
	panel1.add(button4);
	panel1.add(label2);
	this.add(panel1);
	
	button6 = new JButton("��������");
	button6.addActionListener(new button6Listener());
	button7 = new JButton("����");
	button7.addActionListener(new button7Listener());
	panel2.add(button6);
	panel2.add(button7);
	button6.setVisible(false);
	button7.setVisible(false);
	this.add(panel2);
	
	scrollPane = new JScrollPane();
	
	//��ͷ
			Vector<String> vColumns = new Vector<String>();
			vColumns.add("�������");
			vColumns.add("��������");
			vColumns.add("�Ƶ�����");
			vColumns.add("Ԥ��Ԥסʱ��");
			vColumns.add("Ԥ���˷�ʱ��");
			vColumns.add("������ֵ");
			//����
			vData = new Vector<OrderVo>();
			UserSearchOrderCon = new UserSearchOrderCotrollerimpl();
			vData.addAll(UserSearchOrderCon.getAllOrders(userId));
			//ģ��
			orderListModel = new DefaultTableModel(vData, vColumns);
			//���
			orderTable = new JTable(orderListModel){

				public boolean isCellEditable(int row, int column){
					return false;
				}
			};
			orderTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			scrollPane.getViewport().add(orderTable);
			orderTable.setFillsViewportHeight(true);
			this.add(scrollPane);

}
class button1Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button6.setVisible(true);
		button7.setVisible(false);
		vData.clear();
		vData.addAll(UserSearchOrderCon.getUnfinishedOrders(userId));
	}
	
}
class button2Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button6.setVisible(false);
		button7.setVisible(true);
		vData.clear();
		vData.addAll(UserSearchOrderCon.getFinishedOrders(userId));
	}
	
}
class button3Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button6.setVisible(false);
		button7.setVisible(false);
		vData.clear();
		vData.addAll(UserSearchOrderCon.getAbnormalOrders(userId));
	}
	
}
class button4Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button6.setVisible(false);
		button7.setVisible(false);
		vData.clear();
		vData.addAll(UserSearchOrderCon.getCancelOrders(userId));
	}
	
}

class button6Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		UserSearchOrderCon.cancel();
	}
	
}
class button7Listener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			//���۽���
			frame2 = new JFrame();
			panel3 = new JPanel();
			label3 = new JLabel("����:");
			textfield1 = new JTextField();
			textfield1.setColumns(30);
			String[] s = {"1","2","3","4","5"};
			combobox = new JComboBox(s);
			combobox.setBorder(BorderFactory.createTitledBorder("����"));
			panel3.add(label3);
			panel3.add(textfield1);
			panel3.add(combobox);
			JButton button1 = new JButton("����");
			panel3.add(button1);
			frame2.add(panel3);
			frame2.setSize(400,200);
			
			int index = orderTable.getSelectedRow();
			if(index == -1){
				JOptionPane.showMessageDialog(null, "��ѡ�񶩵���","", JOptionPane.ERROR_MESSAGE);
				frame2.setVisible(false);
				return;
			}else{
				frame2.setVisible(true);
			}
		
	}
}
}

