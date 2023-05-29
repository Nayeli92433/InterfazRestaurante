import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class Formulario extends  JFrame implements ChangeListener, ItemListener {

    static ArrayList<Comida> comidas= new ArrayList<Comida>();
    static ArrayList<Bebida> bebidas= new ArrayList<Bebida>();

    private JFrame frame;
    private JPanel paneliz, paneliz2, panelde, panelde2, panelButton, panelForm, panelContainer, panelRadio;
    private JLabel nombreComida, descripcionComida, precioComida, tipoComida,nombreBebida, descripcionBebida, precioBebida, tipoBebida;
    private JTextField text1, text2, text3, text4, text5, text6, text7, text8;
    private JButton boton1, boton2, boton3;
    private JRadioButton radio1,radio2;
    private ButtonGroup buttonGroup;
    private JComboBox<String> tiposFoods;
    private JComboBox<String> tiposDrinks;


    private static ArrayList<Comida> lista;
    private static ArrayList<Bebida> lista2;

    private static final ArrayList<String> listaComidas = UtilCombo.tipoComidas();
    private static final ArrayList<String> listaBebidas = UtilCombo.tipoBebidas();

    public Formulario() {
        initializeComponents();
        setupFrame();
        setupPanelContainer();
        addActionListeners();
        llenarCombo();
        add(panelContainer);

        radio1.addChangeListener(this);
        radio2.addChangeListener(this);
        tiposFoods.addItemListener(this);
        tiposDrinks.addItemListener(this);

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
        tipoComida= new JLabel();
        nombreBebida= new JLabel();
        descripcionBebida= new JLabel();
        precioBebida= new JLabel();
        tipoBebida= new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        text7= new JTextField();
        text8= new JTextField();
        boton1 = new JButton();
        boton2 = new JButton();
        boton3= new JButton();
        radio1 = new JRadioButton();
        radio2 = new JRadioButton();
        buttonGroup = new ButtonGroup();
        tiposDrinks = new JComboBox<>();
        tiposFoods = new JComboBox<>();

        nombreComida.setText("Nombre de la Comida");
        descripcionComida.setText("Descripcion");
        precioComida.setText("Precio");
        tipoComida.setText("Tipo de Comida");

        nombreBebida.setText("Nombre de la Bebida");
        descripcionBebida.setText("Descripcion");
        precioBebida.setText("Precio");
        tipoBebida.setText("Tipo de Bebida");

        radio1.setText("Comida");
        radio2.setText("Bebida");

        boton1.setText("Aceptar");
        boton3.setText("Mostrar Menu");
        boton2.setText("Borrar");



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
        paneliz.setLayout(new GridLayout(4, 0));
        paneliz.add(nombreComida);
        paneliz.add(descripcionComida);
        paneliz.add(precioComida);
        paneliz.add(tipoComida);

        panelde.setLayout(new GridLayout(4, 0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
        panelde.add(tiposFoods);

        paneliz2.setLayout(new GridLayout(4, 2));
        paneliz2.add(nombreBebida);
        paneliz2.add(descripcionBebida);
        paneliz2.add(precioBebida);
        paneliz2.add(tipoBebida);

        panelde2.setLayout(new GridLayout(4, 2));
        panelde2.add(text5);
        panelde2.add(text6);
        panelde2.add(text7);
        panelde2.add(tiposDrinks);

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
        panelButton.setPreferredSize(new Dimension(200, 50));
        panelButton.add(boton1);
        panelButton.add(boton2);
        panelButton.add(boton3);


        panelContainer.setLayout(new GridLayout(3, 0));
        panelContainer.add(panelForm);
        panelContainer.add(panelRadio);
        panelContainer.add(panelButton);

        frame.add(panelContainer);
    }

    private void llenarCombo(){
        for (String s: listaComidas) {
            tiposFoods.addItem(s);
        }
        for (String s: listaBebidas) {
            tiposDrinks.addItem(s);
        }
    }

    //Asigna los ActionListener a los botones.
    private void addActionListeners() {
        boton1.addActionListener(new EventClick());
        boton2.addActionListener(e -> {
            clearTextFields();
        });
        boton3.addActionListener(e->{
            Principal principal= new Principal();
            principal.setVisible(true);
            this.setVisible(false);
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
        text7.setText("");
        text8.setText("");
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (radio1.isSelected()) {
            text1.setEditable(true);
            text2.setEditable(true);
            text3.setEnabled(true);
            tiposFoods.setEnabled(true);
            text5.setEnabled(false);
            text6.setEnabled(false);
            text7.setEnabled(false);
            tiposDrinks.setEnabled(false);

        }
        if (radio2.isSelected()) {
            text1.setEditable(false);
            text2.setEditable(false);
            text3.setEnabled(false);
            tiposFoods.setEnabled(false);
            text5.setEnabled(true);
            text6.setEnabled(true);
            text7.setEnabled(true);
            tiposDrinks.setEnabled(true);
        }
    }
    public static ArrayList<Comida> getComida(){
        return comidas;
    }

    public static ArrayList<Bebida> getBebida(){
        return bebidas;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == tiposFoods){
            String item2 = (String) tiposFoods.getSelectedItem();
            text4.setText(item2);

        }
        if (e.getSource() == tiposDrinks){
            String item2 = (String) tiposDrinks.getSelectedItem();
            text8.setText(item2);

        }

    }

    public class EventClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombreComida = text1.getText();
            String descripcionComida = text2.getText();
            String precioComida = text3.getText();
            String tipoComida= text4.getText();
            String nombreBebida = text5.getText();
            String descripcionBebida = text6.getText();
            String precioBebida = text7.getText();
            String tipoBebida = text8.getText();

            comidas.add(new Comida(nombreComida,descripcionComida,precioComida,tipoComida));
            bebidas.add(new Bebida(nombreBebida,descripcionBebida,precioBebida,tipoBebida));

            mostrar(comidas,bebidas);
        }
    }

    public void mostrar(ArrayList<Comida> comidas, ArrayList<Bebida> bebidas) {

        System.out.println("----------MENU COMIDA-----------");
        for (Comida comida : comidas) {
            System.out.println("Nombre: " + comida.getNombre());
            System.out.println("Descripcion: " + comida.getDescripcion());
            System.out.println("Precio:" + comida.getPrecio());
            System.out.println("Tipo de comida:" + comida.getTipoComida());

            System.out.println("      -----      ");

        }
        System.out.println("----------MENU BEBIDA-----------");
        for (Bebida bebida : bebidas) {
            System.out.println("Nombre: " + bebida.getNombre());
            System.out.println("Descripcion: " + bebida.getDescripcion());
            System.out.println("Precio:" + bebida.getPrecio());
            System.out.println("Tipo de comida:" + bebida.getTipoBebida());
            System.out.println("      -----      ");
        }

    }
}


