
package ModelBebida;

// ConcreteBuilder 3: Bananini
class BananiniBuilder implements BebidaBuilder {
    private Bebida bebida = new Bebida();
    
    public void buildNombre() { bebida.setNombre("Bananini"); }
    public void buildBase() { bebida.setBase("leche"); }
    public void buildTipoLeche(String tipoLeche) { bebida.setTipoLeche(tipoLeche); }
    public void buildSabor() { bebida.setSabor("banano"); }
    public void buildHelado() { bebida.setTieneHelado(true); }
    public Bebida getBebida() { return bebida; }
    public boolean necesitaLeche() { return true; }
}
