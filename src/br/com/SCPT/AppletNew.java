package br.com.SCPT;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletNew extends Applet implements ActionListener {
	Trem cptm = new Trem();
	
	Button andar = new Button("Andar");
	Button parar = new Button("Parar");
	Button abrirPortas = new Button("Abrir portas");
	Button fecharPortas = new Button("Fechar portas");
	Button statusPortas = new Button("Status das portas");
	Button lotacao = new Button("Lotacao");
	Label textoLOG = new Label("");
	public AppletNew() {
		add(andar);
		add(parar);
		add(abrirPortas);
		add(fecharPortas);
		add(statusPortas);
		add(lotacao);
		add(textoLOG);
		andar.addActionListener(this);
		parar.addActionListener(this);
		abrirPortas.addActionListener(this);
		fecharPortas.addActionListener(this);
		statusPortas.addActionListener(this);
		lotacao.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == andar) {
			cptm.andar();
		} else if (e.getSource() == parar) {
			cptm.parar();
		} else if (e.getSource() == abrirPortas) {
			cptm.abrirPortas(cptm.getPortas());
		} else if (e.getSource() == fecharPortas) {
			cptm.fecharPortas(cptm.getPortas());
		} else if (e.getSource() == statusPortas) {
			cptm.statusPortas(cptm.getPortas());
		} else if (e.getSource() == lotacao) {
			cptm.lotar();
			System.out.println("Houve uma lotacao no trem");
		}
	}
}