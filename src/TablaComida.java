import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TablaComida extends JFrame {
    private JTable jTable;
    private DefaultTableModel modelo;
    private JPanel panelButton, panelContainer;
    private JButton regresar;

    public TablaComida (){
        initializeComponents();
        initControl();
        configTable();
        configFrame();
        setupPanelContainer();
        add(panelContainer);

        regresar();
    }

    private void initializeComponents() {

        regresar= new JButton();
        panelButton= new JPanel();
        panelContainer= new JPanel();

        regresar.setText("Regresar");


    }

    private void initControl(){


        modelo = new DefaultTableModel();

        modelo.setColumnIdentifiers(UtilTable.titulos);
        String [] fila = new String[modelo.getColumnCount()];

        ArrayList<Comida> lista = Formulario.getComida();
        for (Comida userTable : lista) {
            fila[0] = userTable.getNombre();
            fila[1] = userTable.getDescripcion();
            fila[2] = userTable.getPrecio();
            fila[3] = userTable.getTipoComida();

        modelo.addRow(fila);


            }
        jTable = new JTable(modelo);
    }
    private void configFrame(){
        setTitle("Menu Comida");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pack();
        setVisible(true);
        setResizable(false);
        setSize(600, 200);
    }

    private void configTable(){
        jTable.setGridColor(new Color(88, 214, 141));
        jTable.setPreferredScrollableViewportSize(new Dimension(500, 70));
        //Creamos un JscrollPane y le agregamos la JTable
        JScrollPane scrollPane = new JScrollPane(jTable);
        //Agregamos el JScrollPane al contenedor
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
    private void setupPanelContainer() {


        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(380, 50));
        panelButton.add(regresar);


        panelContainer.setLayout(new GridLayout(2, 0));
        panelContainer.add(panelButton);

    }

    private void regresar(){
        regresar.addActionListener(e -> {
            this.setVisible(false);
            new Formulario().setVisible(true);
        });
    }
}
