//Vogliamo realizzare una classe che contenga un elenco di interi 
//e che ci permetta di ciclarli (dal primo all’ultimo).
//Dovrà offrire due metodi :
//- int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato. 
//Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
//- boolean hasAncoraElementi() (che deve restituire true se ci sono ancora elementi da restituire)
//La classe deve avere un costruttore che prende come parametro un array di interi 
//(che sarà l’elenco che viene gestito internamente)
//Internamente alla classe vogliamo mantenere l’elenco di interi come array, no ArrayList o simili.
//Bonus :
//prevedere anche un costruttore che non prenda parametri e un metodo 
//addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.

package javaCiclabile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsoCollection {

	public static void main(String[] args) {
		//Creo un array con i numeri iniziali
		int [] arrayInteri = {1, 2, 3, 4, 5, 0, 7, 0, 9, 0};		
		ControlloElemento controllo = new ControlloElemento();
;
		controllo.getElementoSuccessivo(arrayInteri);
		controllo.getElemenoDisponibile(arrayInteri);
				
	}

}
