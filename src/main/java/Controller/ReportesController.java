/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import java.util.List;

import model.dao.comprasProyectosDao;
import model.dao.liderDao;
import model.dao.proyectosCiudadDao;
import model.vo.comprasProyectosVo;
import model.vo.liderVo;
import model.vo.proyectosCiudadVo;

/**
 *
 * @author andre
 */
public class ReportesController {
    private comprasProyectosDao comprasProyectoDao;
    private liderDao liderDao;
    private proyectosCiudadDao proyectosCiudadDao;

    public ReportesController() {
        comprasProyectoDao = new comprasProyectosDao();
        liderDao = new liderDao();
        proyectosCiudadDao = new proyectosCiudadDao();
    }

    public List<comprasProyectosVo> listarComprasPorProyecto() throws SQLException {
        return comprasProyectoDao.listar();
    }

    public List<liderVo> listarLideres() throws SQLException {
        return liderDao.listar();
    }

    public List<proyectosCiudadVo> listarProyectosPorCiudad() throws SQLException {
        return proyectosCiudadDao.listar();
    }
}
