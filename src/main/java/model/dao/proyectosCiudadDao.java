/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Util.JDBCUtilities;
import model.vo.proyectosCiudadVo;

/**
 *
 * @author andre
 */
public class proyectosCiudadDao {
    public List<proyectosCiudadVo> listar() throws SQLException {
        ArrayList<proyectosCiudadVo> respuesta = new ArrayList<proyectosCiudadVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rset = null;
        String consulta = "Select ID_Proyecto,Constructora, Numero_Habitaciones, Ciudad "
            + "FROM Proyecto "
            + "WHERE Proyecto.Clasificacion = 'Casa Campestre' and (Proyecto.Ciudad = 'Barranquilla' or Proyecto.Ciudad = 'Santa Marta' or Proyecto.Ciudad = 'Cartagena') ";
        try{
            stmt = conn.createStatement();
            rset = stmt.executeQuery(consulta);
            while (rset.next()) {
                proyectosCiudadVo vo = new proyectosCiudadVo();
                vo.setCiudad(rset.getString("Ciudad"));
                vo.setConstructora(rset.getString("Constructora"));
                vo.setIdProyecto(rset.getInt("ID_Proyecto"));
                vo.setNumeroHabitaciones(rset.getInt("Numero_Habitaciones"));
                respuesta.add(vo);
            }
        } finally {
            if (rset != null) {
                rset.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return respuesta;
    }
}
