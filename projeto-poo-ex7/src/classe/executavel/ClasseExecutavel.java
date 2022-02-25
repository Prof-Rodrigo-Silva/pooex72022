package classe.executavel;

import javax.swing.JOptionPane;

import classes.modelo.Agenda;
import classes.modelo.Compromisso;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		agenda.setUsuario(JOptionPane.showInputDialog("Informe o nome do Usuário: "));
		agenda.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano: ")));
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos compromissos: "));
		
		for(int i = 1; i <= qtd; i++) {
			Compromisso compromisso = new Compromisso();
			compromisso.setDia(Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: ")));
			compromisso.setMes(Integer.parseInt(JOptionPane.showInputDialog("Informe o mes: ")));
			compromisso.setDescricao(JOptionPane.showInputDialog("Informe a descrição: "));
			
			agenda.addCompromisso(compromisso);
		}
		
		System.out.println(agenda);
        System.out.println("--- Lista de compromissos ---");
        for(Compromisso compromisso: agenda.getCompromissos())
            System.out.println(compromisso);
        
        int rep = 0;
        do {
        	
        	rep = JOptionPane.showConfirmDialog(null, "Deseja remover um compromisso ? ");
        	if(rep == 0) {
        		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia: "));
            	int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes: "));
            	System.out.println(agenda.delCompromissoDiaMes(dia, mes));
        	}
        	
        }while(rep == 0);
        

        System.out.println();
        System.out.println(agenda);
        System.out.println("--- Lista de compromissos ---");
        for(Compromisso compromisso: agenda.getCompromissos())
            System.out.println(compromisso);
        

	}

}
