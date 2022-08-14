/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.List;

import Controller.ReportesController;
import model.vo.comprasProyectosVo;
/**
 *
 * @author andre
 */
public class ReportesView {
     private static ReportesController controller;

    public ReportesView() {
        controller = new ReportesController();
    }

    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
            respuesta += caracter;
        }
        return respuesta;
    }

    public void comprasPorProyecto() {
        System.out.println(repitaCaracter('=', 36) + "Compras por proyecto  "+ repitaCaracter('=', 37));
        System.out.println(String.format("%15s %-25s %-20s",
                "ID_COMPRA", "CONSTRUCTORA", "BANCO_VINCULADO"));
        System.out.println(repitaCaracter('-', 105));
        try {
            List<comprasProyectosVo> compras = controller.listarComprasPorProyecto();
            for (comprasProyectosVo compra : compras) {
                System.out.println(compra);
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            ex.printStackTrace();
        }
    }
}
