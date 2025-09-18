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