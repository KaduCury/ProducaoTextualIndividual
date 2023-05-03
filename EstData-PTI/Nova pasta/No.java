//Classe No;
public class No {
    private long id;
    private Object elemento;
    private No esq,dir;
    public No(long id, Object elemento, No esq, No dir){
        this.id = id; this.elemento = elemento; this.esq = esq; this.dir = dir;
    }
    public void setId(long id) { this.id = id; } 
    public long getId() { return this.id; }
    public void setElemento(Object elemento) { this.elemento = elemento; }
    public Object getElemento() { return elemento; } 
    public void setEsq(No esq) { this.esq = esq; } 
    public No getEsq() { return esq; }
    public void setDir(No dir) { this.dir = dir; } 
    public No getDir() { return dir; }
    public String toString() { return getElemento() == null ? "" : (String) getElemento(); }  
}