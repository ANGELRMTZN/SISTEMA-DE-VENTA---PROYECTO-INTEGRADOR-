
package Vista;

import Modelo.Cliente;
import Modelo.ClienteDao;
import Modelo.Productos;
import Modelo.ProductosDao;
import Modelo.Proveedor;
import Modelo.ProveedorDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sistema extends javax.swing.JFrame {
    
    Cliente cl = new Cliente();
    ClienteDao client = new ClienteDao();
    Proveedor pr = new Proveedor();
    ProveedorDao PrDao = new ProveedorDao();
    Productos pro = new Productos();
    ProductosDao proDao = new ProductosDao();
    DefaultTableModel modelo = new DefaultTableModel();

 
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        proDao.ConsultarProveedor(cbxProveedorPro);
        
    }
    
    
  public void ListarCliente() {
    List<Cliente> ListarCl = client.ListarCliente();
    modelo = (DefaultTableModel) TableCliente.getModel();
    modelo.setRowCount(0); // Limpia las filas anteriores

    Object[] ob = new Object[4]; // Ajusta el tamaño del array para las columnas que necesitas (cédula, nombre, teléfono, dirección)
    for (int i = 0; i < ListarCl.size(); i++) {
        ob[0] = ListarCl.get(i).getCedula();   // Cédula en la primera columna
        ob[1] = ListarCl.get(i).getNombre();   // Nombre en la segunda columna
        ob[2] = ListarCl.get(i).getTelefono(); // Teléfono en la tercera columna
        ob[3] = ListarCl.get(i).getDireccion();// Dirección en la cuarta columna

        modelo.addRow(ob);
    }
    TableCliente.setModel(modelo);
}
  
    public void ListarProveedor() {
        List<Proveedor> ListarPr = PrDao.ListarProveedor();
        modelo = (DefaultTableModel) TableProveedor.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < ListarPr.size(); i++) {
            
            ob[0] = ListarPr.get(i).getCedula();
            ob[1] = ListarPr.get(i).getNombre();
            ob[2] = ListarPr.get(i).getTelefono();
            ob[3] = ListarPr.get(i).getDireccion();
            modelo.addRow(ob);
        }
        TableProveedor.setModel(modelo);

    }
  
    
    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanel = new javax.swing.JPanel();
        textosistemadeventa1 = new javax.swing.JLabel();
        btadmin = new javax.swing.JButton();
        btfacturar = new javax.swing.JButton();
        btclientes = new javax.swing.JButton();
        btproductos = new javax.swing.JButton();
        btventas = new javax.swing.JButton();
        btproveedor = new javax.swing.JButton();
        imagenbackground = new javax.swing.JLabel();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        txtnombreclienteventa = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtDescripcionVenta = new javax.swing.JTextField();
        txtTallaVenta = new javax.swing.JTextField();
        txtmarcaventa = new javax.swing.JTextField();
        txtColorVenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTipoVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVenta = new javax.swing.JTable();
        btneliminarVenta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCedulaVenta = new javax.swing.JTextField();
        txtNombreCVenta = new javax.swing.JTextField();
        btnimprimirVenta = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtTelefonoVenta = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtDirecionCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        btnGuardarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCedulaProveedor = new javax.swing.JTextField();
        txtNombreproveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProveedor = new javax.swing.JTable();
        btnguardarProveedor = new javax.swing.JButton();
        btneliminarProveedor = new javax.swing.JButton();
        btnactualizarProveedor = new javax.swing.JButton();
        btnnuevoProveedor = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        txtNombrePro = new javax.swing.JTextField();
        txtMarcaPro = new javax.swing.JTextField();
        txtColorPro = new javax.swing.JTextField();
        txtTipoPro = new javax.swing.JTextField();
        txtPrecioCPro = new javax.swing.JTextField();
        txtPrecioVPro = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableProducto = new javax.swing.JTable();
        btnEliminarPro = new javax.swing.JButton();
        btnReportePro = new javax.swing.JButton();
        btnEditarpro = new javax.swing.JButton();
        btnGuardarpro = new javax.swing.JButton();
        btnLimpiarPro = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        txtCantPro = new javax.swing.JTextField();
        cbxTallaPro = new javax.swing.JComboBox<>();
        cbxDesPro = new javax.swing.JComboBox<>();
        cbxProveedorPro = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableVentas = new javax.swing.JTable();
        btnpdfVentas = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPanel.setBackground(new java.awt.Color(255, 255, 255));

        textosistemadeventa1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        textosistemadeventa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textosistemadeventa1.setLabelFor(this);
        textosistemadeventa1.setText("Sistema De Venta ");
        textosistemadeventa1.setToolTipText("");

        btadmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\adminicon.png")); // NOI18N
        btadmin.setText("Admin");

        btfacturar.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\facturaricon.png")); // NOI18N
        btfacturar.setText("Facturar");

        btclientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\clienteicon.png")); // NOI18N
        btclientes.setText("Clientes");
        btclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclientesActionPerformed(evt);
            }
        });

        btproductos.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\productoicon.png")); // NOI18N
        btproductos.setText("Productos");
        btproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btproductosActionPerformed(evt);
            }
        });

        btventas.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\ventasicon.png")); // NOI18N
        btventas.setText("Ventas");

        btproveedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\proveedoricon.png")); // NOI18N
        btproveedor.setText("Proveedor");
        btproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTabbedPanelLayout = new javax.swing.GroupLayout(jTabbedPanel);
        jTabbedPanel.setLayout(jTabbedPanelLayout);
        jTabbedPanelLayout.setHorizontalGroup(
            jTabbedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btfacturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btproductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jTabbedPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textosistemadeventa1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(btadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jTabbedPanelLayout.setVerticalGroup(
            jTabbedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabbedPanelLayout.createSequentialGroup()
                .addComponent(textosistemadeventa1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btfacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btproveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btproductos)
                .addGap(18, 18, 18)
                .addComponent(btventas)
                .addGap(18, 18, 18)
                .addComponent(btadmin)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        getContentPane().add(jTabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 520));

        imagenbackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\backgroundsistema2.jpg")); // NOI18N
        getContentPane().add(imagenbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 730, 140));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setText("Nombre Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jLabel3.setText("Precio Venta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jLabel4.setText("Descripcion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel5.setText("Talla");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel6.setText("Marca");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jLabel7.setText("Color");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        txtCodigoVenta.setEditable(false);
        txtCodigoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        txtnombreclienteventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreclienteventaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombreclienteventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, -1));

        txtPrecioVenta.setEditable(false);
        jPanel1.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 110, -1));

        txtDescripcionVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionVentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcionVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 220, -1));
        jPanel1.add(txtTallaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, -1));

        txtmarcaventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaventaActionPerformed(evt);
            }
        });
        jPanel1.add(txtmarcaventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 120, -1));

        txtColorVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorVentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtColorVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, -1));

        jLabel8.setText("Tipo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        txtTipoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoVentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtTipoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, -1));

        TableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "MARCA", "TIPO", "TALLA", "COLOR", "DESCRIPCION ", "PRECIO V", "CANTIDAD "
            }
        ));
        jScrollPane1.setViewportView(TableVenta);
        if (TableVenta.getColumnModel().getColumnCount() > 0) {
            TableVenta.getColumnModel().getColumn(0).setPreferredWidth(30);
            TableVenta.getColumnModel().getColumn(1).setPreferredWidth(80);
            TableVenta.getColumnModel().getColumn(2).setPreferredWidth(30);
            TableVenta.getColumnModel().getColumn(3).setPreferredWidth(50);
            TableVenta.getColumnModel().getColumn(4).setPreferredWidth(20);
            TableVenta.getColumnModel().getColumn(5).setPreferredWidth(30);
            TableVenta.getColumnModel().getColumn(6).setPreferredWidth(100);
            TableVenta.getColumnModel().getColumn(7).setPreferredWidth(40);
            TableVenta.getColumnModel().getColumn(8).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 130));

        btneliminarVenta.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        btneliminarVenta.setText("X");
        btneliminarVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btneliminarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 50, 40));

        jLabel9.setText("Cedula ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel10.setText("Nombre ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));
        jPanel1.add(txtCedulaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 150, -1));
        jPanel1.add(txtNombreCVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 150, -1));

        btnimprimirVenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\printicon2.png")); // NOI18N
        jPanel1.add(btnimprimirVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 50, 50));

        jLabel11.setText("Total a Pagar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\cajeroicon.png")); // NOI18N
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 50));

        jLabel13.setText("Telefono");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));
        jPanel1.add(txtTelefonoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 150, -1));

        jLabel32.setText("Cantidad ");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));
        jPanel1.add(txtCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 80, -1));

        jLabel40.setText(".........");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        jTabbedPane11.addTab("Facturar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Cedula");

        jLabel15.setText("Telefono");

        jLabel16.setText("Nombre");

        jLabel17.setText("Direccion ");

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Telefono", "Direccion"
            }
        ));
        TableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableCliente);
        if (TableCliente.getColumnModel().getColumnCount() > 0) {
            TableCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
            TableCliente.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableCliente.getColumnModel().getColumn(2).setPreferredWidth(50);
            TableCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\saveicon1 - copia.png")); // NOI18N
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\actualizaricon.png")); // NOI18N
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\eliminaricon.png")); // NOI18N
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\cleanicon.png")); // NOI18N
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        jLabel12.setText("Registro Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditarCliente)
                            .addComponent(btnNuevoCliente))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(12, 12, 12)
                            .addComponent(txtDirecionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(txtNombreCliente))))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtDirecionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jTabbedPane11.addTab("Clientes", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setText("Cedula");

        jLabel19.setText("Nombre");

        jLabel20.setText("Telefono");

        jLabel21.setText("Direccion");

        TableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Telefono", "Direccion"
            }
        ));
        TableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableProveedor);
        if (TableProveedor.getColumnModel().getColumnCount() > 0) {
            TableProveedor.getColumnModel().getColumn(0).setPreferredWidth(50);
            TableProveedor.getColumnModel().getColumn(1).setPreferredWidth(100);
            TableProveedor.getColumnModel().getColumn(2).setPreferredWidth(50);
            TableProveedor.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        btnguardarProveedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\saveicon1 - copia.png")); // NOI18N
        btnguardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarProveedorActionPerformed(evt);
            }
        });

        btneliminarProveedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\eliminaricon.png")); // NOI18N
        btneliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarProveedorActionPerformed(evt);
            }
        });

        btnactualizarProveedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\actualizaricon.png")); // NOI18N
        btnactualizarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarProveedorActionPerformed(evt);
            }
        });

        btnnuevoProveedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\cleanicon.png")); // NOI18N
        btnnuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoProveedorActionPerformed(evt);
            }
        });

        jLabel39.setText("Registro Proveedor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoProveedor)
                            .addComponent(txtNombreproveedor)
                            .addComponent(txtDireccionProveedor)
                            .addComponent(txtCedulaProveedor)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(76, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnguardarProveedor)
                            .addComponent(btneliminarProveedor))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnactualizarProveedor)
                            .addComponent(btnnuevoProveedor))
                        .addGap(29, 29, 29)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel39)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCedulaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNombreproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardarProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnactualizarProveedor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneliminarProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jTabbedPane11.addTab("Proveedor", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Codigo");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel23.setText("Nombre");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel24.setText("Marca");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 40, -1));

        jLabel25.setText("Talla");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 30, -1));

        jLabel26.setText("Color");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabel27.setText("Tipo");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 40, -1));

        jLabel28.setText("Descripcion");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel29.setText("Precio Compra");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel30.setText("Precio Venta");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jLabel31.setText("Proveedor ");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtCodigoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProActionPerformed(evt);
            }
        });
        jPanel4.add(txtCodigoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 110, -1));
        jPanel4.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 150, -1));
        jPanel4.add(txtMarcaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 110, -1));
        jPanel4.add(txtColorPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 111, -1));
        jPanel4.add(txtTipoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 110, -1));
        jPanel4.add(txtPrecioCPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 100, -1));
        jPanel4.add(txtPrecioVPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 100, -1));

        TableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre ", "Marca", "Talla", "Color", "Tipo", "Descripcion", "Proveedor", "Precio V", "Precio C", "Cantidad"
            }
        ));
        jScrollPane4.setViewportView(TableProducto);
        if (TableProducto.getColumnModel().getColumnCount() > 0) {
            TableProducto.getColumnModel().getColumn(0).setPreferredWidth(40);
            TableProducto.getColumnModel().getColumn(1).setPreferredWidth(80);
            TableProducto.getColumnModel().getColumn(2).setPreferredWidth(30);
            TableProducto.getColumnModel().getColumn(3).setPreferredWidth(20);
            TableProducto.getColumnModel().getColumn(4).setPreferredWidth(30);
            TableProducto.getColumnModel().getColumn(5).setPreferredWidth(40);
            TableProducto.getColumnModel().getColumn(6).setPreferredWidth(100);
            TableProducto.getColumnModel().getColumn(7).setPreferredWidth(100);
            TableProducto.getColumnModel().getColumn(8).setPreferredWidth(40);
            TableProducto.getColumnModel().getColumn(9).setPreferredWidth(40);
            TableProducto.getColumnModel().getColumn(10).setPreferredWidth(30);
        }

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 780, 170));

        btnEliminarPro.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\borrarproductoicon.png")); // NOI18N
        jPanel4.add(btnEliminarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 50, 50));

        btnReportePro.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\pedidoicons.png")); // NOI18N
        jPanel4.add(btnReportePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        btnEditarpro.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\actualizaproductoicon.png")); // NOI18N
        jPanel4.add(btnEditarpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 50, 50));

        btnGuardarpro.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\saveicon1 - copia.png")); // NOI18N
        btnGuardarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarproActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardarpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        btnLimpiarPro.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\cleanicon.png")); // NOI18N
        btnLimpiarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 50, 50));

        jLabel33.setText("Cantidad ");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));
        jPanel4.add(txtCantPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 100, -1));

        cbxTallaPro.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        cbxTallaPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XS", "S", "M", "L", "XL", "XXL", "XXXL" }));
        cbxTallaPro.setToolTipText("");
        jPanel4.add(cbxTallaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 70, -1));

        cbxDesPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Para hombre adulto  ", "Para mujer adulta  ", "Para niño  ", "Para niña  ", "Para adultos  ", "Para niños  " }));
        jPanel4.add(cbxDesPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 150, -1));

        jPanel4.add(cbxProveedorPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 150, -1));

        jTabbedPane11.addTab("Productos", jPanel4);

        TableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Vendedor ", "Total"
            }
        ));
        jScrollPane5.setViewportView(TableVentas);
        if (TableVentas.getColumnModel().getColumnCount() > 0) {
            TableVentas.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableVentas.getColumnModel().getColumn(1).setPreferredWidth(60);
            TableVentas.getColumnModel().getColumn(2).setPreferredWidth(60);
            TableVentas.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        btnpdfVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\pdficon.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpdfVentas)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnpdfVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        jTabbedPane11.addTab("Ventas", jPanel5);

        jLabel34.setText("RNC");

        jLabel35.setText("Nombre");

        jLabel36.setText("Telefono ");

        jLabel37.setText("Dirección ");

        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon("C:\\Users\\alcat\\Documents\\NetBeansProjects\\SISTEMAVENTA2\\src\\Img\\actualizardatosempresaicon.png")); // NOI18N
        jButton18.setText("Actualizar");

        jLabel38.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel38.setText("DATOS DE LA EMPRESA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton18)
                            .addComponent(jLabel38)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel35))
                                    .addComponent(jLabel37)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel38)
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane11.addTab("Admin", jPanel6);

        getContentPane().add(jTabbedPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 810, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btproductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btproductosActionPerformed

    private void txtCodigoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVentaActionPerformed

    private void txtnombreclienteventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreclienteventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreclienteventaActionPerformed

    private void txtDescripcionVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionVentaActionPerformed

    private void txtmarcaventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaventaActionPerformed

    private void txtColorVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorVentaActionPerformed

    private void txtTipoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoVentaActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        // TODO add your handling code here:
        
        if (!"".equals(txtCedulaCliente.getText()) || !"".equals(txtNombreCliente.getText()) || !"".equals(txtTelefonoCliente.getText())) {

            cl.setCedula(txtCedulaCliente.getText());
            cl.setNombre(txtNombreCliente.getText());
            cl.setTelefono(txtTelefonoCliente.getText());

            // Permitir que la dirección esté vacía
            cl.setDireccion(txtDirecionCliente.getText());

            client.RegistrarCliente(cl);

            JOptionPane.showMessageDialog(null, "Cliente Registrado");
            LimpiarTable();
            LimpiarCliente();
            ListarCliente();

        } else {
            JOptionPane.showMessageDialog(null, "Los campos Cédula, Nombre y Teléfono son obligatorios");
        }

        
        
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        // TODO add your handling code here: 
      if (!"".equals(txtCedulaCliente.getText())) {
    int pregunta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?");
    if (pregunta == JOptionPane.YES_OPTION) { // Asegura que se compara con la constante correcta
        String cedula = txtCedulaCliente.getText(); // Usa una variable local para mayor claridad
        if (client.EliminarCliente(cedula)) { // Comprueba si la eliminación fue exitosa
            JOptionPane.showMessageDialog(null, "Cliente eliminado");
            LimpiarTable();
            LimpiarCliente();
            ListarCliente();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el cliente");
        }
    }
} else {
    JOptionPane.showMessageDialog(null, "Ingrese una cédula válida");
}

        
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnnuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoProveedorActionPerformed
        // TODO add your handling code here:
        LimpiarProveedor();
    }//GEN-LAST:event_btnnuevoProveedorActionPerformed

    private void txtCodigoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProActionPerformed

    private void btnLimpiarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarProActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void btproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btproveedorActionPerformed
        // TODO add your handling code here:
         LimpiarTable();
         ListarProveedor();
         jTabbedPane11.setSelectedIndex(2);
        
    }//GEN-LAST:event_btproveedorActionPerformed

    private void btclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclientesActionPerformed
        // TODO add your handling code here:
        LimpiarTable();
        ListarCliente();
      
        jTabbedPane11.setSelectedIndex(1);
        
    }//GEN-LAST:event_btclientesActionPerformed

    private void TableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClienteMouseClicked
        // TODO add your handling code here:
        
        int fila = TableCliente.rowAtPoint(evt.getPoint());
        txtCedulaCliente.setText(TableCliente.getValueAt(fila, 0).toString()); // DNI (cédula) en la primera columna
        txtNombreCliente.setText(TableCliente.getValueAt(fila, 1).toString()); // Nombre en la segunda columna
        txtTelefonoCliente.setText(TableCliente.getValueAt(fila, 2).toString()); // Teléfono en la tercera columna
        txtDirecionCliente.setText(TableCliente.getValueAt(fila, 3).toString()); // Dirección en la cuarta columna

    }//GEN-LAST:event_TableClienteMouseClicked

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        // TODO add your handling code here:
         if ("".equals(txtCedulaCliente.getText())) {
            JOptionPane.showMessageDialog(null, "seleccione una fila");
        } else {

            if (!"".equals(txtCedulaCliente.getText()) || !"".equals(txtNombreCliente.getText()) || !"".equals(txtTelefonoCliente.getText())) {
                cl.setCedula(txtCedulaCliente.getText());
                cl.setNombre(txtNombreCliente.getText());
                cl.setTelefono(txtTelefonoCliente.getText());
                cl.setDireccion(txtDirecionCliente.getText());
              
                client.ModificarCliente(cl);
                JOptionPane.showMessageDialog(null, "Cliente Modificado");
                LimpiarTable();
                LimpiarCliente();
                ListarCliente();
            } else {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            }
        }
        
        
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        // TODO add your handling code here:
        
        LimpiarCliente();
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnguardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarProveedorActionPerformed
        // TODO add your handling code here:
         if (!"".equals(txtCedulaProveedor.getText()) || !"".equals(txtNombreproveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText())) {
            pr.setCedula(txtCedulaProveedor.getText());
            pr.setNombre(txtNombreproveedor.getText());
            pr.setTelefono(txtTelefonoProveedor.getText());
            pr.setDireccion(txtDireccionProveedor.getText());
            PrDao.RegistrarProveedor(pr);
            JOptionPane.showMessageDialog(null, "Proveedor Registrado");
             LimpiarTable();
             ListarProveedor();
             LimpiarProveedor();

            btnguardarProveedor.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Los campos esta vacios");
        }
    }//GEN-LAST:event_btnguardarProveedorActionPerformed

    private void TableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProveedorMouseClicked
        // TODO add your handling code here:
        
        int fila = TableProveedor.rowAtPoint(evt.getPoint());
        
        txtCedulaProveedor.setText(TableProveedor.getValueAt(fila, 0).toString());
        txtNombreproveedor.setText(TableProveedor.getValueAt(fila, 1).toString());
        txtTelefonoProveedor.setText(TableProveedor.getValueAt(fila, 2).toString());
        txtDireccionProveedor.setText(TableProveedor.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_TableProveedorMouseClicked

    private void btneliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarProveedorActionPerformed
        // TODO add your handling code here:
        
        if (!"".equals(txtCedulaProveedor.getText())) { // Verifica que el campo de cédula no esté vacío
            int pregunta = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?");
            if (pregunta == JOptionPane.YES_OPTION) { // Asegúrate de usar la constante correcta
                String cedula = txtCedulaProveedor.getText(); // Obtiene la cédula
                if (PrDao.EliminarProveedor(cedula)) { // Llama al método de eliminación
                    JOptionPane.showMessageDialog(null, "Proveedor eliminado");
                    LimpiarTable();
                    LimpiarProveedor();
                    ListarProveedor();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el proveedor");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }

    }//GEN-LAST:event_btneliminarProveedorActionPerformed

    private void btnactualizarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarProveedorActionPerformed
        // TODO add your handling code here:
         if ("".equals(txtCedulaProveedor.getText())) {
            JOptionPane.showMessageDialog(null, "Seleecione una fila");
        } else {
            if (!"".equals(txtCedulaProveedor.getText()) || !"".equals(txtNombreproveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText())) {
                pr.setCedula(txtCedulaProveedor.getText());
                pr.setNombre(txtNombreproveedor.getText());
                pr.setTelefono(txtTelefonoProveedor.getText());
                pr.setDireccion(txtDireccionProveedor.getText());
                
                PrDao.ModificarProveedor(pr);
                JOptionPane.showMessageDialog(null, "Proveedor Modificado");
                LimpiarTable();
                ListarProveedor();
                LimpiarProveedor();
                
                btnguardarProveedor.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnactualizarProveedorActionPerformed

    private void btnGuardarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarproActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtCodigoPro.getText())
                && !"".equals(txtNombrePro.getText())
                && !"".equals(txtMarcaPro.getText())
                && !"".equals(txtColorPro.getText())
                && !"".equals(cbxTallaPro.getSelectedItem())
                && !"".equals(txtTipoPro.getText())
                && !"".equals(cbxDesPro.getSelectedItem())
                && !"".equals(txtPrecioVPro.getText())
                && !"".equals(cbxProveedorPro.getSelectedItem())
                && !"".equals(txtPrecioCPro.getText())
                && !"".equals(txtCantPro.getText())) {

            pro.setCodigo(txtCodigoPro.getText());
            pro.setNombre(txtNombrePro.getText());
            pro.setMarca(txtMarcaPro.getText());
            pro.setColor(txtColorPro.getText());
            pro.setTalla(cbxTallaPro.getSelectedItem().toString());
            pro.setTipo(txtTipoPro.getText());
            pro.setDescripcion(cbxDesPro.getSelectedItem().toString());
            pro.setPrecioVenta(Double.parseDouble(txtPrecioVPro.getText()));
            
            pro.setProveedor(cbxProveedorPro.getSelectedItem().toString());
           
            pro.setPrecioCompra(Double.parseDouble(txtPrecioCPro.getText()));
            pro.setCantidad(Integer.parseInt(txtCantPro.getText()));

            proDao.RegistrarProductos(pro);
            JOptionPane.showMessageDialog(null, "Producto registrado");

            LimpiarTable();
      
        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
        }

        
    }//GEN-LAST:event_btnGuardarproActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCliente;
    private javax.swing.JTable TableProducto;
    private javax.swing.JTable TableProveedor;
    private javax.swing.JTable TableVenta;
    private javax.swing.JTable TableVentas;
    private javax.swing.JButton btadmin;
    private javax.swing.JButton btclientes;
    private javax.swing.JButton btfacturar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarpro;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEliminarPro;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarpro;
    private javax.swing.JButton btnLimpiarPro;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnReportePro;
    private javax.swing.JButton btnactualizarProveedor;
    private javax.swing.JButton btneliminarProveedor;
    private javax.swing.JButton btneliminarVenta;
    private javax.swing.JButton btnguardarProveedor;
    private javax.swing.JButton btnimprimirVenta;
    private javax.swing.JButton btnnuevoProveedor;
    private javax.swing.JButton btnpdfVentas;
    private javax.swing.JButton btproductos;
    private javax.swing.JButton btproveedor;
    private javax.swing.JButton btventas;
    private javax.swing.JComboBox<String> cbxDesPro;
    private javax.swing.JComboBox<String> cbxProveedorPro;
    private javax.swing.JComboBox<String> cbxTallaPro;
    private javax.swing.JLabel imagenbackground;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JPanel jTabbedPanel;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JLabel textosistemadeventa1;
    private javax.swing.JTextField txtCantPro;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCedulaProveedor;
    private javax.swing.JTextField txtCedulaVenta;
    private javax.swing.JTextField txtCodigoPro;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtColorPro;
    private javax.swing.JTextField txtColorVenta;
    private javax.swing.JTextField txtDescripcionVenta;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtDirecionCliente;
    private javax.swing.JTextField txtMarcaPro;
    private javax.swing.JTextField txtNombreCVenta;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtNombreproveedor;
    private javax.swing.JTextField txtPrecioCPro;
    private javax.swing.JTextField txtPrecioVPro;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtTallaVenta;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtTelefonoVenta;
    private javax.swing.JTextField txtTipoPro;
    private javax.swing.JTextField txtTipoVenta;
    private javax.swing.JTextField txtmarcaventa;
    private javax.swing.JTextField txtnombreclienteventa;
    // End of variables declaration//GEN-END:variables

  private void LimpiarCliente() {
        
        txtCedulaCliente.setText("");
        txtNombreCliente.setText("");
        txtTelefonoCliente.setText("");
        txtDirecionCliente.setText("");
    }
  
  private void LimpiarProveedor() {
       
        txtCedulaProveedor.setText("");
        txtNombreproveedor.setText("");
        txtTelefonoProveedor.setText("");
        txtDireccionProveedor.setText("");
    }

}



