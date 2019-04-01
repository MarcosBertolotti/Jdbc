package ConnectDB;

import java.sql.*;

public class Jdbc {

    public static void main (String[] args){

        // 0. CARGAR DRIVER JDBC EN MEMORIA
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("Falta la libreria de MYSQL, no se puede seguir");
        }

        try{
            // 1. CREAR CONEXION A LA BD
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personsDB","root","");

            // 2.CREAR STATEMENT
            Statement statement = connection.createStatement();

            // 3.EJECUTAR SENTENCIA
            String query = "insert into persons (first_name, last_name, age, dni) values ('Elba','Zurita',24,36767858)";

            statement.executeUpdate(query);

            System.out.println("Datos insertados Correctamente.\n");

            ResultSet resultSet = statement.executeQuery("select * from persons");

            // 4. RECORRER RESULTSET
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id_person") + " " +
                                   resultSet.getString("first_name") + " " +
                                   resultSet.getString("last_name") + " " +
                                   resultSet.getInt("age") + " " +
                                   resultSet.getInt(("dni")));
            }
        }catch(SQLException e){
            System.out.println("No se puede conectar a la Base de Datos");
            e.printStackTrace();
        }





    }
}
