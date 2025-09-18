// Producto
class Bebida {
    private String nombre;
    private String base;
    private String tipoLeche;
    private String sabor;
    private boolean tieneHelado;
    
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setBase(String base) { this.base = base; }
    public void setTipoLeche(String tipoLeche) { this.tipoLeche = tipoLeche; }
    public void setSabor(String sabor) { this.sabor = sabor; }
    public void setTieneHelado(boolean tieneHelado) { this.tieneHelado = tieneHelado; }
    
    public void mostrarBebida() {
        System.out.println("=== BEBIDA PREPARADA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Base: " + base);
        if (tipoLeche != null) {
            System.out.println("Tipo de leche: " + tipoLeche);
        }
        System.out.println("Sabor: " + sabor);
        System.out.println("Helado: " + (tieneHelado ? "Si" : "No"));
        System.out.println("========================");
    }
}