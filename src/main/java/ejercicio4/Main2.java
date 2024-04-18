package ejercicio4;

public class Main2 {
    public static void main(String[] args) {
    Transporte transporte= Transporte.Avion;
        Transporte transporte1= Transporte.Barco;
        Transporte transporte2= Transporte.Bus;
        Transporte transporte3= Transporte.Moto;
        Transporte transporte4= Transporte.Tren;
        System.out.println(transporte.getCapacidad() + " " + transporte.getTipoMotor());
        System.out.println(transporte1.getCapacidad() + " " + transporte1.getTipoMotor());
        System.out.println(transporte2.getCapacidad() + " " + transporte2.getTipoMotor());
        System.out.println(transporte3.getCapacidad() + " " + transporte3.getTipoMotor());
        System.out.println(transporte4.getCapacidad() + " " + transporte4.getTipoMotor());

    }

}
