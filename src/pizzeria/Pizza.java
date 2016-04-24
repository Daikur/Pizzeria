package pizzeria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Pizza {

    private String masa, tipo, tamaño;
    private List<String> ingredientes;
    private double masaNormal;
    private double masaIntegral;
    private double tipoBasica;
    private double tipoCuatroQuesos;
    private double tipoBarbacoa;
    private double tipoMexicana;
    private double ingJamon;
    private double ingQueso;
    private double ingTomate;
    private double ingCebolla;
    private double ingOlivas;
    private double tamMediana;
    private double tamFamiliar;
    private double precioMasa;
    private double precioTipo;
    private double precioIngredientes;
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
        return "masa: " + masa + '\t' + "Precio Masa: " + precioMasa + "\r\n" + "Tipo: " + tipo + '\t' + "Precio Tipo: " + precioTipo + "\r\n" + "Tamaño: " + tamaño + "\r\n" + "Ingredientes: " + ingredientes + '\t' + "Precio Ingredientes: " + precioIngredientes + "\r\n" + "Precio Final: " + this.calcularPrecio();
    }

    public boolean generarTicket() {
        boolean correcto = false;
        
        
    
        int contador=0;
        contador++;
        try (BufferedWriter carta = new BufferedWriter(new FileWriter("pedido" + contador + ".txt", true))) {
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

    public boolean cargarPrecios() {
        boolean resultado = true;
        try (BufferedReader carta = new BufferedReader(new FileReader("CartaPrecios.txt"))) {
            String nombre, linea;

            while ((linea = carta.readLine()) != null) {
                String[] datos = linea.split(":");
                nombre = datos[0];
                switch (nombre) {
                    case "MNormal":
                        this.masaNormal = Double.parseDouble(datos[1]);
                        break;
                    case "MIntegral":
                        this.masaIntegral = Double.parseDouble(datos[1]);
                        break;
                    case "TBasica":
                        this.tipoBasica = Double.parseDouble(datos[1]);
                        break;
                    case "TCuatroQuesos":
                        this.tipoCuatroQuesos = Double.parseDouble(datos[1]);
                        break;
                    case "TBarbacoa":
                        this.tipoBarbacoa = Double.parseDouble(datos[1]);
                        break;
                    case "TMexicana":
                        this.tipoMexicana = Double.parseDouble(datos[1]);
                        break;
                    case "IJamon":
                        this.ingJamon = Double.parseDouble(datos[1]);
                        break;
                    case "IQueso":
                        this.ingQueso = Double.parseDouble(datos[1]);
                        break;
                    case "ITomate":
                        this.ingTomate = Double.parseDouble(datos[1]);
                        break;
                    case "ICebolla":
                        this.ingCebolla = Double.parseDouble(datos[1]);
                        break;
                    case "IOlivas":
                        this.ingOlivas = Double.parseDouble(datos[1]);
                        break;
                    case "TMediana":
                        this.tamMediana = Double.parseDouble(datos[1]);
                        break;
                    case "TFamiliar":
                        this.tamFamiliar = Double.parseDouble(datos[1]);
                        break;
                }
            }
        } catch (IOException ex) {
            resultado = false;
        }
        return resultado;
    }
}
