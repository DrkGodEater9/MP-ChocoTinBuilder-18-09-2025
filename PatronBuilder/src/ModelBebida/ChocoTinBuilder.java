package ModelBebida;

/**
 * Builder concreto para la bebida ChocoTin
 * @author AlexM
 */
public class ChocoTinBuilder implements BebidaBuilder {
    private Bebida bebida = new Bebida();
    
    /**
     * Construye el nombre de la bebida ChocoTin
     */
    public void buildNombre() { bebida.setNombre("ChocoTin"); }
    
    /**
     * Construye la base de leche para ChocoTin
     */
    public void buildBase() { bebida.setBase("leche"); }
    
    /**
     * Construye el tipo de leche específico
     * @param tipoLeche tipo de leche seleccionada
     */
    public void buildTipoLeche(String tipoLeche) { bebida.setTipoLeche(tipoLeche); }
    
    /**
     * Construye el sabor chocolate
     */
    public void buildSabor() { bebida.setSabor("chocolate"); }
    
    /**
     * Construye con helado incluido
     */
    public void buildHelado() { bebida.setTieneHelado(true); }
    
    /**
     * Retorna la bebida ChocoTin construida
     * @return bebida ChocoTin completamente preparada
     */
    public Bebida getBebida() { return bebida; }
    
    /**
     * Indica que ChocoTin necesita leche
     * @return true porque ChocoTin requiere leche
     */
    public boolean necesitaLeche() { return true; }
}