import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objNumero = new Scanner(System.in);
		Scanner objNumeroPessoal = new Scanner(System.in);
		Scanner objMusica = new Scanner(System.in);
		Scanner objPagina = new Scanner(System.in);
		Scanner objCondicao = new Scanner(System.in);
		System.out.println("Insira o numero pessoal:  ");
		String numeroPessoal = objNumeroPessoal.nextLine();
		System.out.println("Insira o numero para atender/ligar/correio de voz : ");
		String numero = objNumero.nextLine();
		System.out.println("Insira a musica para interagir: ");
		String musica = objMusica.nextLine();
		System.out.println("Insira a pagina Web para acessar: ");
		String pagina = objPagina.nextLine();
				
		IPhone iphone = new IPhone(numeroPessoal, numero, musica, pagina);
				iphone.adicionarNovaAba();
				iphone.atualizarPagina();
				iphone.exibirPagina(pagina);
				
				iphone.atender();
				iphone.ligar();
				iphone.iniciarCorreioVoz();
				
				iphone.selecionarMusica(musica);
				iphone.tocar();
				iphone.pausar();
		}
		
	}

