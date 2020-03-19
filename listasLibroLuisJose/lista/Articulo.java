package lista;

public class Articulo {

	private int stock;
	private String codigo, descripcion;
	private double precioVenta,precioCompra;
	static int cantidad=0; 
	
	public Articulo(String codigo, String desc, double precioVenta, double precioCompra, int stock) {
		this.codigo=codigo;
		this.descripcion= desc;
		this.precioCompra=precioCompra;
		this.precioVenta=precioVenta;
		this.stock= stock;
	}
	public Articulo() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return this.getDescripcion()+ " cantidad "+ this.stock+" "
				+"\nPrecio Venta "+this.precioVenta+"\nPrecio Compra "+this.precioCompra
				+"\nCodigo de producto: "+ this.codigo+"\n ";
	}
	public void aumentaStock(int aumento) {
		this.stock+=aumento;
	}
	public void vendeStock(int venta) {
		this.stock-=venta;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	

}
