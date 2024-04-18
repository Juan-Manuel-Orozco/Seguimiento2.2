package ejercicio5;

public enum Producto {
    Lapiz("Lapiz","Se usa para rayar o dibujar") {
        @Override
        public String mostrarUso() {
            return null;
        }
    },
    Cuaderno("Norma", "Para apuntes") {
        @Override
        public String mostrarUso() {
            return null;
        }
    },
    Borrador("Borrador", "Se usa para corregir erroes hechos a lapiz") {
        @Override
        public String mostrarUso() {
            return null;
        }
    },
    Sacapuntas("Sacapuntas","Sacapuntas metalico") {
        @Override
        public String mostrarUso() {
            return null;
        }
    },
    Cartuchera("Cartuchera de Bob esponja","Cartuchera de tamaño mediano") {
        @Override
        public String mostrarUso() {
            return null;
        }
    };

    public String nombre;
    public String descripcion;

    Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public abstract String mostrarUso();
}
