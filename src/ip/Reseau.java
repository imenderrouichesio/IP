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

public class Reseau {

	//ATTRIBUTS
	private int ip1;
	//private int ip2;
	private int octet1;
	private int octet2;
	private int octet3;
	private int octet4;
	//private String classe;
	
	
	//CONSTRUCTEUR
	public Reseau(int octet1, int octet2, int octet3, int octet4) {
		//this.ip1 = ip1;
		//this.ip2=ip2;
		this.octet1 = octet1;
		this.octet2 = octet2;
		this.octet3 = octet3;
		this.octet4 = octet4;
		//this.classe = classe;
	}

	
	
	//GETTER
	public int getIp1() {
		return ip1;
	}
	
	/*public int getIp2() {
		return ip2;
	}*/
	
	public int getOctet1() {
		return octet1;
	}
	
	public int getOctet2() {
		return octet2;
	}
	
	public int getOctet3() {
		return octet3;
	}
	
	public int getOctet4() {
		return octet4;
	}
	
	public char getClasse() {
    		char c='x';

   		if (octet1>=1 && octet1<=126){
        		c='A';
    		}

   		if (octet1>=128 && octet1<=191){
        		c='B';
    		}

    		if (octet1>=192 && octet1<=223){
       	 		c='C';
    		}

    		return c;    
	}

	
	
	
	//SETTER
	public void setIp1(int ip1) {
		this.ip1 = ip1;
	}
	
	/*public void setIp2(int ip2) {
		this.ip2 = ip2;
	}*/
	
	public void setOctet1(int octet1) {
		this.octet1 = octet1;
	}
	
	public void setOctet2(int octet2) {
		this.octet2 = octet2;
	}
	
	public void setOctet3(int octet3) {
		this.octet3 = octet3;
	}
	
	public void setOctet4(int octet4) {
		this.octet4 = octet4;
	}

	/*public void setClasse(String classe) {
		this.classe = classe;
	}*/
	
	
	
	//TO STRING
	public String toString() {
		return "Reseau [ip=" + ip1 + ", ip2=" + octet1 + ", octet2=" + octet2	+ ", octet3=" + octet3 + ", octet4=" + octet4 + "]";
	}
	
	
	
	//AUTRES MÉTHODES
	public void adresseReseau(){
    		int a = this.octet1;
    		int b = 0;
    		int c = 0;
    		int d = 0;
    
    		if(this.getClasse()=='B'){
        		b=this.octet2;
        		if(this.getClasse()=='C'){
            			c=this.octet3;
        		}
    		}
    		System.out.println("L'adresse réseau est : " + a + "." + b  + "." + c + "." +d);    
	}

	
	public boolean estMemeReseau(int ip1) {
		if (ip1==ip1) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
