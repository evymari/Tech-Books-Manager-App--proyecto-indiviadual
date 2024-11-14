package baseDatos;
import java.sql.*;



class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        try {

           // DriverManager.getConnection(url, user, password);

           Connection connection = DriverManager.getConnection(url, user, password);
           System.out.println("Se ha conectado");


            Statement statement = connection.createStatement();


            // statement.executeUpdate("INSERT INTO users(email, name) VALUES ('paula@gmail.com', 'paula')");

            ResultSet res = statement.executeQuery("SELECT * FROM books");

            // Procesar el resultado
            while (res.next()) {
                System.out.println(res.getString("isbn"));
                System.out.println(res.getString("title"));
                System.out.println(res.getString("author"));
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public void deleteByIsbn(String isbn) {
        String sql = "DELETE FROM books WHERE isbn= '%s'".formatted(isbn);
    }
}

