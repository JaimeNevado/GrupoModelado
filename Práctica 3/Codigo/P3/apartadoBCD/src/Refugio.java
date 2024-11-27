import java.util.ArrayList;

public class Refugio {
    private Float liquidez;
    private ArrayList<Animal> animalesRefugiados;
    private ArrayList<Animal> animalesRegistrados;

    public Refugio(Float liquidez) {
        this.liquidez = liquidez;
        this.animalesRefugiados = new ArrayList<>();
        this.animalesRegistrados = new ArrayList<>();
    }
	/**
	 * 
	 * @param a
	 */
    public void registrar(Animal a) {
        a.setEstado(EstadoAnimal.disponible);
        this.animalesRegistrados.add(a);
        this.animalesRefugiados.add(a);
    }
    
    public Float getLiquidez() {
        return liquidez;
    }
    
    protected void setLiquidez(Float liquidez) {
        this.liquidez = liquidez;
    }
    
    public ArrayList<Animal> getAnimalesRefugiados() {
        return animalesRefugiados;
    }
    public ArrayList<Animal> getAnimalesRegistrados() {
        return animalesRegistrados;
    }
}
