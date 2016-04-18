package pizzeria;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Pizza {

    private String masa, tipo, tamaño;
    private List<String> ingredientes;
    private final double masaNormal = 9.0;
    private final double masaIntegral = 9.5;
    private final double tipoBasica = 3.0;
    private final double tipoCuatroQuesos = 5.0;
    private final double tipoBarbacoa = 7.0;
    private final double tipoMexicana = 8.5;
    private final double ingJamon = 0.5;
    private final double ingQueso = 0.75;
    private final double ingTomate = 1.5;
    private final double ingCebolla = 2.5;
    private final double ingOlivas = 1.0;
    private final double tamMediana = 1.15;
    private final double tamFamiliar = 1.3;
    private double precioMasa = 0.0;
    private double precioTipo = 0.0;
    private double precioIngredientes = 0.0;
    private double precioFinal = 0.0;

    public Pizza(String masa, String tipo, String tamaño, List ingredientes) {
        this.masa = masa;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.ingredientes = ingredientes;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public List getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Double calcularPrecio() {

        if (masa.equalsIgnoreCase("Normal")) {
            precioMasa = this.masaNormal;
        } else {
            precioMasa = this.masaIntegral;
        }

        if (tipo.equalsIgnoreCase("Básica")) {
            precioTipo = tipoBasica;
        } else if (tipo.equalsIgnoreCase("4 quesos")) {
            precioTipo = tipoCuatroQuesos;
        } else if (tipo.equalsIgnoreCase("Barbacoa")) {
            precioTipo = tipoBarbacoa;
        } else if (tipo.equalsIgnoreCase("Mexicana")) {
            precioTipo = tipoMexicana;
        }
        precioIngredientes = 0.0;
        for (String i : ingredientes) {
            if (i.equalsIgnoreCase("jamón")) {
                precioIngredientes += ingJamon;

            }
            if (i.equalsIgnoreCase("queso")) {
                precioIngredientes += ingQueso;

            }
            if (i.equalsIgnoreCase("tomate")) {
                precioIngredientes += ingTomate;

            }
            if (i.equalsIgnoreCase("cebolla")) {
                precioIngredientes += ingCebolla;

            }
            if (i.equalsIgnoreCase("olivas")) {
                precioIngredientes += ingOlivas;

            }
        }
        precioFinal = precioMasa + precioTipo + precioIngredientes;

        if (tamaño.equalsIgnoreCase("Mediana")) {
            precioFinal = precioFinal * tamMediana;
        }
        if (tamaño.equalsIgnoreCase("Familiar")) {
            precioFinal = precioFinal * tamFamiliar;
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return "masa: " + masa + '\t' + "Precio Masa: " + precioMasa + '\n' + "Tipo: " + tipo + '\t' + "Precio Tipo: " + precioTipo + '\n' + "Tamaño: " + tamaño + '\n' + "Ingredientes: " + ingredientes + '\t' + "Precio Ingredientes: " + precioIngredientes + '\n' + "Precio Final: " + this.calcularPrecio();
    }

    public boolean generarTicket() {
        boolean correcto;
        try (BufferedWriter carta = new BufferedWriter(new FileWriter("pedido.txt", true))) {
            LocalDateTime hoy = LocalDateTime.now();
            carta.write(hoy.toString());
            carta.newLine();
            carta.write(toString());
            carta.newLine();
            correcto = true;
        } catch (IOException ex) {
            correcto = false;
        }
        return correcto;
    }
}
