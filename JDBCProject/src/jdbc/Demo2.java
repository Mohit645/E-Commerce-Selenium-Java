package jdbc;

import java.sql.*;

public class Demo2 {
	// @SuppressWarnings("null")
	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStat = null;
		ResultSet myRes = null;
		ResultSet myRes2 = null;
		ResultSet myRes3 = null;

		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String userName = "student";
		String password = "student";

		try {
			myConn = DriverManager.getConnection(dbUrl, userName, password);
			myStat = myConn.createStatement();
			PreparedStatement myPstst = myConn.prepareStatement("select * from employees where department = ?;");

		//	myRes = myStat.executeQuery("select last_name, first_name, email from employees;");

			// myPstst.setString(1, "salary");
			myPstst.setString(1, "HR");

			myRes2 = myPstst.executeQuery();

			myRes3 = myStat.executeQuery("select * from phonenumber;");

			while (myRes2.next()) {
				System.out.println(myRes2.getString(1) + ", " + myRes2.getString(2));
			}

	//		while (myRes.next()) {
		//		System.out.println("Full Name: " + myRes.getString(2) + " " + myRes.getString(1));
			//}
			while (myRes3.next()) {
				String number = (myRes3.getString("phoneNumber"));
				System.out.println("We have the number now "+ number);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (myRes != null) {
				myRes.close();
			}
			if (myRes2 != null) {
				myRes2.close();
			}
			if (myRes3 != null) {
				myRes3.close();
			}
			if (myStat != null) {
				myStat.close();
			}
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}