/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vo;

/**
 *
 * @author andre
 */
public class comprasProyectosVo {
    private Integer idCompra;
    private String constructora;
    private String bancoVinculado;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }
    
     @Override
    public String toString() {
        if (constructora.equals("Pegaso")){
            return idCompra+"\t"+constructora+"\t \t"+bancoVinculado;
        }else{
            return idCompra+"\t"+constructora+"\t"+bancoVinculado;
        }
    }
}
