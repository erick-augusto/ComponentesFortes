
package componentesfortes;

public class DFS {
    
    public DFS(){
        
    }
    
    private int tempo = 0;
    
    public int achaComponetes(Grafo g){
        int i;    
        for (i = 0; i < g.vertices.length; i++) {
            g.vertices[i].cor = Cores.BRANCO;
        }
        for (i = 0; i < g.vertices.length; i++) {
            if(g.vertices[i].cor == Cores.BRANCO){
                //System.out.println("Entrando na recursão...");
                visitaBFS(g, g.vertices[i]);
            }
        }       
        return tempo;
    }
    
    public void visitaBFS(Grafo g, Vertice u){
        int i;
        tempo ++;
        u.d = tempo;
        u.cor = Cores.CINZA;
        int id = u.getIndice();
        System.out.println("Tempo de início do vértice "+u.getNome()+" ("+tempo+")");        
        g.vertices[u.getIndice()].d = tempo;
        g.vertices[u.getIndice()].cor = Cores.CINZA;
        if(g.vertices[u.getIndice()].cor == Cores.CINZA){
            System.out.println("Cinza");
        }
    }
}
