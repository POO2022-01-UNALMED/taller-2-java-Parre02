package test;


public class Asiento {
    String color;
    int precio;
    int registro;
    void cambiarColor(String color){
        if (color == "rojo") {
            this.color = "rojo";}
        if (color == "verde") {
            this.color = "verde";
         }
        if (color == "amarillo") { 
            this.color = "amarillo";
        }
        if (color == "negro") { 
            this.color = "negro";
        }
        if (color == "blanco") { 
            this.color = "blanco";
        }
    }
    
}
