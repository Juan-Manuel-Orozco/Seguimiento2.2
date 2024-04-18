package org.example;

public enum ServicioPeluqueria {
    Corte("Bob","Corte de cabello corto",25.000) {
        @Override
        public String mostrarDescripcionServicio() {
            return null;
        }
    },
    Uñas("Manicure", "Arreglo de uñas",30.000) {
        @Override
        public String mostrarDescripcionServicio() {
            return null;
        }
    },
    Tinte("Cobre","Tinte para todo el cabello",80.000) {
        @Override
        public String mostrarDescripcionServicio() {
            return null;
        }
    };

    public String nombre;
    public String descripcion;
    public double precio;

    ServicioPeluqueria(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    public abstract String mostrarDescripcionServicio();
}


