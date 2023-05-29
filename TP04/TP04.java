import java.util.Scanner; 
import java.util.Date;

class Data
{	

	public int lerDia (){
	int dia;
	do{
		System.out.print("Digite o dia: ");
		dia = ler.nextInt();
		if(dia <= 31 && dia > 0){
			return dia;
		}
	}while(true);
	}

	public int lerDia (int dia){
		do{
			if(dia <= 31 && dia > 0){
				return dia;
			}
			System.out.print("Dia invalido! Digite o dia novamente: ");
			dia = ler.nextInt();
		}while(true);
	}
	
	public int lerMes (int dia){
		int mes;
		while(true){
			System.out.print("Digite o mes: ");
			mes = ler.nextInt();
			if(mes <= 12 && mes > 0){
				if(dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
					return mes;
				}
				else if((dia == 30 || dia == 29)  && mes != 2){
					return mes;
				}
				else if(dia <= 28){
					return mes;
				}
			}
		}
	}

	public int lerMes (int dia, int mes){
		while(true){
			if(mes <= 12 && mes > 0){
				if(dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
					return mes;
				}
				else if((dia == 30 || dia == 29)  && mes != 2){
					return mes;
				}
				else if(dia <= 28){
					return mes;
				}
			}
		System.out.print("Mes invalido! Digite o mes novamente: ");
		mes = ler.nextInt();
		}
	}
	
	Scanner ler = new Scanner(System.in);

	String nomes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

	private int d;
	private int m;
	private int a;

	Data(int dia, int mes, int ano)
	{
		d = lerDia(dia);
		m = lerMes(d, mes);
		a = ano;
	}
	Data()
	{ 
		d = lerDia();
		m = lerMes(d);
		System.out.print("Digite o ano: ");	
		a = ler.nextInt();
	}

	public void entraDia (int dia)
	{ d=lerDia(dia); }
	public void entraMes (int mes)
	{ m=lerMes(d, mes); }
	public void entraAno (int ano)
	{ a=ano; }
	public void entraDia ()
	{ 
		d = lerDia();
	}
	public void entraMes ()
	{ 
		m = lerMes(d);
	}
	public void entraAno ()
	{ 
		System.out.print("Digite o ano: ");
		a = ler.nextInt();
	}
	public int retDia()
	{return d;}
	public int retMes()
	{return m;}
	public int retAno()
	{return a;}

	public String mostra1(){
		return Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(a);
	}

	public String mostra2(){
		return Integer.toString(d) + "/" + nomes[m - 1] + "/" + Integer.toString(a);
	}

	public boolean bissexto(){
		return a % 4 == 0;
	}

	public int diasTranscorridos(){
		return 30 * (m - 1) + d;
	}

	public Date apresentaDataAtual(){
		Date data = new Date();
		return data;
	}

}

public class TP04
{
	public static void main(String[] args)
	{
		System.out.println("instanciando objeto com parametro");
		Data d1 = new Data(28, 2, 2000);
		
		System.out.println(d1.retDia());
		System.out.println(d1.retMes());
		System.out.println(d1.retAno());
		System.out.println(d1.mostra1());
		System.out.println(d1.mostra2());
		System.out.println(d1.bissexto());
		System.out.println(d1.diasTranscorridos());
		System.out.println(d1.apresentaDataAtual());

		System.out.println("instanciando objeto sem parametro");
		Data d2 = new Data();

		System.out.println(d2.retDia());
		System.out.println(d2.retMes());
		System.out.println(d2.retAno());
		System.out.println(d2.mostra1());
		System.out.println(d2.mostra2());
		System.out.println(d2.bissexto());
		System.out.println(d2.diasTranscorridos());
		System.out.println(d2.apresentaDataAtual());


		System.out.println("utilizando o set passando 14 para dia");
		d2.entraDia(14);

		System.out.println("utilizando o set passando 4 para mes");
		d2.entraMes(4);

		System.out.println("utilizando o set passando 2023 para ano");
		d2.entraAno(2023);

		System.out.println(d2.retDia());
		System.out.println(d2.retMes());
		System.out.println(d2.retAno());
		System.out.println(d2.mostra1());
		System.out.println(d2.mostra2());
		System.out.println(d2.bissexto());
		System.out.println(d2.diasTranscorridos());
		System.out.println(d2.apresentaDataAtual());


		System.out.println("utilizando os sets sem receber parametro");
		d2.entraDia();
		d2.entraMes();
		d2.entraAno();

		System.out.println(d2.retDia());
		System.out.println(d2.retMes());
		System.out.println(d2.retAno());
		System.out.println(d2.mostra1());
		System.out.println(d2.mostra2());
		System.out.println(d2.bissexto());
		System.out.println(d2.diasTranscorridos());
		System.out.println(d2.apresentaDataAtual());

	}
}