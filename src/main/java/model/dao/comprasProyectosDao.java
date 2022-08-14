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
import model.vo.comprasProyectosVo;
/**
 *
 * @author andre
 */
public class comprasProyectosDao {
    public List<comprasProyectosVo> listar() throws SQLException {
        ArrayList<comprasProyectosVo> respuesta = new ArrayList<comprasProyectosVo>();
        Connection conn = JDBCUtilities.getConnection();
        Statement stmt = null;
        ResultSet rset = null;
        String consulta = "Select ID_Compra,Constructora, Banco_Vinculado "
            + "FROM Proyecto "
            + "JOIN Compra on Compra.ID_Proyecto = Proyecto.ID_Proyecto "
            + "WHERE Compra.Proveedor = 'Homecenter' and Proyecto.Ciudad = 'Salento' ";
        try {
            stmt = conn.createStatement();
            rset = stmt.executeQuery(consulta);
            while (rset.next()) {
                comprasProyectosVo vo = new comprasProyectosVo();
                vo.setBancoVinculado(rset.getString("Banco_Vinculado"));
                vo.setConstructora(rset.getString("Constructora"));
                vo.setIdCompra(rset.getInt("ID_Compra"));
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
