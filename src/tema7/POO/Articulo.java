package tema7.POO;

import java.util.*;

public class Articulo {
	Scanner e = new Scanner(System.in);
	static int cantidad = 0;

	private String descripcion = "";
	private int codigo, stock = 0;
	private double pventa, pcompra;

	public Articulo() {
		this.codigo = 000;
		stock++;
	}

	public Articulo(String descripcion, int codigo, double pventa, double pcompra) {
		this.descripcion = descripcion;
		while (codigo == 0) {
			System.out.println("Introduce un codigo valido");
			codigo = e.nextInt();
		}
		this.codigo = codigo;
		this.pventa = pventa;
		this.pcompra = pcompra;
		this.stock++;
		cantidad++;

	}

	public void salida() {
		cantidad--;
		if (this.stock > 0) {
			this.stock--;
		} else {
			System.out.println("Articulo agotado");
		}

	}

	public void entrada(String descripcion, int codigo, double pventa, double pcompra) {
		this.descripcion = descripcion;
		while (codigo == 0) {
			System.out.println("Introduce un codigo valido");
			codigo = e.nextInt();
		}
		this.codigo = codigo;
		this.pventa = pventa;
		this.pcompra = pcompra;
		this.stock++;

		cantidad++;
		this.stock++;
	}public void aumentaStock(int stock) {
		this.stock+=stock;
	}
	public void reduceStock(int stock) {
		this.stock-=stock;
	}

	protected static int getCantidad() {
		return cantidad;
	}

	protected static void setCantidad(int cantidad) {
		Articulo.cantidad = cantidad;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected int getCodigo() {
		return codigo;
	}

	protected void setCodigo(int codigo) {
		while (codigo == 000) {
			System.out.println("Introduce otro codigo");
			codigo = e.nextInt();
		}
		this.codigo = codigo;
	}

	protected int getStock() {
		return stock;
	}

	protected void setStock(int stock) {
		this.stock = stock;
	}

	protected double getPventa() {
		return pventa;
	}

	protected void setPventa(double pventa) {
		this.pventa = pventa;
	}

	protected double getPcompra() {
		return pcompra;
	}

	protected void setPcompra(double pcompra) {
		this.pcompra = pcompra;
	}
}
