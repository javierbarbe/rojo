package tema6;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Patrones {
	Scanner e= new Scanner(System.in);
public Patrones() {
	
}
public boolean compruebaDni(String dni) {
	boolean formatoDni;
	Pattern vocales= Pattern.compile("[aeiou]");
	Matcher m=vocales.matcher(dni);
	m.find();
	formatoDni=dni.matches("[0-9]{8}[A-Za-z]$");
	
	
	
	
	return formatoDni;
}


}
