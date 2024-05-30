package com.mycompany.project;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ProjectObject extends javax.swing.JFrame {
     DefaultTableModel model;
    public ProjectObject() {
        model = new DefaultTableModel();
        model.addColumn("Roll");
        model.addColumn("Name");
        model.addColumn("Department");
        model.addColumn("Gender");
        model.addColumn("Library");
        model.addColumn("DOB");
        model.addColumn("Address");
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabbedpane = new javax.swing.JTabbedPane();
        loginpane = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        userfield = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        userlabel = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        loginbutton = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        newformpane = new javax.swing.JPanel();
        internalpanel1 = new javax.swing.JPanel();
        addbutton = new javax.swing.JButton();
        genderlabel = new javax.swing.JLabel();
        maleradio = new javax.swing.JRadioButton();
        doblabel = new javax.swing.JLabel();
        dobfield = new com.toedter.calendar.JDateChooser();
        namelabel = new javax.swing.JLabel();
        femaleradio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressarea = new javax.swing.JTextArea();
        updatebutton = new javax.swing.JButton();
        create_clear = new javax.swing.JButton();
        deptlabel = new javax.swing.JLabel();
        degreecombo = new javax.swing.JComboBox<>();
        namefield = new javax.swing.JTextField();
        removebutton = new javax.swing.JButton();
        roll_label = new javax.swing.JLabel();
        deptcombo = new javax.swing.JComboBox<>();
        degreelabel = new javax.swing.JLabel();
        rollfield = new javax.swing.JTextField();
        lib_sub = new javax.swing.JCheckBox();
        genderlabel1 = new javax.swing.JLabel();
        menubutton = new javax.swing.JButton();
        genderlabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginpane.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        userfield.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        passfield.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        userlabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        userlabel.setText("Username");

        passlabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        passlabel.setText("Password");

        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        clearbutton.setText("Clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout loginpaneLayout = new javax.swing.GroupLayout(loginpane);
        loginpane.setLayout(loginpaneLayout);
        loginpaneLayout.setHorizontalGroup(
            loginpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(571, Short.MAX_VALUE))
        );
        loginpaneLayout.setVerticalGroup(
            loginpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedpane.addTab("tab1", loginpane);

        newformpane.setBackground(new java.awt.Color(102, 102, 102));

        internalpanel1.setBackground(new java.awt.Color(204, 204, 204));

        addbutton.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        addbutton.setText("Save");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        genderlabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        genderlabel.setText("Gender");

        buttonGroup1.add(maleradio);
        maleradio.setSelected(true);
        maleradio.setText("Male");

        doblabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        doblabel.setText("DOB");

        dobfield.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        namelabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        namelabel.setText("Name");

        buttonGroup1.add(femaleradio);
        femaleradio.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        femaleradio.setText("Female");

        addressarea.setColumns(20);
        addressarea.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        addressarea.setRows(5);
        jScrollPane1.setViewportView(addressarea);

        updatebutton.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        updatebutton.setText("Update");
        updatebutton.setEnabled(false);
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        create_clear.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        create_clear.setText("Clear");
        create_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_clearActionPerformed(evt);
            }
        });

        deptlabel.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        deptlabel.setText("Department");

        degreecombo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        degreecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Bachelor's", "Master's" }));
        degreecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreecomboActionPerformed(evt);
            }
        });

        namefield.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        removebutton.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        removebutton.setText("Remove");
        removebutton.setEnabled(false);
        removebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebuttonActionPerformed(evt);
            }
        });

        roll_label.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        roll_label.setText("Roll No.");

        deptcombo.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        deptcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-" }));

        degreelabel.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        degreelabel.setText("Degree");

        rollfield.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N

        lib_sub.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        lib_sub.setText("Library Subscription");

        genderlabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        genderlabel1.setText("Address");

        menubutton.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        menubutton.setText("<");
        menubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubuttonActionPerformed(evt);
            }
        });

        genderlabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        genderlabel2.setText("(optional)");

        javax.swing.GroupLayout internalpanel1Layout = new javax.swing.GroupLayout(internalpanel1);
        internalpanel1.setLayout(internalpanel1Layout);
        internalpanel1Layout.setHorizontalGroup(
            internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalpanel1Layout.createSequentialGroup()
                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalpanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(internalpanel1Layout.createSequentialGroup()
                                .addComponent(doblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(internalpanel1Layout.createSequentialGroup()
                                .addComponent(roll_label, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rollfield, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(internalpanel1Layout.createSequentialGroup()
                                .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lib_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(internalpanel1Layout.createSequentialGroup()
                                .addComponent(genderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maleradio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femaleradio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(internalpanel1Layout.createSequentialGroup()
                                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(genderlabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(internalpanel1Layout.createSequentialGroup()
                                .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updatebutton)
                                .addGap(18, 18, 18)
                                .addComponent(removebutton)
                                .addGap(18, 18, 18)
                                .addComponent(create_clear))
                            .addGroup(internalpanel1Layout.createSequentialGroup()
                                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(degreelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deptlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(degreecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(internalpanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(menubutton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        internalpanel1Layout.setVerticalGroup(
            internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalpanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(menubutton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(degreecombo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(degreelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deptlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deptcombo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roll_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(internalpanel1Layout.createSequentialGroup()
                        .addComponent(rollfield, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlabel)
                    .addComponent(maleradio)
                    .addComponent(femaleradio))
                .addGap(18, 18, 18)
                .addComponent(lib_sub)
                .addGap(18, 18, 18)
                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalpanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(genderlabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genderlabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(create_clear)
                    .addGroup(internalpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addbutton)
                        .addComponent(updatebutton)
                        .addComponent(removebutton)))
                .addGap(48, 48, 48))
        );

        jtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jtable.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 12)); // NOI18N
        jtable.setModel(model);
        jtable.setColumnSelectionAllowed(true);
        jtable.getColumnModel().getColumn(0).setPreferredWidth(30);
        jtable.getColumnModel().getColumn(1).setPreferredWidth(100);
        jtable.getColumnModel().getColumn(2).setPreferredWidth(70);
        jtable.getColumnModel().getColumn(3).setPreferredWidth(30);
        jtable.getTableHeader().setReorderingAllowed(false);
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablekeyevent(evt);
            }
        });
        jScrollPane2.setViewportView(jtable);
        jtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout newformpaneLayout = new javax.swing.GroupLayout(newformpane);
        newformpane.setLayout(newformpaneLayout);
        newformpaneLayout.setHorizontalGroup(
            newformpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newformpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(internalpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        newformpaneLayout.setVerticalGroup(
            newformpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newformpaneLayout.createSequentialGroup()
                .addGroup(newformpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newformpaneLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(newformpaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(internalpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedpane.addTab("tab2", newformpane);

        getContentPane().add(tabbedpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, 1030, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        //Clears the textfield in the login page
        this.userfield.setText("");
        this.passfield.setText("");
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        //Confirms and Exits the Program
        int i = JOptionPane.showConfirmDialog(null, "Are you sure?", null, JOptionPane.OK_CANCEL_OPTION);
        if(i==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        //Checks if the username and password are equals to admin
        if ("admin".equals(this.userfield.getText())) {
         String password = new String(this.passfield.getPassword());
      if ("pass123".equals(password)) {
        this.setTitle("Create");
        //Switches to the Second Panel -> index = 1
        this.tabbedpane.setSelectedIndex(1);
        JOptionPane.showMessageDialog(null, "Successful!");
    }
         else{
             //Prompts user if credentials are wrong
             JOptionPane.showMessageDialog(rootPane,"Incorrect Credentials", null, JOptionPane.ERROR_MESSAGE);
         }
}
        else {
            //Prompts user if credentials are wrong
            JOptionPane.showMessageDialog(rootPane,"Incorrect Credentials", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginbuttonActionPerformed
   
    private void menubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuttonActionPerformed
        //Switches back to the login tab (panel) -> index = 0
        this.setTitle("Login");
        this.userfield.setText("");
        this.passfield.setText("");
        this.tabbedpane.setSelectedIndex(0);
    }//GEN-LAST:event_menubuttonActionPerformed

    private void create_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_clearActionPerformed
       this.updatebutton.setEnabled(false);
       this.addbutton.setEnabled(true);
        clear();
    }//GEN-LAST:event_create_clearActionPerformed

    private void degreecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreecomboActionPerformed
       //Adding Bachelor's Departments
        if(this.degreecombo.getSelectedItem().toString().equals("Bachelor's")){
           this.deptcombo.removeAllItems();
           this.deptcombo.addItem("-Select-");
           this.deptcombo.addItem("BS-CS");
           this.deptcombo.addItem("BS-AI");
           this.deptcombo.addItem("BS-SE");
           this.deptcombo.addItem("BS-IT");
        }
        //Adding Master's Departments
        else if (this.degreecombo.getSelectedItem().toString().equals("Master's")){
            this.deptcombo.removeAllItems();
            this.deptcombo.addItem("-Select-");
            this.deptcombo.addItem("MS-CS");
            this.deptcombo.addItem("MS-AI");
            this.deptcombo.addItem("MS-SE");
            this.deptcombo.addItem("MS-IT");
        }
        //Default if nothing is Selected
        else {
            this.deptcombo.removeAllItems();
            this.deptcombo.addItem("-Select-");
        }
    }//GEN-LAST:event_degreecomboActionPerformed
SimpleDateFormat date = new SimpleDateFormat("MMM d, y");
    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        //Simple Date for JTable
        try{
              String simple_date = date.format(this.dobfield.getDate());
        String gender;
        
        //Determine which radio is selected
        if(this.maleradio.isSelected()){
            gender = "Male";
        }
        else{
            gender = "Female";
        }
        
        //Determine whether the library is selected or not
        String lib;
        if(this.lib_sub.isSelected()){
            lib = "YES";
        }
        else {
            lib = "NO";
        }
        
        //Checks if any information is incomplete
        //Prompts user to enter full information
        if(this.deptcombo.getSelectedItem().toString().equals("-Select-")){
            JOptionPane.showMessageDialog(null, "Please Enter Department");
        }
        else  if(this.namefield.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Please Enter Name");
        }
        else if(this.rollfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Roll Number" );
        }
        else if(this.dobfield.getDate().toString().isEmpty()){
           JOptionPane.showMessageDialog(null, "Please Enter DOB" );
        }
        //Else inputs the data into the JTable
        else{
            
            model.addRow(new Object[] {this.rollfield.getText(), this.namefield.getText(),this.deptcombo.getSelectedItem().toString(),gender,lib,simple_date,this.addressarea.getText()});
            clear();
        }
        //Clears the fields after input
        this.updatebutton.setEnabled(false);
        this.removebutton.setEnabled(false);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Date Error");
        }
      
    }//GEN-LAST:event_addbuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
 
        check();
        clear();
        this.updatebutton.setEnabled(false);
        this.addbutton.setEnabled(true);
        
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void removebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebuttonActionPerformed
    this.updatebutton.setEnabled(false);
    this.addbutton.setEnabled(true);
    int row = jtable.getSelectedRow();
    if (row >= 0) {  // Check if there are rows to remove
        model.removeRow(row);  // Remove the last row (zero-based index)
    }
    clear();
    }//GEN-LAST:event_removebuttonActionPerformed

    private void jtablekeyevent(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablekeyevent

        //Determines the row index number;
        this.addbutton.setEnabled(false);
        this.updatebutton.setEnabled(true);
        this.removebutton.setEnabled(true);
        int row = jtable.getSelectedRow();
         try {
             Date d = date.parse(model.getValueAt(row, 5).toString());
             this.dobfield.setDate(d);
         } catch (ParseException ex) {
             System.out.println("Invalid Format");
         }
         
        
        
        System.out.println(row);
    if (row >= 0) {
      //  Adjusting the index to get the last row

        //Setting fields according to the row selected for easy editing
        System.out.println(row + " ");
        this.rollfield.setText(model.getValueAt(row, 0).toString());
        this.namefield.setText(model.getValueAt(row, 1).toString());
        this.addressarea.setText(model.getValueAt(row, 6).toString());
       
        String dept = model.getValueAt(row,2).toString();
        if(dept.contains("BS")){
            this.degreecombo.setSelectedIndex(1);
            this.deptcombo.setSelectedItem(model.getValueAt(row, 2).toString());
        }
        else{
            this.degreecombo.setSelectedIndex(2);
            this.deptcombo.setSelectedItem(model.getValueAt(row, 2).toString());
        }
         if (model.getValueAt(row, 3).toString().toLowerCase().equals("male")) {
            this.maleradio.setSelected(true);
        } else {
            this.femaleradio.setSelected(true);
        }
        
        if (model.getValueAt(row, 4).toString().toLowerCase().equals("yes")) {
            lib_sub.setSelected(true);
        } else {
            lib_sub.setSelected(false);
        }
    }
    }//GEN-LAST:event_jtablekeyevent
//clear method to call after successful entry
    private void clear(){
        this.degreecombo.setSelectedIndex(0);
        this.deptcombo.setSelectedIndex(0);
        this.namefield.setText("");
        this.rollfield.setText("");
        this.maleradio.setSelected(true);
        this.addressarea.setText("");
        this.lib_sub.setSelected(false);
        this.dobfield.setDate(null);
    }
    void check(){
        int row = jtable.getSelectedRow();
        model.setValueAt(this.rollfield.getText(), row, 0);
        model.setValueAt(this.namefield.getText(), row, 1);
        model.setValueAt(this.deptcombo.getSelectedItem().toString(), row, 2);
        model.setValueAt(date.format(this.dobfield.getDate()), row, 5);
        model.setValueAt(this.addressarea.getText(), row, 6);
        
               if(this.maleradio.isSelected()){
            model.setValueAt("Male", row, 3);
        }
        else{
            model.setValueAt("Female", row, 3);
        }
        if(this.lib_sub.isSelected()){
            model.setValueAt("YES", row, 4);
        }
        else{
            model.setValueAt("NO", row, 4);
        }
    }
    
  
    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(ProjectObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectObject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JTextArea addressarea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearbutton;
    private javax.swing.JButton create_clear;
    private javax.swing.JComboBox<String> degreecombo;
    private javax.swing.JLabel degreelabel;
    private javax.swing.JComboBox<String> deptcombo;
    private javax.swing.JLabel deptlabel;
    private com.toedter.calendar.JDateChooser dobfield;
    private javax.swing.JLabel doblabel;
    private javax.swing.JButton exitbutton;
    private javax.swing.JRadioButton femaleradio;
    private javax.swing.JLabel genderlabel;
    private javax.swing.JLabel genderlabel1;
    private javax.swing.JLabel genderlabel2;
    private javax.swing.JPanel internalpanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtable;
    private javax.swing.JCheckBox lib_sub;
    private javax.swing.JButton loginbutton;
    private javax.swing.JPanel loginpane;
    private javax.swing.JRadioButton maleradio;
    private javax.swing.JButton menubutton;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel namelabel;
    private javax.swing.JPanel newformpane;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel passlabel;
    private javax.swing.JButton removebutton;
    private javax.swing.JLabel roll_label;
    private javax.swing.JTextField rollfield;
    private javax.swing.JTabbedPane tabbedpane;
    private javax.swing.JButton updatebutton;
    private javax.swing.JTextField userfield;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
