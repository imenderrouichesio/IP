/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip;

/**
 *
 * @author imen2
 */
public class IP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Reseau ip1 = new Reseau(192, 168, 27, 1);
		System.out.println(ip1.getClasse());
        	ip1.adresseReseau();

	}    
}
