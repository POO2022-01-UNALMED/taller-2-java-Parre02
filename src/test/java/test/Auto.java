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
        return this.asientos.length;
		int contadorAsientos = 0;
		for(Asiento asiento:asientos) {
			if(asiento!=null) {
				contadorAsientos++;
			}
		}
		return contadorAsientos;}//revisar preguntar

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
