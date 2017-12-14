/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentesfortes;

/**
 *
 * @author charles
 */
public class ComponentesFortes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leitura do teclado
        Grafo g = new Grafo();
        g.leDoTeclado();
        //g.imprimeNaTela();
        
        DFS dfs = new DFS();
        int componentes = dfs.achaComponetes(g);
        System.out.println(componentes);

        //dfs.ordemDecrescente(g);
    }
    
}
