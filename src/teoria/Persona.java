package teoria;

import java.time.LocalDate;

public record Persona(String nombrePersona, LocalDate fechaNacimiento, String dni) {
    public boolean esMayorDeEdad(){
        return Helper.calcularEdad(this) >= 18;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(nombrePersona).append(',');
        builder.append(Helper.calcularEdad(this)).append(',');
        builder.append(dni);
        return builder.toString();
    }
}
