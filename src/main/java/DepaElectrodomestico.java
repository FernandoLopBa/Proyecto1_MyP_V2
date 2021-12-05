public class DepaElectrodomestico extends Departamento{

    public static String nombre = "Electrodomésticos";

    private int descuento;

	@Override
	public String getDepartamento() {
		return nombre;
	}


	@Override
	public int getDescuento() {
		return descuento;
	}

	@Override
	public boolean tieneDescuento() {
		return descuento > 0;
	}

	public void setDescuento(int descuento){
		this.descuento = descuento;
	}

}
