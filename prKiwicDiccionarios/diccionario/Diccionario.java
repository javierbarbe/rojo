package diccionario;

import java.io.IOException;
import java.util.List;

public interface  Diccionario <C,V>{
boolean insertar(C clave , V valor);
public List<V> consultar(C clave);
boolean eliminar (C clave);
int tamaño();
void limpiar();
public List <C> claves();
public void escribirDiccionario(String nomFich) throws IOException;
}
