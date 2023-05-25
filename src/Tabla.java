import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Tabla extends JFrame{/*
    private JTable jTable;
    private DefaultTableModel modelo;

    public Tabla (){
        initControl();
        configTable();
        configFrame();
    }

    private void initControl(){
        /*
             DefaultTableModel()
             DefaultTableModel(int numRows, int numColumns)
             DefaultTableModel(Object[][] data, Object[] columnNames)
             DefaultTableModel(Object[] columnNames, int numRows)
             DefaultTableModel(Vector columnNames, int numRows)
             DefaultTableModel(Vector data, Vector columNames)
         */
      /*  modelo = new DefaultTableModel();
        // DefaultTableModel modelo1 = new DefaultTableModel(UtilTable.usuarios,UtilTable.titulos);
        //modelo.setDataVector(UtilTable.usuarios,UtilTable.titulos);
        modelo.setColumnIdentifiers(UtilTable.titulos);
        String [] fila = new String[modelo.getColumnCount()];
        // Vector<String> data = new Vector<>(modelo.getColumnCount());
        //ArrayList<Alumno> lista = Formulario.getElemento();
        /*for (Alumno userTable : lista) {
            fila[0] = userTable.getNombre();
            fila[1] = userTable.getApellido();
            fila[2] = userTable.getTelefono();
            fila[3] = userTable.getIne();
            fila[4] = userTable.getGenero();
            fila[5] = userTable.getSemestre();
            fila[6] = userTable.getCarrera();
            fila[7] = userTable.getMatricula();*/

/*
            modelo.addRow(fila);


        }
        jTable = new JTable(modelo);
    }

    private void configFrame(){
        setTitle("Tabla de usuarios");
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
    } */
}
