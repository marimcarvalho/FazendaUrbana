package src;

import javax.swing.*;

public class FazendaUrbana {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginScreen();  // Inicializa a tela de login
        });
    }
}
