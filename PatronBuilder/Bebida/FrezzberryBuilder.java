// ConcreteBuilder 2: Frezzberry
class FrezzberryBuilder implements BebidaBuilder {
    private Bebida bebida = new Bebida();
    
    public void buildNombre() { bebida.setNombre("Frezzberry"); }
    public void buildBase() { bebida.setBase("agua"); }
    public void buildTipoLeche(String tipoLeche) { }
    public void buildSabor() { bebida.setSabor("arandano"); }
    public void buildHelado() { bebida.setTieneHelado(false); }
    public Bebida getBebida() { return bebida; }
    public boolean necesitaLeche() { return false; }
}