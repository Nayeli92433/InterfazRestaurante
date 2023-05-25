import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Formulario extends  JFrame implements ChangeListener {
    ArrayList<Comida> comidas= new ArrayList<Comida>();
    ArrayList<Bebida> bebidas= new ArrayList<Bebida>();

    private JFrame frame;
    private JPanel paneliz, paneliz2, panelde, panelde2, panelButton, panelForm, panelContainer, panelRadio;
    private JLabel nombreComida, descripcionComida, precioComida, nombreBebida, descripcionBebida, precioBebida;
    private JTextField text1, text2, text3, text4, text5, text6;
    private JButton boton1, boton2;

    private JRadioButton radio1,radio2;
    private ButtonGroup buttonGroup;

    public Formulario() {
        initializeComponents();
        setupFrame();
        setupPanelContainer();
        addActionListeners();
        add(panelContainer);
        radio1.addChangeListener(this);
        radio2.addChangeListener(this);

    }
    //Inicializa todos los componentes del formulario, como las etiquetas, campos de texto y botones.
    private void initializeComponents() {
        EventClick eventClick = new EventClick();

        frame = new JFrame();
        panelRadio= new JPanel();
        paneliz = new JPanel();
        paneliz2 = new JPanel();
        panelde = new JPanel();
        panelde2 = new JPanel();
        panelButton = new JPanel();
        panelForm = new JPanel();
        panelContainer = new JPanel();
        nombreComida = new JLabel();
        descripcionComida= new JLabel();
        precioComida= new JLabel();
        nombreBebida= new JLabel();
        descripcionBebida= new JLabel();
        precioBebida= new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        boton1 = new JButton();
        boton2 = new JButton();
        radio1 = new JRadioButton();
        radio2 = new JRadioButton();
        buttonGroup = new ButtonGroup();

        nombreComida.setText("Nombre de la Comida");
        descripcionComida.setText("Descripcion");
        precioComida.setText("Precio");

        nombreBebida.setText("Nombre de la Bebida");
        descripcionBebida.setText("Descripcion");
        precioBebida.setText("Precio");

        radio1.setText("Comida");
        radio2.setText("Bebida");

        boton1.setText("Aceptar");
        boton2.setText("Cancelar");



    }
    //Configura la ventana principal del formulario.
    private void setupFrame() {
        setTitle("MENU DEL DIA");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(650, 300);
    }
    // Configura los paneles y los agrega al panel contenedor principal.
    private void setupPanelContainer() {
        paneliz.setLayout(new GridLayout(3, 0));
        paneliz.add(nombreComida);
        paneliz.add(descripcionComida);
        paneliz.add(precioComida);


        panelde.setLayout(new GridLayout(3, 0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);

        paneliz2.setLayout(new GridLayout(3, 2));
        paneliz2.add(nombreBebida);
        paneliz2.add(descripcionBebida);
        paneliz2.add(precioBebida);

        panelde2.setLayout(new GridLayout(3, 2));
        panelde2.add(text4);
        panelde2.add(text5);
        panelde2.add(text6);

        panelForm.setLayout(new GridLayout(1, 1));
        panelForm.setPreferredSize(new Dimension(500, 100));
        panelForm.add(paneliz);
        panelForm.add(panelde);
        panelForm.add(paneliz2);
        panelForm.add(panelde2);

        panelRadio.setLayout(new FlowLayout());
        panelRadio.setPreferredSize(new Dimension(380, 50));
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);
        panelRadio.add(radio1);
        panelRadio.add(radio2);

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(250, 50));
        panelButton.add(boton1);
        panelButton.add(boton2);

        panelContainer.setLayout(new GridLayout(3, 0));
        panelContainer.add(panelForm);
        panelContainer.add(panelRadio);
        panelContainer.add(panelButton);

        frame.add(panelContainer);
    }
    //Asigna los ActionListener a los botones.
    private void addActionListeners() {
        boton1.addActionListener(new EventClick());
        boton2.addActionListener(e -> {
            clearTextFields();
        });
    }
    // Borra el contenido de todos los campos de texto.
    private void clearTextFields() {
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
        text5.setText("");
        text6.setText("");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (radio1.isSelected()) {
            text4.setEnabled(false);
            text5.setEnabled(false);
            text6.setEnabled(false);
            text1.setEditable(true);
            text2.setEditable(true);
            text3.setEnabled(true);
        }
        if (radio2.isSelected()) {
            text1.setEditable(false);
            text2.setEditable(false);
            text3.setEnabled(false);
            text4.setEnabled(true);
            text5.setEnabled(true);
            text6.setEnabled(true);
        }
    }
    public class EventClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombreComida = text1.getText();
            String descripcionComida = text2.getText();
            String precioComida = text3.getText();
            String nombreBebida = text4.getText();
            String descripcionBebida = text5.getText();
            String precioBebida = text6.getText();

            comidas.add(new Comida(nombreComida,descripcionComida,precioComida));
            bebidas.add(new Bebida(nombreBebida,descripcionBebida,precioBebida));

            mostrar(comidas,bebidas);
        }
    }

    public void mostrar(ArrayList<Comida> comidas, ArrayList<Bebida> bebidas) {

        System.out.println("----------MENU COMIDA-----------");
        for (Comida comida : comidas) {
            System.out.println("Nombre: " + comida.getNombre());
            System.out.println("Descripcion: " + comida.getDescripcion());
            System.out.println("Precio:" + comida.getPrecio());
            System.out.println("      -----      ");

        }
        System.out.println("----------MENU BEBIDA-----------");
        for (Bebida bebida : bebidas) {
            System.out.println("Nombre: " + bebida.getNombre());
            System.out.println("Descripcion: " + bebida.getDescripcion());
            System.out.println("Precio:" + bebida.getPrecio());
            System.out.println("      -----      ");
        }

    }
}


