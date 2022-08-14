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
import model.vo.liderVo;

/**
 *
 * @author andre
 */
public class liderDao {
    public List<liderVo> listar() throws SQLException {
        ArrayList<liderVo> respuesta = new ArrayList<liderVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rset = null;
        String consulta = "Select ID_Lider,Nombre, Primer_Apellido, Ciudad_Residencia "
            + "from Lider "
            + "order by Lider.Ciudad_Residencia";
        try {
            stmt = conn.createStatement();
            rset = stmt.executeQuery(consulta);
            while (rset.next()) {
                liderVo vo = new liderVo();
                vo.setCiudad(rset.getString("Ciudad_Residencia"));
                vo.setNombre(rset.getString("Nombre"));
                vo.setPrimerApellido(rset.getString("Primer_Apellido"));
                vo.setIdLider(rset.getInt("ID_Lider"));

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
