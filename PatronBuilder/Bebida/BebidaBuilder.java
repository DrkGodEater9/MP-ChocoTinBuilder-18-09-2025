// Builder (interfaz)
interface BebidaBuilder {
    void buildNombre();
    void buildBase();
    void buildTipoLeche(String tipoLeche);
    void buildSabor();
    void buildHelado();
    Bebida getBebida();
    boolean necesitaLeche();
}