package plateau;

public enum Type {
	NORMAL(11),       
    SAKE(4),          
    REQUIN(2),        
    DOUBLECANON(2),   
    SABRE(3),         
    REVOLVER(3),      
    BARQUE(2),        
    POTION(3),        
    STORM(2),         
    PERROQUET(2),
    KRAKEN(1);     
    
    private int quantite;
    
    private Type(int quantite) {
        this.quantite = quantite;
    }
    
    public int getQuantite() {
        return quantite;
    }
}

