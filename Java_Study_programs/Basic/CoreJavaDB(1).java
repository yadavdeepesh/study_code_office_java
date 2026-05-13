import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CoreJavaDB {

    // Database details (created via phpMyAdmin)
    static final String URL =
            "jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = ""; // XAMPP default

    public static void main(String[] args) {

        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create connection
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Connected to MySQL successfully!");

            // 3. INSERT DATA
            String insertSQL = "INSERT INTO users(name, email) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(insertSQL);
            ps.setString(1, "Deepesh");
            ps.setString(2, "deepesh@gmail.com");
            ps.executeUpdate();

            System.out.println("Data inserted!");

            // 4. SELECT DATA
            ResultSet rs = con.createStatement()
                    .executeQuery("SELECT * FROM users");

            System.out.println("---- USERS TABLE ----");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email")
                );
            }

            // 5. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
