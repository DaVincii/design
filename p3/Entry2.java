package problem3;

public class Entry {
	public static void main() {
		Connection connection = new SqlConnection();
		connection.open("mydb;scott;tiger");
		
    Transaction transaction = new SqlTransaction();
		transaction.begin(connection);
		
		Command cmd1 = new SqlCommand();
		cmd1.execute(transaction, "insert into emp values(10,'jack',2500')");
		

		Command cmd2 = new SqlCommand();
		cmd2.execute(transaction, "insert into emp values(20,'jill',4300')");
		
		transaction.commit();
		connection.close();
		
	}
}
