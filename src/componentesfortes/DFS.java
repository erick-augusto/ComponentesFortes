
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
    
}
