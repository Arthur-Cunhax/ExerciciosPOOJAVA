
//Escreva uma classe para representar uma lâmpada que está á venda em um supermercado.
public class Lampada{
	private String objeto;
	private String cor;
	private int estado;
		
	public Lampada(String objeto, String cor) {
		this.objeto = objeto;
		this.cor = cor;
		}
	public void ligarLampada(){
		this.estado = 1;
	}
	public void desligarLampada(){
		this.estado = 0;
	}
	public String verificarLampada(){
		if (this.estado == 0) {
			return "Lâmpada Desligada";
		}else if (this.estado == 1){
			return "Lâmpada Ligada";
		}else {
			return "Não foi possível checar o estado da Lâmpada";
		}
	}
	}

