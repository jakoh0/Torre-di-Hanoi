import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		boolean abs= true;
		int disc=0;


		int val1=0;
		int val2=0;
		System.out.println("Inserisci quanti dischi vuoi");
		String s = n.nextLine();
		do{
			try {
				disc = Integer.parseInt( s );
				abs=false;

			} catch (Exception e) {
				System.out.println("Non hai inserito un intero");
				System.out.println("Inserisci correttamente quanti dischi vuoi");
				s = n.nextLine();
			}


		}while(abs);


		//n.nextLine();
		
		Pila [] a = { new Pila(disc,"A"), new Pila(0,"B"), new Pila(0,"C")
		};


		while(true){

			abs=true;
			a[0].stampa();
			System.out.println("");
			a[1].stampa();
			System.out.println("");
			a[2].stampa();
			System.out.println("");
			
			System.out.println("Inserisci elemento da spostare");
			
			String spost = n.nextLine();

			do{
				if(spost.length()==2){
					abs=false;
				}
				else{
					System.out.println("Inserisci elemento corretto da spostare");
					spost = n.nextLine();
				}
				spost= spost.toUpperCase();
				if(spost.charAt(0)== 'A'|| spost.charAt(0)== 'B'||spost.charAt(0)== 'C' ){
					if(spost.charAt(1)== 'A'|| spost.charAt(1)== 'B'||spost.charAt(1)== 'C'){
						abs= false;
					}
					else{
						System.out.println("Inserisci elemento corretto da spostare");
						spost = n.nextLine();
					}
				}
				else{
					System.out.println("Inserisci elemento corretto da spostare");
					spost = n.nextLine();
				}

			}while(abs);
			spost= spost.toUpperCase();

			switch (spost.charAt(0)) {
				case 'A':
					val1=0;
					break;
				case 'B':
					val1=1;
					break;
				case 'C':
					val1=2;
					break;
			}
			switch (spost.charAt(1)) {
				case 'A':
					val2=0;
					break;
				case 'B':
					val2=1;
					break;
				case 'C':
					val2=2;
					break;
			}
			if(a[val2].passa(a[val1].sposta())){
				a[val2].entra(a[val1].sposta());
				a[val1].esce();
			}
			else{
				System.out.println("Non è possibile farlo");
			}
			System.out.println("");
		}
		

	}

}
