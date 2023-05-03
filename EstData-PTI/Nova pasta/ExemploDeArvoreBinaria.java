//Classe ExemploDeArvoreBinaria para validar os algorítmos;
public class ExemploDeArvoreBinaria { 
    public static void main(String[] args) { 
        System.out.println("\nQuestão A"); 
        System.out.println("\n"); 
        ArvoreBinaria treeone = new ArvoreBinaria();  
        treeone.insere(10,"A");  
        treeone.insere(5,"B"); 
        treeone.insere(15," C"); 
        treeone.insere(12," D"); 
        treeone.insere(7,"E"); 
        treeone.insere(12,"F");  
        treeone.insere(6,"G");  
        treeone.insere(8,"H"); 
        treeone.insere(17,"I");  
        treeone.insere(11,"J "); 
        treeone.insere(14,"K");  
        treeone.insere(3,"L"); 
        treeone.imprimeEleArvore();  
        System.out.println("Quantidade de Nó a Esquerda: "  + treeone.qtdeNoEsquerda); 
        System.out.println("\nAltura: " + treeone.alturaArvore()); 
        System.out.println("\nPreOrdem: " + treeone.PreOrdem());  
        System.out.println("\n"); 
        System.out.println("\n"); 
        System.out.println("Questão B"); 
        System.out.println("\n"); 
        String espaço; 
        ArvoreBinaria treetwo = new ArvoreBinaria();  
        treetwo.insere(555, "A"); 
        treetwo.insere(333, "B"); 
        treetwo.insere(888, "C");  
        treetwo.insere(111, "D");  
        treetwo.insere(444, "E"); 
        treetwo.insere(999, "F"); 
        treetwo.imprimeEleArvore2(); 
    } 
}
