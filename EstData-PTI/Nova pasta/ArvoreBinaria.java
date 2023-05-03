//Classe ArvoreBinaria;
//Questão A == preFixEsq();
//Questão B == preFix2();
import java.util.ArrayDeque; import java.util.Deque; 
public class ArvoreBinaria { 
    private No raiz; 
    public static int qtdeNoEsquerda = 0; 
    public ArvoreBinaria() {  
        this.raiz = null; 
    } 
    public No getArvore() { 
        return raiz; 
    } 
    public void setArvore(No raiz) { 
        this.raiz = raiz; 
    } 
    public void insere(long id, Object elemento) { 
        No novoNo = new No(id, elemento, null, null);  
        if (raiz == null) {  
            raiz = novoNo; 
        } else { 
            No atual = raiz; 
            No pai;  
            while (true) { 
                pai = atual; 
                if (id < atual.getId()) { 
                    atual = atual.getEsq(); 
                    if (atual == null) { 
                        pai.setEsq(novoNo); 
                        return; 
                    } 
                } else { 
                    atual = atual.getDir(); 
                    if (atual == null) { 
                        pai.setDir(novoNo);  
                        return; 
                    } 
                } 
            } 
        } 
    } 
    public int preFixEsq(No atual) { 
        try { 
            if (atual.getEsq() != null) { 
                qtdeNoEsquerda++;  
            } 
        } catch (Exception e) { } 
        if (atual != null) { 
            preFixEsq(atual.getEsq()); 
            preFixEsq(atual.getDir());  
        } 
        return qtdeNoEsquerda; 
    } 
    public void preFix2(No atual, int qnt) { 
        String espaço = ""; 
        for (int i = 1; i <= qnt; i++) { 
            espaço += "   "; 
        }
        if (atual != null) { 
            qnt++; 
            System.out.println(espaço + atual.getId()); 
            if (atual.getEsq() == null) { 
                System.out.println(espaço + "    -"); 
            } 
            if (atual.getDir() == null) { 
                System.out.println(espaço + "    -"); 
            } 
            preFix2(atual.getEsq(),  qnt); 
            preFix2(atual.getDir(), qnt );  
        } 
    } 
    public void imprimeEleArvore() {  
        preFixEsq(raiz); 
    } 
    public void imprimeEleArvore2() { 
        preFix2(raiz, 0); 
    } 
    public void imprimeArvore() { 
        percorreArvore(raiz); 
    } 
    private long calcAltura(No atual, long a) { 
        if (atual != null) { 
            long e, d; 
            e = calcAltura(atual.getEsq(), a) + 1; 
            d = calcAltura(atual.getDir(), a) + 1; 
            if (e > d) { 
                return a + e; 
            } else { 
                return a + d; 
            } 
        } 
        return a; 
    } 
    public long alturaArvore() { 
        long a = 0; 
        return calcAltura(raiz, a); 
    } 
    public String PreOrdem() { 
        if (getArvore() == null) { 
            return ""; 
        } 
        return readPreOrdem(getArvore()); 
    } 
    private String readPreOrdem(No no) { 
        if (no == null)  { 
            return ""; 
        } 
        String rt = no.toString(); 
        if (no.getEsq() != null) {
            rt += (rt.isEmpty() ? "" : ",") + readPreOrdem(no.getEsq());  
            qtdeNoEsquerda++;  
        } 
        if (no.getEsq() != null) {  
            rt += (rt.isEmpty() ? "" : ",") + readPreOrdem(no.getDir()); 
        } 
        return rt; 
    } 
    private long calcAlturaNoEsq(No atual, long a) {  
        if (atual != null) { 
            long e = calcAltura(atual.getEsq(), a) + 1; 
            return e; 
        } 
        return a; 
    } 
    public long alturaArvoreNoEsq() { 
        long a = 0; 
        return calcAlturaNoEsq(raiz, a); 
    } 
    public void percorreArvore(No no) { 
        int qtNoEsq = 0, qtNoDir = 0; 
        Deque<No> fila = new ArrayDeque<>( ); 
        fila.add(no); 
        while (!fila.isEmpty()) { 
            No atual = fila.removeFirst();  
            System.out.printf("%s, ", atual.getElemento()); 
            if (atual.getEsq() != null) { 
                fila.add(atual.getEsq());  
                qtNoEsq++; 
            } 
            if (atual.getDir() != null) {  
                fila.add(atual.getDir()); 
                qtNoDir++;  
            } 
        } 
        System.out.println("qtNoEsq= " + qtNoEsq); 
    } 
} 