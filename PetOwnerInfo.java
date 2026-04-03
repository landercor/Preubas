
class PetOwnerInfo {

    private final String nombrePropi;
    private final String identificacion;
    private final String nombreMasco;
    private final int edadProxi;
    private final boolean tieneMasco;
    private final String tieneSeg;
    private final boolean tieneVacu;

    // Constructor
    //Los nombre de las clases no deben ser tan largo, es recomendable usar nombres cortos y descriptivos. --- IGNORE ---
    public PetOwnerInfo(String nombrePropi, String identificacion, String nombreMasco, int edadProxi, boolean tieneMasco, String tieneSeg, boolean tieneVacu) {
        this.nombrePropi = nombrePropi;
        this.identificacion = identificacion;
        this.nombreMasco = nombreMasco;
        this.edadProxi = edadProxi;
        this.tieneMasco = tieneMasco;
        this.tieneSeg = tieneSeg;
        this.tieneVacu = tieneVacu;
    }

    public String getNombrePropi() {
        return nombrePropi;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombreMasco() {
        return nombreMasco;
    }

    public int getEdadProxi() {
        return edadProxi;
    }

    public boolean getTieneMasco() {
        return tieneMasco;
    }

    public String getTieneSeg() {
        return tieneSeg;
    }

    public boolean getTieneVacu() {
        return tieneVacu;
    }

    public String validarDatos() {
        if (nombrePropi == null || nombrePropi.trim().isEmpty()) {
            return "El nombre del propietario es obligatorio.";
        } else if (identificacion == null || identificacion.trim().isEmpty()) {
            return "La identificación del propietario es obligatoria.";
        } else if (nombreMasco == null || nombreMasco.trim().isEmpty()) {
            return "El nombre de la mascota es obligatorio.";
        } else if (edadProxi <= 0) {
            return "La edad de la mascota debe ser un numero positivo.";
        } else if (tieneMasco == false) {
            return "El propietario debe tener una mascota.";
        } else if (tieneSeg == null || tieneSeg.trim().isEmpty()) {
            return "La Mascota debe contar con un seguro valido.";
        } else if (tieneVacu == false) {
            return "La Mascota debe contar con sus vacunas al dia.";
        }
        return "Datos validos";
    }
}
