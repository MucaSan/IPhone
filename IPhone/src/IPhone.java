
public class IPhone implements NavegarInternet, AparelhoTelefonico, ReprodutorMusical{
	private String  pagina;
	private String numero;
	private String musica;
	private String numeroPessoal;
	
	public IPhone(String pagina, String numero, String musica, String numeroPessoal) {
		this.pagina = pagina;
		this.numero = numero;
		this.musica = musica;
		this.numeroPessoal = numeroPessoal;
	}
	public IPhone(String numero, String musica, String numeroPessoal) {
		this.numero = numero;
		this.musica = musica;
		this.numeroPessoal = numeroPessoal;
	}
	
	public IPhone(String numero, String numeroPessoal) {
		this.numero = numero;
		this.numeroPessoal = numeroPessoal;
	}
	public IPhone(String numeroPessoal) {
		this.numeroPessoal = numeroPessoal;
	}
	
	public void exibirPagina(String pagina) {
		 this.pagina = pagina;
		 System.out.println(String.format("Exibindo a página %s ", pagina));
	 }
	 public void adicionarNovaAba() {
		 System.out.println("Adicionando nova aba!");
	 }
	 public void atualizarPagina() {
		 System.out.println(String.format("Atualizando a página %s", pagina));
	 }
	 public String getPagina() {
		 return pagina;
	 }
	 public void ligar() {
		 System.out.println(String.format("Ligando para o numero %s ", numero));
		 
	 }
	 public void atender() {
		 System.out.println(String.format("Atendendo o numero %s ", numero));
		 
	 }
	 public void iniciarCorreioVoz() {
		 System.out.println(String.format("Iniciando um correio de voz entre os numeros %s e %s !", numeroPessoal, numero));
	 }
	 public String getNumero() {
		 return numero;
	 }
	 public String getNumeroPessaoal() {
		 return numeroPessoal;
	 }
	 public void setNumeroPessoal(String numeroPessoal) {
		 this.numeroPessoal = numeroPessoal;
	 }
	 public void setNumero(String numero) {
		 this.numero = numero;
	 }
	 public void tocar() {
		 System.out.println(String.format("Tocando a musica %s", musica));
	 }
	 public void pausar() {
		 System.out.println(String.format("Pausando a musica %s",musica));
	 }
	 public void selecionarMusica(String musica) {
		 this.musica = musica;
		 System.out.println(String.format("Selecionando a musica %s " , musica));
	 }
	 public String getMusica() {
		 return musica;
	 }


}	
