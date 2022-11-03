package day07.swing.mypac;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame01 extends JFrame implements ActionListener{
	// 전역변수(멤버필드) 정의하기
	JButton btn1, btn2, btn3, btn4, btn5;
	
	// 생성자에서 초기화 작업하기
	public MyFrame01() {
		// 레이아웃 객체 생성
		FlowLayout flow = new FlowLayout();
		// 레이아웃 결정
		setLayout(flow);
		
		
		// 화면에 배치할 버튼 객체 생성하기
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		btn4 = new JButton("버튼4");
		btn5 = new JButton("버튼5");
		
		// 생성한 버튼객체를 프레임에 추가하기
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		// 버튼에 액션 리스너객체 등록하기
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		
		
		// 프레임의 최상단의 좌표와 크기를 결정한다.
		setBounds(100, 100, 500, 500);
		// 화면에 보이도록 설정한다.
		setVisible(true);
		
	}// 생성자

	// 액션 리스너를 등록한 버튼이 눌러 졌을때 실행되는 콜백 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 눌렀나요?");
		
		if(e.getSource() == btn1) {
			JOptionPane.showMessageDialog(this, "버튼1 을 눌렀네요");
		} else if(e.getSource() == btn2) {
			JOptionPane.showMessageDialog(this, "버튼2 을 눌렀네요");
		} else if(e.getSource() == btn3) {
			JOptionPane.showMessageDialog(this, "버튼3 을 눌렀네요");
		} else if(e.getSource() == btn4) {
			JOptionPane.showMessageDialog(this, "버튼4 을 눌렀네요");
		} else if(e.getSource() == btn5) {
			JOptionPane.showMessageDialog(this, "버튼5 을 눌렀네요");
		}
		
	}
	
}











