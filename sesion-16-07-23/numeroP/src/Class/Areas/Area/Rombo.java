/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas.Area;

/**
 *
 * @author JuanDa
 */
public class Rombo extends Area{
    public Double diagonalMa;
    public Double diagonalMe;

    public Double getDiagonalMa() {
        return diagonalMa;
    }

    public void setDiagonalMa(Double diagonalMa) {
        this.diagonalMa = diagonalMa;
    }

    public Double getDiagonalMe() {
        return diagonalMe;
    }

    public void setDiagonalMe(Double diagonalMe) {
        this.diagonalMe = diagonalMe;
    }
    
    @Override
    public Double Area(){
        double area;
        area= ((this.getDiagonalMa()*this.getDiagonalMe())/2);
        this.setArea(area);
        return this.getArea();
    }
    
}
