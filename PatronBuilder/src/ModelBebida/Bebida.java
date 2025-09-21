package ModelBebida;

/**
 * Producto que representa una bebida de la cafetería
 * @author AlexM
 */
public class Bebida {
    private String nombre;
    private String base;
    private String tipoLeche;
    private String sabor;
    private boolean tieneHelado;
    
    /**
     * Establece el nombre de la bebida
     * @param nombre nombre de la bebida
     */
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    /**
     * Establece la base de la bebida
     * @param base base líquida de la bebida
     */
    public void setBase(String base) { this.base = base; }
    
    /**
     * Establece el tipo de leche
     * @param tipoLeche tipo de leche utilizada
     */
    public void setTipoLeche(String tipoLeche) { this.tipoLeche = tipoLeche; }
    
    /**
     * Establece el sabor de la bebida
     * @param sabor sabor principal de la bebida
     */
    public void setSabor(String sabor) { this.sabor = sabor; }
    
    /**
     * Establece si la bebida tiene helado
     * @param tieneHelado true si la bebida incluye helado, false en caso contrario
     */
    public void setTieneHelado(boolean tieneHelado) { this.tieneHelado = tieneHelado; }
    
    /**
     * Muestra la información de la bebida preparada
     */
    public void mostrarBebida() {
        System.out.println("=== BEBIDA PREPARADA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Base: " + base);
        if (tipoLeche != null) {
            System.out.println("Tipo de leche: " + tipoLeche);
        }
        System.out.println("Sabor: " + sabor);
        System.out.println("Helado: " + (tieneHelado ? "Si" : "No"));
        System.out.println("========================");
    }
}