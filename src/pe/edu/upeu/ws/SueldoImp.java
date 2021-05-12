package pe.edu.upeu.ws;

import javax.jws.WebService;

@WebService(endpointInterface="pe.edu.upeu.ws.SueldoDao")
public class SueldoImp implements SueldoDao {

	@Override
	public double calcularSueldo(double horas, double pagohora) {
		// TODO Auto-generated method stub
		double sbt=0;
		if (horas<=40) {
			sbt=horas*pagohora;
		}else {
			sbt=40*pagohora+(horas-40)*(pagohora+(pagohora/2));
		}
		return sbt;
	}
}
