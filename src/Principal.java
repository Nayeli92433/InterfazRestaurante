import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Principal extends JFrame{

    private JFrame frame;
    private JPanel paneliz, panelButton, panelContainer,panelButton2;
    private JButton mostrarC, mostrarB, regresar;



    public Principal() {
        initializeComponents();
        setupFrame();
        setupPanelContainer();
        addActionListeners();
        add(panelContainer);

        regresar();
    }



        private void initializeComponents() {

        frame= new JFrame();
        paneliz = new JPanel();
        panelContainer= new JPanel();

        panelButton = new JPanel();
        panelButton2 = new JPanel();
        mostrarC= new JButton();
        mostrarB= new JButton();
        regresar= new JButton();

        mostrarC.setText("Mostrar Comida");
        mostrarB.setText("Mostrar Bebida");
        regresar.setText("Regresar");

    }

    private void setupFrame() {
        setTitle("MENU DEL DIA");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 200);
    }

    private void setupPanelContainer() {

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(400, 50));
        panelButton.add(mostrarC);
        panelButton.add(mostrarB);

        panelButton2.setLayout(new FlowLayout());
        panelButton2.setPreferredSize(new Dimension(400, 50));
        panelButton2.add(regresar);


        panelContainer.setLayout(new GridLayout(2, 0));
        panelContainer.add(panelButton);
        panelContainer.add(panelButton2);
        frame.add(panelContainer);
    }

    private void addActionListeners() {

        mostrarC.addActionListener(e -> {
            TablaComida tablaComida= new TablaComida();
            tablaComida.setVisible(true);

        });
        mostrarB.addActionListener(e -> {
            TablaBebida tablaBebida= new TablaBebida();
            tablaBebida.setVisible(true);

        });
    }
    private void regresar(){
        regresar.addActionListener(e -> {
            this.setVisible(false);
            new Formulario().setVisible(true);
        });
    }

}
