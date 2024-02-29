package di.carta;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Carta extends AnchorPane {

    private CartaController controller;

    public Carta() {
        super();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("vistaCarta.fxml"));
            controller = new CartaController();
            fxmlLoader.setController(controller);
            Node nodo = fxmlLoader.load();
            this.getChildren().add(nodo);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public Usuario getUsuario() {
        return controller.getUsuario();
    }

    public void setUsuario(Usuario usuario) {
        controller.setUsuario(usuario);
    }

    public void mostrarCarta() {
        controller.mostrarImagenDelantera();
    }

    public void ocultarCarta() {
        controller.mostrarImagenTrasera();
    }

    public Character getPalo() {
        return controller.getPalo();
    }

    public void setPalo(Character palo) {
        controller.setPalo(palo);
    }

    public String getNombre() {
        return controller.getNombre();
    }

    public void setNombre(String nombre) {
        controller.setNombre(nombre);
    }

    public int getValor() {
        return controller.getValor();
    }

    public void setValor(int valor) {
        controller.setValor(valor);
    }

    public boolean isRepartida() {
        return controller.isRepartida();
    }

    public void setRepartida(boolean repartida) {
        controller.setRepartida(repartida);
    }


}