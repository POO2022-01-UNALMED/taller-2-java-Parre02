package test;
public class Auto {
    String modelo;
    int precio;
    Asiento [] asientos; //preguntar
    String marca;
    Motor motor;
    int registro;
    int cantidadCreados;

    int cantidadaAsientos (){
        int contadorasientos = 0;
        for (int index = 0; index < this.asientos.length; index++) {
            if(this.asientos[index] instanceof Asiento) {
				contadorasientos +=1;}
            
            }
        return contadorasientos; }//revisar preguntar

    String verificarIntegridad ( ) { 
        int iteradorarrayasientos = 0;
        while (iteradorarrayasientos < asientos.length() ){
            if (asientos.registro[iteradorarrayasientos].equals(this.Motor.registro) && asientos.registro[iteradorarrayasientos].equals(this.Asiento.registro) && asientos.registro[iteradorarrayasientos].equals(this.Auto.registro)) {
                return "Auto original";
            } else {
                return "Las piezas no son orginales";
                
            }
            iteradorarrayasientos++;            


        }
    }}
