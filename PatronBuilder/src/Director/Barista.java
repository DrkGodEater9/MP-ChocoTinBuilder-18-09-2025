package Director;

import ModelBebida.BebidaBuilder;
import ModelBebida.Bebida;

/**
 * Director que coordina la construcción de bebidas
 * @author AlexM
 */
public class Barista {
    private BebidaBuilder builder;
    
    /**
     * Establece el builder a utilizar para construir bebidas
     * @param builder el constructor de bebidas a utilizar
     */
    public void setBuilder(BebidaBuilder builder) {
        this.builder = builder;
    }
    
    /**
     * Obtiene la bebida construida
     * @return la bebida completamente construida
     */
    public Bebida getBebida() {
        return builder.getBebida();
    }
    
    /**
     * Coordina el proceso de preparación de la bebida
     * @param tipoLeche tipo de leche a utilizar en la bebida
     */
    public void prepararBebida(String tipoLeche) {
        builder.buildNombre();
        builder.buildBase();
        if (builder.necesitaLeche()) {
            builder.buildTipoLeche(tipoLeche);
        }
        builder.buildSabor();
        builder.buildHelado();
    }
}