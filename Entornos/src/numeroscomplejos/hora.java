package numeroscomplejos;
import java.util.Scanner;
public class hora {
	private int horas;
	private int minutos;
	private int segundos;
	public hora() {
		this.horas=0;
		this.minutos=0;
		this.segundos=0;
	}
	public hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		valida();
	}

	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
		valida();
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
		valida();
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
		valida();
	}
	private void valida() {
		if(this.horas<0 || this.horas>23) {
			this.horas=0;
		}
		if(this.minutos<0 || this.minutos>59) {
			this.minutos=0;
		}
		if(this.segundos<0 || this.segundos>59) {
			this.segundos=0;
		}
	}
	
	//Metodo que devuelve el numero de segundos transcurridos desde media noche hasta la hora actual
	public int aSegundos() {
		int segundos=this.horas*3600 + this.minutos*60 + this.segundos;
		return segundos;
	}
	//Metodo que pone la hora actual calculando cuanto ha pasado desde media noche con los segundos 
	//que se le pasan como argumento

	
	public int segundosDesde(hora hora2) {
		return(this.aSegundos()-hora2.aSegundos());
	}

	public boolean igualQue(hora hora2) {
		if(this.aSegundos()==hora2.aSegundos()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean menorQue(hora hora2) {
		if(this.aSegundos()<hora2.aSegundos()) {
			return true;
		}else {
			return false;
		}
	}
	public boolean mayorQue(hora hora2) {
		if(this.aSegundos()>hora2.aSegundos()) {
			return true;
		}else {
			return false;
		}
	}
	

	
	
}
