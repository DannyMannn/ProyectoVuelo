package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;

import logic.ImprimirController;
import logic.RegistroInternacionalController;
import logic.RegistroNacionalController;
import logic.CancelarController;

public class MenuView extends JFrame {

    public MenuView() {
        initComponents();
    }

    private void initComponents() {

        jMenuItem4 = new JMenuItem();
        fondoLabel = new JLabel();
        jMenuBar1 = new JMenuBar();
        fileMenu = new JMenu();
        salirMenuItem = new JMenuItem();
        buscarBoletoMenu = new JMenu();
        imprimirBoletoMenuItem = new JMenuItem();
        cancelarBoletoMenuItem = new JMenuItem();
        registrarBoletoMenu = new JMenu();
        boletoInternacionalMenuItem = new JMenuItem();
        boletoNacionalMenuItem = new JMenuItem();
        this.setResizable(false);
        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido Al Sistema");

        fondoLabel.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("resources/images/RegistrationN3.png")));

        fileMenu.setText("File");

        salirMenuItem.setText("Salir");
        salirMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                salirMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(salirMenuItem);

        jMenuBar1.add(fileMenu);

        buscarBoletoMenu.setText("Buscar Boleto");

        imprimirBoletoMenuItem.setText("Imprimir Boleto");
        cancelarBoletoMenuItem.setText("Cancelar Boleto");
        imprimirBoletoMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirBoletoMenuItemActionPerformed(evt);
            }
        });

        cancelarBoletoMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBoletoMenuItemActionPerformed(evt);
            }
        });

        buscarBoletoMenu.add(imprimirBoletoMenuItem);
        buscarBoletoMenu.add(cancelarBoletoMenuItem);

        jMenuBar1.add(buscarBoletoMenu);

        registrarBoletoMenu.setText("Registrar Boleto");
        registrarBoletoMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                registrarBoletoMenuActionPerformed(evt);
            }
        });

        boletoInternacionalMenuItem.setText("Internacional");
        boletoInternacionalMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                boletoInternacionalMenuItemActionPerformed(evt);
            }
        });
        registrarBoletoMenu.add(boletoInternacionalMenuItem);

        boletoNacionalMenuItem.setText("Nacional");
        boletoNacionalMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                boletoNacionalMenuItemActionPerformed(evt);
            }
        });
        registrarBoletoMenu.add(boletoNacionalMenuItem);

        jMenuBar1.add(registrarBoletoMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondoLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(fondoLabel, GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void salirMenuItemActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void boletoInternacionalMenuItemActionPerformed(ActionEvent evt) {
        RegistroInternacionalView registroInternacionalView = new RegistroInternacionalView();
        RegistroInternacionalController registroInternacionalController =
                new RegistroInternacionalController(registroInternacionalView);
    }

    private void boletoNacionalMenuItemActionPerformed(ActionEvent evt) {
        RegistroNacionalView registroNacionalView = new RegistroNacionalView();
        RegistroNacionalController registroNacionalController =
                new RegistroNacionalController(registroNacionalView);
    }

    private void imprimirBoletoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        ImprimirView imprimirView = new ImprimirView();
        ImprimirController controlador = new ImprimirController(imprimirView);
    }

    private void cancelarBoletoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        CancelarView cancelarView = new CancelarView();
        CancelarController cancelarViewController = new CancelarController(cancelarView);
    }

    private void registrarBoletoMenuActionPerformed(java.awt.event.ActionEvent evt) {

    }

    // Variables declaration - do not modify
    private JMenuItem boletoInternacionalMenuItem;
    private JMenuItem boletoNacionalMenuItem;
    private JMenu buscarBoletoMenu;
    private JMenu fileMenu;
    private JLabel fondoLabel;
    private JMenuItem imprimirBoletoMenuItem;
    private JMenuItem cancelarBoletoMenuItem;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem4;
    private JMenu registrarBoletoMenu;
    private JMenuItem salirMenuItem;
}
