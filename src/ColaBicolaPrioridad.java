
import javax.swing.JOptionPane;


public class ColaBicolaPrioridad extends javax.swing.JFrame {

   protected int ini = -1,fin = -1,nivel;
   
   int n = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Tamaño del array?"));
   ColaTDA vector[] = new ColaTDA[n];
    public ColaBicolaPrioridad() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void prioridad(){
      int fin2 = getFin();
      int t1=fin2,t2=fin2-1;
     
     ColaTDA salvar[] = new ColaTDA[1];
     for(t2=fin2-1,t1=fin2;t2>=0;t2--,t1--){
        if(vector[t1].getNivel()> vector[t2].getNivel()){
          salvar[0] = vector[t2];
          vector[t2] = vector[t1];
          vector[t1] = salvar[0];
        }
        mostrarCola();
     }
     
    }
    
    public boolean insertar(char dato){
        if(estaColaLlena()){
          return false;  
        }
        fin++;
        nivel = (Integer) jSpinner1.getValue();
        vector[fin] = new ColaTDA( dato, nivel);
        if(fin>0){
            prioridad();
        }
        if(ini == -1){
            ini = 0;
        }
        return true;
    }
    
       public boolean eliminar(){
        if(estaColaVacia()) return false;
        if(hayUnSoloDato()){
           ini = -1;
           fin = -1;
           return true;
        }
        ini++;
        return true;
    }
    
    public void prioridadIni(){
        int ini2 = getIni();
        int t1 = ini2-1,t2 = ini2;
        ColaTDA salvar[] = new ColaTDA[1];
     for(t2=ini2,t1=ini2-1;t2<=vector.length-1;t2++,t1++){
        if(vector[t1].getNivel()<= vector[t2].getNivel()){
          salvar[0] = vector[t2];
          vector[t2] = vector[t1];
          vector[t1] = salvar[0];
        }
        mostrarCola();
     }
    }
       
    public void insertarPorIni(char dato,int nivele){
      if(getIni()>0){
         vector[ini-1] = new ColaTDA(dato,nivele);
         prioridadIni();
      }
      ini = ini-1;
        
    }
    
    public void eliminarPorFin(){
      if(getFin()>=0){
        fin = fin-1;
      }
      if( fin == -1){
        ini=-1;
      }
        
    }
 
    protected boolean estaColaLlena(){
        return fin == vector.length-1;
    }
    
    protected boolean estaColaVacia(){
        return ini== -1 && fin== -1;
    }
    protected boolean hayUnSoloDato(){
        return ini == fin;
    }
    
    public int getIni(){
        return ini;
    }
    
    public int getFin(){
        return fin;
    }
    private void mostrarCola(){
         setTitle("VLORES DE INI: "+getIni()+" FIN: "+getFin());
        if(estaColaVacia()){
            jTextPane1.setText("COLA VACIA");
            return;
        }
        String cad="";
        for(int i = getIni();i<=getFin();i++){
         cad += "["+i+"] "+vector[i];   
        }
        jTextPane1.setText(cad);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregarINI = new javax.swing.JButton();
        btnEliminarFin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));

        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setText("Dato:");

        jLabel2.setText("Nivel de prioridad:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Elminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregarINI.setText("Agregar por INI");
        btnAgregarINI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarINIActionPerformed(evt);
            }
        });

        btnEliminarFin.setText("Eliminar por FIN");
        btnEliminarFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFinActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarINI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarFin, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnAgregarINI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEliminarFin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       char dato = jTextField1.getText().charAt(0);
       boolean respuesta = insertar(dato);
       String mensaje = "ERROR COLA LLENA";
        
       if(respuesta) mensaje = "SE INSERTO CORRECTAMENTE";
       jLabel3.setText(mensaje);
       jTextField1.setText("");
       mostrarCola();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boolean respuesta = eliminar();
        String mensaje = "ERROR COLA VACIA";
        if(respuesta)mensaje = "SE ELIMINO VALOR";
        jLabel3.setText(mensaje);
        setTitle("VALORES DE INI: "+getIni()+" FIN: "+getFin());
        jTextField1.setText("");
         mostrarCola();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarINIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarINIActionPerformed
        char date = jTextField1.getText().charAt(0);
        int nivele = (Integer) jSpinner1.getValue();
     
        if(getIni()<= 0){
           jLabel3.setText("NO SE PUDO INSERTAR POR INI COLA LLENA");
         }else{
            insertarPorIni(date,nivele);
            mostrarCola();
        }
       
    }//GEN-LAST:event_btnAgregarINIActionPerformed

    private void btnEliminarFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFinActionPerformed
        eliminarPorFin();
        setTitle("VALORES DE INI: "+getIni()+" FIN: "+getFin());
        mostrarCola();
    }//GEN-LAST:event_btnEliminarFinActionPerformed

  
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColaBicolaPrioridad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarINI;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarFin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
