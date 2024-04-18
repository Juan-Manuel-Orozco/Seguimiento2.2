package ejercicio4;

public enum Transporte {
    Bus(18," Diesel") {
        @Override
        public String mostrarDescripcion() {
            return null;
        }
    },
    Tren(150," Carbon") {
        @Override
        public String mostrarDescripcion() {
            return null;
        }
    },
    Barco(3400,"Gas natural licuado") {
        @Override
        public String mostrarDescripcion() {
            return null;
        }
    },
    Moto(2,"Gasolina") {
        @Override
        public String mostrarDescripcion() {
            return null;
        }
    },
    Avion(90,"jet B") {
        @Override
        public String mostrarDescripcion() {
            return null;
        }
    };

    public int capacidad;
    public String tipoMotor;

    Transporte(int capacidad, String tipoMotor) {
        this.capacidad = capacidad;
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
    public abstract String mostrarDescripcion();
}
