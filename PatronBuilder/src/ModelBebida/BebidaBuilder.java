package ModelBebida;

/**
 * Interfaz Builder que define los métodos para construir bebidas
 * @author AlexM
 */
public interface BebidaBuilder {
    /**
     * Construye el nombre de la bebida
     */
    void buildNombre();
    
    /**
     * Construye la base de la bebida
     */
    void buildBase();
    
    /**
     * Construye el tipo de leche
     * @param tipoLeche tipo de leche a utilizar
     */
    void buildTipoLeche(String tipoLeche);
    
    /**
     * Construye el sabor de la bebida
     */
    void buildSabor();
    
    /**
     * Construye la característica de helado
     */
    void buildHelado();
    
    /**
     * Retorna la bebida construida
     * @return bebida completamente construida
     */
    Bebida getBebida();
    
    /**
     * Indica si la bebida necesita leche
     * @return true si requiere leche, false en caso contrario
     */
    boolean necesitaLeche();
}