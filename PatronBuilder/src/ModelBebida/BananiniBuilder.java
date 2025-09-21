package ModelBebida;

/**
 * Builder concreto para la bebida Bananini
 * @author AlexM
 */
public class BananiniBuilder implements BebidaBuilder {
    private Bebida bebida = new Bebida();
    
    /**
     * Construye el nombre de la bebida Bananini
     */
    public void buildNombre() { bebida.setNombre("Bananini"); }
    
    /**
     * Construye la base de leche para Bananini
     */
    public void buildBase() { bebida.setBase("leche"); }
    
    /**
     * Construye el tipo de leche específico
     * @param tipoLeche tipo de leche seleccionada
     */
    public void buildTipoLeche(String tipoLeche) { bebida.setTipoLeche(tipoLeche); }
    
    /**
     * Construye el sabor banano
     */
    public void buildSabor() { bebida.setSabor("banano"); }
    
    /**
     * Construye con helado incluido
     */
    public void buildHelado() { bebida.setTieneHelado(true); }
    
    /**
     * Retorna la bebida Bananini construida
     * @return bebida Bananini completamente preparada
     */
    public Bebida getBebida() { return bebida; }
    
    /**
     * Indica que Bananini necesita leche
     * @return true porque Bananini requiere leche
     */
    public boolean necesitaLeche() { return true; }
}