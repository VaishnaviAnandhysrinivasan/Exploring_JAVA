// Java Apps
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ToDoListApp {
        public static void main(String[] args) {
            JFrame Fr = new JFrame("Vaish - TO DO");
            Fr.setSize(600, 600);
            DefaultListModel <String> ToDo = new DefaultListModel<>();
            JList <String> ToDoList = new JList<>(ToDo);
            JTextField task = new JTextField();
            JButton addTask = new JButton("Add Task");
            JButton status = new JButton("Complete");
            addTask.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    String ip = task.getText();
                    if(!ip.isEmpty()){
                        ToDo.addElement(ip);
                        task.setText("");
                    }
                }
            });
            status.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    int sind = ToDoList.getSelectedIndex();
                    if(sind != -1){
                        ToDo.remove(sind);
                    }
                }
            });
            JPanel pnl = new JPanel(new BorderLayout());
            pnl.add(task,BorderLayout.CENTER);
            pnl.add(addTask,BorderLayout.EAST);
            JPanel pnl2 = new JPanel(new BorderLayout());
            pnl2.add(status,BorderLayout.EAST);
            pnl.setFont(new Font("Script",Font.BOLD, 14));
            Fr.add(new JScrollPane(ToDoList),BorderLayout.CENTER);
            Fr.add(pnl,BorderLayout.NORTH);
            Fr.add(pnl2,BorderLayout.SOUTH);
            Fr.setVisible(true);
        }
}
