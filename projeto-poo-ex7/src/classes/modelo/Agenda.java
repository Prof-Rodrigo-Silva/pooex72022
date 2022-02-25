package classes.modelo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private String usuario;
    private int ano;
    private List<Compromisso> compromissos;
    
    public Agenda() {
        this.compromissos = new ArrayList<>();        
    }
    
    public Agenda(String usuario, int ano, List<Compromisso> compromissos) {
        this.usuario = usuario;
        this.ano = ano;
        this.compromissos = compromissos;
    }
    
    public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public List<Compromisso> getCompromissos() {
		return compromissos;
	}

	public void setCompromissos(List<Compromisso> compromissos) {
		this.compromissos = compromissos;
	}
	
	public void addCompromisso(Compromisso compromisso){
        this.compromissos.add(compromisso);
    }

	public void delCompromisso(Compromisso compromisso){
        this.compromissos.remove(compromisso);
    }
    
    public String delCompromissoDiaMes(int dia, int mes){
	        for(Compromisso c: this.compromissos)
	        	if(sizeList()) {
	        		if(c.getDia() == dia && c.getMes() == mes){
	        			this.compromissos.remove(c);
	                
	        		}
	        		return "Removeu!";
	            }       
    	return "Lista vazia!";
    }
    
    public boolean sizeList() {
    	if(!compromissos.isEmpty()) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    
    
    @Override
    public String toString() {
        return "Agenda (" + ano + ") - " + usuario;
    }   

}
