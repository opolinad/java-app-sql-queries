/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vo;

/**
 *
 * @author andre
 */
public class proyectosCiudadVo {
    private Integer idProyecto;
    private String constructora;
    private Integer numeroHabitaciones;
    private String ciudad;

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString() {
        if (constructora.equals("Pegaso")){
            return idProyecto+"\t"+constructora+"\t \t"+numeroHabitaciones+"\t \t"+ciudad;   
        }else{
            return idProyecto+"\t"+constructora+"\t"+numeroHabitaciones+"\t \t"+ciudad;   
        }
    }
}
