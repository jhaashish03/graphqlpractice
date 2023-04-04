import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;



public class UI_Table {
private JFrame frame;
private JTable table;
private DefaultTableModel tableModel;
private JButton test1Button;
private JButton test2Button;
private JButton test3Button;
private JButton test4Button;
private JButton test5Button;
private JButton test6Button;
private JButton test7Button;
private JButton refreshButton;
private JButton testAllButton;
private Connection conn;
private String url = "jdbc:oracle:thin:@localhost:1521:xe";
private String username = "system";
private String password = "828126";



    


public UI_Table() {
initialize();
connectToDatabase();
createTable();
}



public static void main(String[] args) {
private void initialize() {



 // Create the main window frame



frame = new JFrame("CIS_Benchmarks_UI");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(800, 600);
frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));



// Create the table
tableModel = new DefaultTableModel(new Object[] { "S.NO", "USER", "TESTCASE", "PASS / FAIL", "ACTIONS" }, 0);
table = new JTable(tableModel);
JScrollPane scrollPane = new JScrollPane(table);
frame.add(scrollPane);



// Create the test buttons
test1Button = new JButton("Test");
test2Button = new JButton("Test");
test3Button = new JButton("Test");
test4Button = new JButton("Test");
test5Button = new JButton("Test");
test6Button = new JButton("Test");
test7Button = new JButton("Test");



 // Create the refresh button
refreshButton = new JButton("Refresh");



// Create the Test All button
testAllButton = new JButton("Test All");



// Add the buttons to the frame
JPanel buttonPanel = new JPanel();
buttonPanel.add(test1Button);
buttonPanel.add(test2Button);
buttonPanel.add(test3Button);
buttonPanel.add(test4Button);
buttonPanel.add(test5Button);
buttonPanel.add(test6Button);
 buttonPanel.add(test7Button);
buttonPanel.add(refreshButton);
buttonPanel.add(testAllButton);
frame.add(buttonPanel);



// Add action listeners to the buttons
test1Button.addActionListener(e -> executeTest(1));
test2Button.addActionListener(e -> executeTest(2));
test3Button.addActionListener(e -> executeTest(3));
test4Button.addActionListener(e -> executeTest(4));
test5Button.addActionListener(e -> executeTest(5));
test6Button.addActionListener(e -> executeTest(6));
test7Button.addActionListener(e -> executeTest(7));
refreshButton.addActionListener(e -> refreshTable());
testAllButton.addActionListener(e -> {
executeTest(1);
executeTest(2);
executeTest(3);
executeTest(4);
executeTest(5);
executeTest(6);
executeTest(7);
});



 // Show the window frame
frame.setVisible(true);



}





private void connectToDatabase() {



try {



conn = DriverManager.getConnection(url, username, password);



} catch (SQLException e) {



e.printStackTrace();



}
}



private void createTable() {

try {
	
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM testcases");

while (rs.next()) {
int col1 = rs.getInt(1);
String col2= rs.getString(2);
String col3=rs.getString(3);
String col4= rs.getString(4);

}

} catch(Exception e){
    e.printStackTrace();
}




}
}