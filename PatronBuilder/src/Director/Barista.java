/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Director;

/**
 *
 * @author DrkGodEater
 */
// Director
class Barista {
    private BebidaBuilder builder;
    
    public void setBuilder(BebidaBuilder builder) {
        this.builder = builder;
    }
    
    public Bebida getBebida() {
        return builder.getBebida();
    }
    
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
