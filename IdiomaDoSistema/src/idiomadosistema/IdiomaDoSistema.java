/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author PORTOMASTER
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Locale loc = Locale.getDefault();
        System.out.println("O idioma do seu Sistema e");
        System.out.println(loc.getDisplayLanguage()); //imprime Portugues
        System.out.println(loc.getLanguage());//imprime "pt"
              }
    
}
