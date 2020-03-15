package tema6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompruebaFcha {

	public CompruebaFcha() {

	}

	public boolean compruebaFecha(String fecha) {
		boolean fechav = false;
		String mesS = fecha.substring(fecha.indexOf("-") +1, fecha.lastIndexOf("-"));
		System.out.println(mesS);

		Pattern mes = Pattern.compile(
				"(enero|febrero|marzo|abril|mayo|junio|julio|agosto|septiembre|octubre|noviembre|diciembre)");
		Matcher m = mes.matcher(mesS);
		if (m.lookingAt()) {
			fechav = true;
			// System.out.println(m.find());
		}
		System.out.println(fechav);
		return fechav;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompruebaFcha pr1 = new CompruebaFcha();
		pr1.compruebaFecha("enera-febrero-culo-caracla");
	}

}

