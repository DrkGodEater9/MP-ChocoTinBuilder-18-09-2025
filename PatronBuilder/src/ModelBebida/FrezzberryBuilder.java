package ModelBebida;

/**
 * Builder concreto para la bebida Frezzberry
 * @author AlexM
 */
public class FrezzberryBuilder implements BebidaBuilder {
    private Bebida bebida = new Bebida();
    
    /**
     * Construye el nombre de la bebida Frezzberry
     */
    public void buildNombre() { bebida.setNombre("Frezzberry"); }
    
    /**
     * Construye la base de agua para Frezzberry
     */
    public void buildBase() { bebida.setBase("agua"); }
    
    /**
     * No requiere tipo de leche para Frezzberry
     * @param tipoLeche tipo de leche (no utilizado)
     */
    public void buildTipoLeche(String tipoLeche) { }
    
    /**
     * Construye el sabor arándano
     */
    public void buildSabor() { bebida.setSabor("arandano"); }
    
    /**
     * Construye sin helado
     */
    public void buildHelado() { bebida.setTieneHelado(false); }
    
    /**
     * Retorna la bebida Frezzberry construida
     * @return bebida Frezzberry completamente preparada
     */
    public Bebida getBebida() { return bebida; }
    
    /**
     * Indica que Frezzberry no necesita leche
     * @return false porque Frezzberry no requiere leche
     */
    public boolean necesitaLeche() { return false; } //asd
}