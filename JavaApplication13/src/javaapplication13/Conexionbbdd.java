/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class Conexionbbdd {

    String url = "jdbc:mysql://localhost:3306/planetas";
    String usuario = "root";
    String contraseña = "Med@c";
    
    // Sentencias SQL
    String sqlmarte = "SELECT * FROM planeta WHERE nombre ='Marte'";
    String SQLjupitersatio= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Ío';";
String SQLjupitersatEuropa= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Europa';";
String SQLjupitersatGanimedes= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Ganimedes';";
String SQLjupitersatCalisto= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Calisto';";
String SQLjupitersatFobos= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Fobos';";
String SQLjupitersatDeimos= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Deimos';";
    String sqlTierra = "SELECT * FROM planeta WHERE nombre ='Tierra'";
    String sqlJupiter = "SELECT * FROM planeta WHERE nombre ='Jupiter'";
    String sqlMercurio = "SELECT * FROM planeta WHERE nombre ='Mercurio'";
    String sqlNeptuno = "SELECT * FROM planeta WHERE nombre ='Neptuno'";
    String sqlSaturno = "SELECT * FROM planeta WHERE nombre ='Saturno'";
    String sqlVenus = "SELECT * FROM planeta WHERE nombre ='Venus'";
    String sqlUrano = "SELECT * FROM planeta WHERE nombre ='Urano'";
    String sqlSol = "SELECT * FROM sol";
    String SQLSATTIERRA= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion_planeta\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Planeta.nombre = 'Tierra';";
String SQLjupitersatTitan= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Titán';";
String SQLjupitersasatEncelado= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Encélado';";
String SQLjupitersatTitania= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Titania';";
String SQLjupitersatOberon= "SELECT \n" +
"    Satelite.nombre AS nombre_satelite,\n" +
"    Satelite.radio_km,\n" +
"    Satelite.distancia_planeta,\n" +
"    Satelite.periodo_orbital,\n" +
"    Satelite.temperatura_media,\n" +
"    Satelite.tipo,\n" +
"    Satelite.fecha_creacion AS fecha_creacion_satelite,\n" +
"    Planeta.nombre AS nombre_planeta,\n" +
"    Planeta.fecha_creacion AS fecha_creacion\n" +
"FROM \n" +
"    Satelite\n" +
"INNER JOIN \n" +
"    Planeta ON Satelite.planeta_id = Planeta.id\n" +
"WHERE \n" +
"    Satelite.nombre = 'Oberón';";
    public String[] conectaryconsultarMarte() {
        String[] datosMarte = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(sqlmarte);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosMarte[0] = resultados.getString("radio_km");
                datosMarte[1] = resultados.getString("distancia_sol");
                datosMarte[2] = resultados.getString("periodo_orbital");
                datosMarte[3] = resultados.getString("temperatura_media");
                datosMarte[4] = resultados.getString("tipo");
                datosMarte[5] = resultados.getString("numero_satelites");
                datosMarte[6] = resultados.getString("sol_id");
                datosMarte[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosMarte;
    }
    public String[] conectaryconsultarTierra() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(sqlTierra);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_sol");
                datosTierra[2] = resultados.getString("periodo_orbital");
                datosTierra[3] = resultados.getString("temperatura_media");
                datosTierra[4] = resultados.getString("tipo");
                datosTierra[5] = resultados.getString("numero_satelites");
               datosTierra[6] = resultados.getString("sol_id");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarJupiter() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(sqlJupiter);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_sol");
                datosTierra[2] = resultados.getString("periodo_orbital");
                datosTierra[3] = resultados.getString("temperatura_media");
                datosTierra[4] = resultados.getString("tipo");
                datosTierra[5] = resultados.getString("numero_satelites");
               datosTierra[6] = resultados.getString("sol_id");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarMercurio() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(sqlMercurio);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_sol");
                datosTierra[2] = resultados.getString("periodo_orbital");
                datosTierra[3] = resultados.getString("temperatura_media");
                datosTierra[4] = resultados.getString("tipo");
                datosTierra[5] = resultados.getString("numero_satelites");
               datosTierra[6] = resultados.getString("sol_id");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarNeptuno() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(sqlNeptuno);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_sol");
                datosTierra[2] = resultados.getString("periodo_orbital");
                datosTierra[3] = resultados.getString("temperatura_media");
                datosTierra[4] = resultados.getString("tipo");
                datosTierra[5] = resultados.getString("numero_satelites");
               datosTierra[6] = resultados.getString("sol_id");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarUrano() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(sqlUrano);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_sol");
                datosTierra[2] = resultados.getString("periodo_orbital");
                datosTierra[3] = resultados.getString("temperatura_media");
                datosTierra[4] = resultados.getString("tipo");
                datosTierra[5] = resultados.getString("numero_satelites");
               datosTierra[6] = resultados.getString("sol_id");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarVenus() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(sqlVenus);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_sol");
                datosTierra[2] = resultados.getString("periodo_orbital");
                datosTierra[3] = resultados.getString("temperatura_media");
                datosTierra[4] = resultados.getString("tipo");
                datosTierra[5] = resultados.getString("numero_satelites");
               datosTierra[6] = resultados.getString("sol_id");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarSaturno() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(sqlSaturno);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_sol");
                datosTierra[2] = resultados.getString("periodo_orbital");
                datosTierra[3] = resultados.getString("temperatura_media");
                datosTierra[4] = resultados.getString("tipo");
                datosTierra[5] = resultados.getString("numero_satelites");
               datosTierra[6] = resultados.getString("sol_id");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarSol() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(sqlSol);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                datosTierra[0] = resultados.getString("tipo");
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("temperatura_superficial");
                datosTierra[3] = resultados.getString("distancia_tierra");
               datosTierra[4] = resultados.getString("composicion");
                datosTierra[5] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarSATTIERRA() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLSATTIERRA);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarSATJUPITER() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersatio);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarSATJUPITEREur() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersatEuropa);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarSATJUPITERGani() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersatGanimedes);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarSATJUPITERCAL() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersatCalisto);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarSATFobos() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersatFobos);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
    public String[] conectaryconsultarSATDeimos() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersatDeimos);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
     public String[] conectaryconsultarSATtitan() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersatTitan);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
     public String[] conectaryconsultarSATEncelado() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersasatEncelado);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
      public String[] conectaryconsultarSATETitania() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersatTitania);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
        public String[] conectaryconsultarSATEOberon() {
        String[] datosTierra = new String[8];
        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear una instancia de Statement para ejecutar la sentencia SQL
            Statement statement = conexion.createStatement();

            // Ejecutar la consulta SQL y obtener el conjunto de resultados
            ResultSet resultados = statement.executeQuery(SQLjupitersatOberon);

            // Iterar sobre los resultados y mostrarlos por consola
            while (resultados.next()) {
                // Obtener los valores de las columnas
                
                datosTierra[1] = resultados.getString("radio_km");
                datosTierra[2] = resultados.getString("distancia_planeta");
                datosTierra[3] = resultados.getString("periodo_orbital");
                datosTierra[4] = resultados.getString("temperatura_media");
                datosTierra[5] = resultados.getString("tipo");
                datosTierra[7] = resultados.getString("fecha_creacion");
                // Mostrar los valores por consola

            }

            // Cerrar recursos
            statement.close();
            conexion.close();
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosTierra;
    }
     
     
     
     
}
