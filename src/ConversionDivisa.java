public class ConversionDivisa {
    private String aliasDivisa;
    private double cantidadAconvertir;
    private double precioDivisa;
    private double totalConvertido;

     private GeneraConsulta consultaDolar = new GeneraConsulta();

     private DatosDivisa datosDivisa = consultaDolar.datosDolar();

     public void setAliasDivisa(String aliasDivisa) {
        this.aliasDivisa = aliasDivisa;
    }

    public void setCantidadAconvertir(double cantidadAconvertir) {
        this.cantidadAconvertir = cantidadAconvertir;
    }

    public double getPrecioDivisa() {
        return precioDivisa = datosDivisa.conversion_rates().get(aliasDivisa);
    }

    public double getTotalDivisaAdolar() {
        return totalConvertido = cantidadAconvertir/precioDivisa ;
    }

    public double getTotalDolarAdivisa() {
        return totalConvertido = cantidadAconvertir*precioDivisa ;
    }
}
