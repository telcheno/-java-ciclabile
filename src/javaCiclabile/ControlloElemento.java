package javaCiclabile;
//Classe di controllo 
public class ControlloElemento {

//variabile di controllo
	private int indiceCorrente;
	private int indiceDisponibile;
	
//	metodo che controlla gl'indici valirizati
	public void getElemenoDisponibile(int[] arrayInteri) {
		int indiceDisponibile;
		for(int i = 0; i < arrayInteri.length; i++) {
			indiceDisponibile = arrayInteri[i];
			if (indiceDisponibile == 0) {
				System.out.println(indiceDisponibile + " Indice disponibili");				
			}
		}
	}

//	metodo che controlla gl'indici non valirizati
	public void getElementoSuccessivo(int[] arrayInteri) {
		int indiceCorrente;
		for(int i = 0; i < arrayInteri.length; i++) {
			indiceCorrente = arrayInteri[i];
			if (indiceCorrente != 0) {
				System.out.println( indiceCorrente + " Indice no disponibili");				
			}
		}
	}
}
