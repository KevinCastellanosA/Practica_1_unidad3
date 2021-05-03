
public class ColaTDA {
    private char dato;
    private int nivel;
   
    public ColaTDA(char dato,int nivel){
        this.dato=dato;
        this.nivel = nivel;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    @Override
    public String toString(){
       String cad = "Dato:   "+getDato()+"    Nivel prioridad: "+" "+getNivel()+"\n";
        return cad;
    }
}
