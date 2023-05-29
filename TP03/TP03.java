import java.util.Scanner; 

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

public class TP03
{
	public static void main(String[] args)
	{
		System.out.println("instanciando objeto com parametro");
		Hora h1 = new Hora(12, 3, 52);
		
		System.out.println(h1.getHora1());
		System.out.println(h1.getHora2());
		System.out.println(h1.getSegundos());
		System.out.println(h1.getHor());
		System.out.println(h1.getMin());
		System.out.println(h1.getSeg());

		System.out.println("instanciando objeto sem parametro");
		Hora h2 = new Hora();

		System.out.println(h2.getHora1());
		System.out.println(h2.getHora2());
		System.out.println(h2.getSegundos());
		System.out.println(h2.getHor());
		System.out.println(h2.getMin());
		System.out.println(h2.getSeg());

		System.out.println("utilizando o set passando 14 para hora");
		h2.setHor(14);

		System.out.println("utilizando o set passando 45 para minuto");
		h2.setMin(45);

		System.out.println("utilizando o set passando 5 para segundo");
		h2.setSeg(5);

		System.out.println(h2.getHora1());
		System.out.println(h2.getHora2());
		System.out.println(h2.getSegundos());
		System.out.println(h2.getHor());
		System.out.println(h2.getMin());
		System.out.println(h2.getSeg());

		System.out.println("utilizando os sets sem receber parametro");
		h2.setHor();
		h2.setMin();
		h2.setSeg();

		System.out.println(h2.getHora1());
		System.out.println(h2.getHora2());
		System.out.println(h2.getSegundos());
		System.out.println(h2.getHor());
		System.out.println(h2.getMin());
		System.out.println(h2.getSeg());
	}
}