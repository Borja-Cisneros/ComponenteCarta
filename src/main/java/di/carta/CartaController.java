package di.carta;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class CartaController {
    @FXML
    private ImageView imagen;
    private Character palo;
    private String nombre;
    private int valor;
    private boolean repartida; //para saber si está en juego o no
    private boolean visible;
    private Usuario usuario;
    private static final String IMAGEN_TRASERA = "cartas/BACK.png";
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getImagenCarta() {
        return "cartas/"+nombre+palo+".png";
    }

    public void mostrarImagenDelantera() {
        visible = true;
        this.imagen.setImage(new Image(this.getClass().getResourceAsStream(getImagenCarta())));
    }
    public void mostrarImagenTrasera() {
        visible = false;
        this.imagen.setImage(new Image(this.getClass().getResourceAsStream(IMAGEN_TRASERA)));
    }
    public Character getPalo() {
        return palo;
    }

    public void setPalo(Character palo) {
        this.palo = palo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isRepartida() {
        return repartida;
    }

    public void setRepartida(boolean repartida) {
        this.repartida = repartida;
    }
    @FXML
    void cambiarLado(MouseEvent event) {
        if (visible) {
            mostrarImagenTrasera();
        } else {
            mostrarImagenDelantera();
        }
    }
    @Override
    public String toString() {
        return "Carta{" +
                "palo=" + palo +
                ", nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", imagen='" + imagen + '\'' +
                ", repartida=" + repartida +
                '}';
    }

}