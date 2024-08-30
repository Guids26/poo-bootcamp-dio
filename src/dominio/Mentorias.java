package dominio;

import java.time.LocalDate;

public class Mentorias extends Modulos{
	
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * 10;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}
