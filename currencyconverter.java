// import org.json.JSONObject;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.URL;
// import java.util.HashMap;
// import java.util.Scanner;

// public class currencyconverter {
//     public static void main(String[] args) {
//         HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();
//         // currency codes
//         currencyCodes.put(1, "USD");
//         currencyCodes.put(2, "CAD");
//         currencyCodes.put(3, "EUR");
//         currencyCodes.put(4, "HKD");
//         currencyCodes.put(5, "INR");

//         String fromCode, toCode;
//         double amount;

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Wlecome to  the Currency Converter");

//         System.out.println("Currency Converter From?");
//         System.out.println(
//                 "1:usd (US dollar) \t 2:CAD (candian dollar) \t 3:Eur(Euro) \t 4:HKD (Hong Kong Dollar)\t 5:INR(indian rupee)");
//         fromCode = currencyCodes.get(sc.nextInt());

//         System.out.println("Currency Converter TO?");
//         System.out.println(
//                 "1:usd (US dollar) \t 2:CAD (candian dollar) \t 3:Eur(Euro) \t 4:HKD (Hong Kong Dollar)\t 5:INR(indian rupee)");
//         toCode = currencyCodes.get(sc.nextInt());

//         System.out.println("Amount you wish to convert? ");
//         amount = sc.nextFloat();

//         // sendHttpGETRequest(fromCode, toCode, amount);

//         System.out.println("Thank you for using the currency converter! ");

//     }

//     @SuppressWarnings("deprecation")
//     private static void sendHttpGETRequest(String fromCode, String toCode, double amount) throws IOException {
//         String GET_URL = "https://api.exchangeratesapi.io/latest?base=" + toCode + "&symbols=" + fromCode;
//         URL url = new URL(GET_URL);
//         HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//         httpURLConnection.setRequestMethod("GET");
//         int responseCode = httpURLConnection.getResponseCode();

//         if (responseCode == HttpURLConnection.HTTP_OK) {
//             BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
//             String inputLine;
//             StringBuffer response = new StringBuffer();

//             while ((inputLine = in.readLine()) != null) {
//                 response.append(inputLine);
//             }
//             in.close();
//         } else {
//             System.out.println("GET request failed");
//         }

//     }
// }

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class currencyconverter extends javax.swing.JFrame {

        /**
         * Creates new form CurrencyConverter
         */
        public currencyconverter() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jComboBox2 = new javax.swing.JComboBox<>();
                jPanel1 = new javax.swing.JPanel();
                jButton1 = new javax.swing.JButton();
                txtAmount = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                Convert = new javax.swing.JButton();
                txtFrom = new javax.swing.JComboBox<>();
                txtTo = new javax.swing.JComboBox<>();

                jComboBox2.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jButton1.setText("Currency Converter");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                txtAmount.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtAmountActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("Amount");

                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel2.setText("From");

                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel3.setText("To");

                Convert.setBackground(new java.awt.Color(255, 204, 102));
                Convert.setText("Convert");
                Convert.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ConvertActionPerformed(evt);
                        }
                });

                txtFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR" }));

                txtTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BD TK", "Indian Rupees" }));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(35, 35, 35)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                false)
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                88,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jButton1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                210,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txtAmount)
                                                                                                                .addComponent(txtFrom,
                                                                                                                                0,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(txtTo,
                                                                                                                                0,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(151, 151, 151)
                                                                                                .addComponent(Convert,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                171,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(125, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                57,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtAmount,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                45,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                47,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtFrom,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                56,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(txtTo)
                                                                                                .addGap(18, 18, 18)))
                                                                .addGap(78, 78, 78)
                                                                .addComponent(Convert,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(23, Short.MAX_VALUE)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_jButton1ActionPerformed

        private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtAmountActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txtAmountActionPerformed

        private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ConvertActionPerformed
                // TODO add your handling code here:
                Double convert;
                Double amount = Double.parseDouble(txtAmount.getText());

                if (txtFrom.getSelectedItem().toString() == "USD" && txtTo.getSelectedItem().toString() == "BD TK") {
                        convert = amount * 84.05;
                        JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " BD TK");
                } else if (txtFrom.getSelectedItem().toString() == "USD"
                                && txtTo.getSelectedItem().toString() == "Indian Rupees") {
                        convert = amount * 82.93;
                        JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " INR");
                } else if (txtFrom.getSelectedItem().toString() == "EUR"
                                && txtTo.getSelectedItem().toString() == "BD TK") {
                        convert = amount * 100.03;
                        JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " BD TK");
                } else if (txtFrom.getSelectedItem().toString() == "EUR"
                                && txtTo.getSelectedItem().toString() == "Indian Rupees") {
                        convert = amount * 90.3;
                        JOptionPane.showMessageDialog(this, "The amount is: " + convert.toString() + " INR");
                }

        }// GEN-LAST:event_ConvertActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(currencyconverter.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(currencyconverter.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(currencyconverter.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(currencyconverter.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new currencyconverter().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Convert;
        private javax.swing.JButton jButton1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JTextField txtAmount;
        private javax.swing.JComboBox<String> txtFrom;
        private javax.swing.JComboBox<String> txtTo;
        // End of variables declaration//GEN-END:variables
}
