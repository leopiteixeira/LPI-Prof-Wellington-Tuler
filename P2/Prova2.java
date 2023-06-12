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

	public void setDia (int dia)
	{ d=lerDia(dia); }
	public void setMes (int mes)
	{ m=lerMes(d, mes); }
	public void setAno (int ano)
	{ a=ano; }
	public void setDia ()
	{ 
		d = lerDia();
	}
	public void setMes ()
	{ 
		m = lerMes(d);
	}
	public void setAno ()
	{ 
		System.out.print("Digite o ano: ");
		a = ler.nextInt();
	}
	public int getDia()
	{return d;}
	public int getMes()
	{return m;}
	public int getAno()
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

class Hora
{	
	Scanner ler = new Scanner(System.in);

	private int h;
	private int m;
	private int s;

	Hora(int hora, int min, int sec)
	{
		h = hora;
		m = min;
		s = sec;
	}
	Hora()
	{ 
		System.out.print("Digite a Hora: ");
		h = ler.nextInt();
		System.out.print("Digite o Minuto: ");
		m = ler.nextInt();
		System.out.print("Digite o Segundo: ");	
		s = ler.nextInt();
	}

	public void setHor (int hora)
	{ h=hora; }
	public void setMin (int min)
	{ m=min; }
	public void setSeg (int sec)
	{ s=sec; }
	public void setHor ()
	{ 
		System.out.print("Digite a Hora: ");
		h = ler.nextInt();
	}
	public void setMin ()
	{ 
		System.out.print("Digite o Minuto: ");
		m = ler.nextInt();
	}
	public void setSeg ()
	{ 
		System.out.print("Digite o Segundo: ");
		s = ler.nextInt();
	}
	public int getHor()
	{return h;}
	public int getMin()
	{return m;}
	public int getSeg()
	{return s;}

	public String getHora1()
	{
		if(s > 59 || m > 59 || h > 23)
		{
			return "Valores do objeto invalidos, altere-os utilizando como valor maximo de hora 23, de minuto e segundo 59.";
		}
		String hora, min, sec;
		if(h < 10) 
		{
			hora = "0" + Integer.toString(h);
		}else{
			hora = Integer.toString(h);
		}
		if(m < 10) 
		{
			min = "0" + Integer.toString(m);
		}else{
			min = Integer.toString(m);
		}
		if(s < 10) 
		{
			sec = "0" + Integer.toString(s);
		}else{
			sec = Integer.toString(s);
		}

		return hora + ":" + min + ":" + sec;		
	}

	public String getHora2()
	{
		if(s > 59 || m > 59 || h > 23)
		{
			return "Valores do objeto invalidos, altere-os utilizando como valor maximo de hora 23, de minuto e segundo 59.";
		}
		String hora, min, sec;
		int horaConv;
		if(h < 12){
			if(h < 10) 
			{
				if(h == 0){
					hora = "12";
				}else{
					hora = "0" + Integer.toString(h);
				}
			}else{
				hora = Integer.toString(h);
			}
			if(m < 10) 
			{
				min = "0" + Integer.toString(m);
			}else{
				min = Integer.toString(m);
			}
			if(s < 10) 
			{
				sec = "0" + Integer.toString(s);
			}else{
				sec = Integer.toString(s);
			}

			return hora + ":" + min + ":" + sec + " AM";
		}
		
		horaConv = h - 12;

		if(horaConv < 10) 
		{
			if(horaConv == 0){
				hora = "12";
			}else{
				hora = "0" + Integer.toString(horaConv);
			}
		}else{
			hora = Integer.toString(horaConv);
		}
		if(m < 10) 
		{
			min = "0" + Integer.toString(m);
		}else{
			min = Integer.toString(m);
		}
		if(s < 10) 
		{
			sec = "0" + Integer.toString(s);
		}else{
			sec = Integer.toString(s);
		}
		return hora + ":" + min + ":" + sec + " PM";		
	}

	public int getSegundos(){
		return (h*3600) + (m*60) + s;
	}

}

class ConsultaAgendada
{	
	Scanner ler = new Scanner(System.in);

	private Hora hora;
	private Data data;
	private String nomePaciente;
	private static int quantidade = 0;
	private String nomeMedico;

	ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med)
	{
		hora = new Hora(h, mi, s);
		data = new Data(d, m, a);
		nomePaciente = p;
		nomeMedico = med;
		ConsultaAgendada.quantidade++;
	}
	ConsultaAgendada(Data d, Hora h, String p, String m)
	{
		hora = h;
		data = d;
		nomePaciente = p;
		nomeMedico = m;
		ConsultaAgendada.quantidade++;
	}
	ConsultaAgendada()
	{ 
		hora = new Hora();
		data = new Data();
		System.out.println("Digite o nome do paciente:");
		nomePaciente = ler.nextLine();
		System.out.println("Digite o nome do medico:");
		nomeMedico = ler.nextLine();
		ConsultaAgendada.quantidade++;
	}

	public void setData (int a, int b, int c)
	{ 
		data.setDia(a);
		data.setMes(b);
		data.setAno(c);
	}
	public void setData ()
	{ 
		data.setDia();
		data.setMes();
		data.setAno();
	}
	public void setHora (int a, int b, int c)
	{ 
		hora.setHor(a);
		hora.setMin(b);
		hora.setSeg(c);
	}
	public void setHora ()
	{ 
		hora.setHor();
		hora.setMin();
		hora.setSeg();
	}
	public void setNomePaciente (String p)
	{ nomePaciente=p; }
	public void setNomeMedico (String m)
	{ nomeMedico=m; }
	public void setNomePaciente ()
	{ 
		System.out.println("Digite o nome do paciente: ");
		nomePaciente = ler.nextLine();
	}
	public void setNomeMedico ()
	{ 
		System.out.println("Digite o nome do medico: ");
		nomeMedico = ler.nextLine();
	}
	public int getAmostra()
	{return ConsultaAgendada.quantidade;}
	public String getData()
	{return data.mostra1();}
	public String getHora()
	{return hora.getHora1();}
	public String getNomePaciente()
	{return nomePaciente;}
	public String getNomeMedico()
	{return nomeMedico;}

}

public class Prova2{
	public static void main(String[] args){

		ConsultaAgendada p1 = new ConsultaAgendada(15, 30, 0, 14, 6, 2023, "Leonardo", "Gabriel");
		System.out.println(p1.getData());
		System.out.println(p1.getHora());
		System.out.println(p1.getNomePaciente());
		System.out.println(p1.getNomeMedico());

		ConsultaAgendada p2 = new ConsultaAgendada();
		System.out.println(p2.getData());
		System.out.println(p2.getHora());
		System.out.println(p2.getNomePaciente());
		System.out.println(p2.getNomeMedico());

		p1.setData();
		p1.setHora();
		p1.setNomePaciente();
		p1.setNomeMedico();

		System.out.println(p1.getData());
		System.out.println(p1.getHora());
		System.out.println(p1.getNomePaciente());
		System.out.println(p1.getNomeMedico());

		System.out.print("Quantidade de consultas: ");
		System.out.println(p1.getAmostra());
	}
}

