    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelBebida;

// ConcreteBuilder 1: ChocoTin
class ChocoTinBuilder implements BebidaBuilder {
    private Bebida bebida = new Bebida();
    
    public void buildNombre() { bebida.setNombre("ChocoTin"); }
    public void buildBase() { bebida.setBase("leche"); }
    public void buildTipoLeche(String tipoLeche) { bebida.setTipoLeche(tipoLeche); }
    public void buildSabor() { bebida.setSabor("chocolate"); }
    public void buildHelado() { bebida.setTieneHelado(true); }
    public Bebida getBebida() { return bebida; }
    public boolean necesitaLeche() { return true; }
}
