/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelBebida;

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