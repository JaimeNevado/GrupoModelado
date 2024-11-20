public abstract class Rol{
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false; // Clase diferente
        Rol rol = (Rol) obj;
        return Objects.equals(id, rol.id); // Comparar por id
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}