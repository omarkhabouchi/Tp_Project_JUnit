

package org;

public class SommeArgent {

    private int quantite ;
    private String unite;

    public SommeArgent(int quantite, String unite) {
        this.quantite = quantite;
        this.unite = unite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public SommeArgent add(SommeArgent m) throws UniteDistincteException {  
    	if (!m.getUnite().equals(this.getUnite())) {
    		throw new UniteDistincteException(this, m); 
 	} 
 	else return new SommeArgent(getQuantite()+m.getQuantite(), getUnite()); 
} 


    public boolean equals(Object anObject) {  	
    	if (anObject == null) return false;  	 
    	if (anObject instanceof SommeArgent) { 
    	   SommeArgent aMoney = (SommeArgent)anObject;   
    	   return aMoney.getUnite().equals(getUnite()) 
    	 	 	 	&& getQuantite() == aMoney.getQuantite(); 
    	 	 	} 
    	 	 	return false; 
    	 	} 
    


}
