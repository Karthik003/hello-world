import javax.swing.*;
import java.awt.event.*;
public class GuiDemo extends JFrame implements ItemListener {
	JComboBox jc;
	JTextField tf;
	GuiDemo() {
		jc = new JComboBox();
		tf = new JTextField();
		add(jc);
		add(tf);
		jc.addItemListener(this);
		jc.addItem("Select");
		jc.addItem("Interface");
		jc.addItem("Abstraction Inheritance");
		setLayout(null);
		jc.setBounds(50, 50, 100, 30);
		tf.setBounds(50, 150, 100, 30);
		setVisible(true);
		setSize(300,300);
	}
	
	public void itemStateChanged(ItemEvent ae) {
		if(ae.getStateChange()==ae.SELECTED) {
			if(jc.getSelectedItem().equals("Abstraction Inheritance")) {
				sal m5 = new sal();
				tf.setText(m5.show());
			}
			else if(jc.getSelectedItem().equals("Interface")) {
				marklist m6 = new marklist();
				tf.setText(m6.sam());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiDemo gd = new GuiDemo();
	}

}
