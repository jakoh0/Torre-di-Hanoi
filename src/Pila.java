import java.util.*;
public class Pila {
	private int i=0;
	Vector <Integer> pila = new Vector<>();
	private int n_pila;
	private String nome;
	
	public Pila(int dischi, String Nome) {
		this.n_pila=dischi;
		this.nome=Nome;
		riempi();
	}

	private void riempi() {
		for(int i=n_pila;i>0;i--) {
			pila.add(i);
		}
	}


	public String nome(){
		return nome;
	}

	public void stampa() {
		System.out.printf("pila "+nome+":");
		for(int i=0;i<pila.size();i++) {
			System.out.printf(" "+pila.elementAt(i));
		}
	}

	public int sposta(){
		if(pila.size()==0){
			return 0;
		}
		else{
			return pila.elementAt(pila.size()-1);
		}
	}

	public void entra(int num){
		pila.add(num);
	}
	public void esce(){
		pila.remove(pila.size()-1);
	}

	public boolean passa(int numero){
		if(pila.size()==0){
			return true;
		}
		else if(numero<pila.elementAt(pila.size()-1) && n_pila!=pila.size()){
			return true;
		}
		else {
			return false;
		}

		
	}
}
