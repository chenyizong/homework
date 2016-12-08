package ReserveHotel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReserveHotel extends JPanel{
	private JButton button1;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JComboBox combo1;
	private JComboBox combo2;
	private JComboBox combo3;
	private JComboBox combo4;
	private JTextField textfield1;
	private JTextField textfield2;
	private JTextField textfield3;
	private ReserveHotelController ReserveHotelCon;
	public ReserveHotel(ReserveHotelController ReserveHotelCon) {
		// TODO Auto-generated constructor stub
		this.ReserveHotelCon = ReserveHotelCon;
		this.setLayout(null);
		this.go();
	}
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		ReserveHotel gui = new ReserveHotel(new ReserveHotelControllerimpl());
		frame.getContentPane().add(gui);
		frame.setVisible(true);
	}
	public void go(){
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
		
		label1 = new JLabel("������Ϣ����     ��ǰ��ݣ��ͻ� ");
		this.add(label1);
		label1.setBounds(0,0,200,27);
		
		
        String[] s1 = {"�󴲷�","��׼��","���˼�"};
        combo1 = new JComboBox(s1);
        combo1.setBorder(BorderFactory.createTitledBorder("��������"));
        String[] s2 = {"1","2","3","4","5"};
        combo2 = new JComboBox(s2);
        combo2.setBorder(BorderFactory.createTitledBorder("��������"));
        String[] s3 = {"1","2","3","4","5"};
        combo3 = new JComboBox(s3);
        combo3.setBorder(BorderFactory.createTitledBorder("Ԥ������"));
        String[] s4 = {"��","��"};
        combo4 = new JComboBox(s4);
        combo4.setBorder(BorderFactory.createTitledBorder("�Ƿ���С��"));
        label2 = new JLabel("Ԥ�����ڣ�(xx/xx)");
        textfield1 = new JTextField();
        textfield1.setColumns(10);
        label3 = new JLabel("�˷����ڣ�(xx/xx)");
        textfield2 = new JTextField();
        textfield2.setColumns(10);
        label4 = new JLabel("������ִ��ʱ�䣺(xx/xx hh/hh)");
        textfield3 = new JTextField();
        textfield3.setColumns(10);
        label5 = new JLabel("Ԥ����Ϣ:");
        button1 = new JButton("���ɶ���");
        button1.addActionListener(new button1Listener());
        panel2.add(label5);
        panel2.add(combo1);
        panel2.add(combo2);
        panel2.add(combo3);
        panel2.add(combo4);
        panel2.add(label2);
        panel2.add(textfield1);
        panel2.add(label3);
        panel2.add(textfield2);
        panel2.add(label4);
        panel2.add(textfield3);
        panel2.add(button1);
        this.add(panel2);
        panel2.setBounds(20, 40, 225, 400);
        
        label6 = new JLabel("�ͻ���Ϣ");
        label6.setFont(new Font("����", Font.PLAIN, 15));
        label7 = new JLabel("����������");
        label7.setFont(new Font("����", Font.PLAIN, 15));
        label8 = new JLabel("��ϵ��ʽ��110");
        label8.setFont(new Font("����", Font.PLAIN, 15));
        label9 = new JLabel("ID��151250023");
        label9.setFont(new Font("����", Font.PLAIN, 15));
        label10 = new JLabel("����ֵ��"+ReserveHotelCon.getcredit()+"");
        label10.setFont(new Font("����", Font.PLAIN, 15));
        panel1.add(label6);
        panel1.add(label7);
        panel1.add(label8);
        panel1.add(label9);
        panel1.add(label10);
        this.add(panel1);
        panel1.setBounds(300, 100, 530, 277);
	}
	class button1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(ReserveHotelCon.getcredit()>=0){
				JFrame frame1 = new JFrame();
				frame1.setSize(200,200);
				frame1.setVisible(true);
				JLabel label1 = new JLabel("Ԥ���ɹ�");
				frame1.add(label1);
			}else if(ReserveHotelCon.getcredit()<0){
				JFrame frame1 = new JFrame();
				frame1.setSize(100,100);
				frame1.setVisible(true);
				JLabel label1 = new JLabel("Ԥ��ʧ�ܣ�����ֵ����");
				frame1.add(label1);
			}
		}
		
	}
}
