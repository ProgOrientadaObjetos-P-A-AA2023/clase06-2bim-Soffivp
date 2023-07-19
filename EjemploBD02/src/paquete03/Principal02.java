/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author sofiv
 */
public class Principal02 {

    public static void main(String[] args) throws SQLException {
        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130.2"},};

        // 1. guardar en la tabla autos de la base de datos
        Enlace c = new Enlace();
       // Auto a = new Auto();
       // a.establecerPlaca("LBNS0001");
       // a.establecerValorMatricula(200.2);

       // c.insertarAuto(a);
        for (int i = 0; i < autos.length; i++) {
            Auto au = new Auto();
            au.establecerPlaca(autos[i][0]);
            au.establecerValorMatricula(Double.parseDouble(autos[i][1]));
            c.insertarAuto(au);

        }
        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }

    }
}
