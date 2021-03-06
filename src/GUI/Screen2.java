/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFileChooser;

/**
 *
 * @author C. Levallois
 */
public class Screen2 extends javax.swing.JFrame {

    public static String fileSelectedPathANdName = "nothing";

    /**
     * Creates new form Screen2
     */
    public Screen2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        closeParameters = new javax.swing.JButton();
        binaryBox = new javax.swing.JCheckBox();
        nGramsField = new javax.swing.JTextField();
        minCharsField = new javax.swing.JTextField();
        maxWordsField = new javax.swing.JTextField();
        nGrams = new javax.swing.JLabel();
        numChars = new javax.swing.JLabel();
        maxWords = new javax.swing.JLabel();
        binaryCounting = new javax.swing.JLabel();
        openStopWordsFile = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        minOccurrences = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deleteChars = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        useScientificStopWords = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        useAlchemyAPIButton = new javax.swing.JCheckBox();
        selectCategoriesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        wordSeparator = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        useTDIDF = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        closeParameters.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeParameters.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.closeParameters.text")); // NOI18N
        closeParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeParametersActionPerformed(evt);
            }
        });

        binaryBox.setBackground(new java.awt.Color(255, 255, 255));
        binaryBox.setSelected(true);
        binaryBox.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.binaryBox.text")); // NOI18N

        nGramsField.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.nGramsField.text")); // NOI18N

        minCharsField.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.minCharsField.text")); // NOI18N
        minCharsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minCharsFieldActionPerformed(evt);
            }
        });

        maxWordsField.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.maxWordsField.text")); // NOI18N
        maxWordsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxWordsFieldActionPerformed(evt);
            }
        });

        nGrams.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.nGrams.text")); // NOI18N

        numChars.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.numChars.text")); // NOI18N

        maxWords.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.maxWords.text")); // NOI18N

        binaryCounting.setLabelFor(binaryBox);
        binaryCounting.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.binaryCounting.text")); // NOI18N

        openStopWordsFile.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.openStopWordsFile.text")); // NOI18N
        openStopWordsFile.setToolTipText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.openStopWordsFile.toolTipText")); // NOI18N
        openStopWordsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openStopWordsFileActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel7.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel3.text")); // NOI18N

        minOccurrences.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.minOccurrences.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel4.text")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel5.text")); // NOI18N

        jLabel6.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel6.text")); // NOI18N

        jLabel8.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel8.text")); // NOI18N

        deleteChars.setBackground(new java.awt.Color(255, 255, 255));
        deleteChars.setSelected(true);
        deleteChars.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.deleteChars.text")); // NOI18N

        jLabel9.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel9.text")); // NOI18N

        useScientificStopWords.setBackground(new java.awt.Color(255, 255, 255));
        useScientificStopWords.setSelected(true);
        useScientificStopWords.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.useScientificStopWords.text")); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel10.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel10.text")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel11.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel11.text")); // NOI18N

        useAlchemyAPIButton.setBackground(new java.awt.Color(255, 255, 255));
        useAlchemyAPIButton.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.useAlchemyAPIButton.text")); // NOI18N
        useAlchemyAPIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useAlchemyAPIButtonActionPerformed(evt);
            }
        });

        selectCategoriesButton.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.selectCategoriesButton.text")); // NOI18N
        selectCategoriesButton.setEnabled(false);
        selectCategoriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCategoriesButtonActionPerformed(evt);
            }
        });

        jLabel1.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel1.text")); // NOI18N

        wordSeparator.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.wordSeparator.text")); // NOI18N
        wordSeparator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordSeparatorActionPerformed(evt);
            }
        });

        jLabel2.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.jLabel2.text")); // NOI18N

        useTDIDF.setBackground(new java.awt.Color(255, 255, 255));
        useTDIDF.setSelected(true);
        useTDIDF.setText(org.openide.util.NbBundle.getMessage(Screen2.class, "Screen2.useTDIDF.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(useAlchemyAPIButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(selectCategoriesButton))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(closeParameters))
                                .addComponent(openStopWordsFile)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(binaryCounting)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deleteChars)
                                        .addComponent(binaryBox)
                                        .addComponent(useTDIDF)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(numChars)
                                        .addComponent(maxWords)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nGrams))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nGramsField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(maxWordsField)
                                            .addComponent(minCharsField)
                                            .addComponent(minOccurrences)
                                            .addComponent(wordSeparator))
                                        .addComponent(useScientificStopWords, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(31, 31, 31))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useAlchemyAPIButton)
                    .addComponent(selectCategoriesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(useTDIDF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(deleteChars))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(binaryCounting)
                    .addComponent(binaryBox))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nGrams))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nGramsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numChars)
                    .addComponent(minCharsField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maxWordsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxWords))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(minOccurrences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wordSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(useScientificStopWords))
                .addGap(23, 23, 23)
                .addComponent(openStopWordsFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addComponent(closeParameters)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeParametersActionPerformed
        Screen1.screen1.setVisible(true);
        Screen1.screen2.setVisible(false);
    }//GEN-LAST:event_closeParametersActionPerformed

    private void minCharsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minCharsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minCharsFieldActionPerformed

    private void maxWordsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxWordsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxWordsFieldActionPerformed

    private void openStopWordsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openStopWordsFileActionPerformed
        if (evt.getSource() == openStopWordsFile) {
            System.out.println("openStopWordsFile clicked");


        }
        JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory(new java.io.File("D:\\Docs Pro Clement\\E-humanities\\TextMining\\Exported Items\\"));
        chooser.setDialogTitle("Select a file with stopwords (comma separated)");
        //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            fileSelectedPathANdName = chooser.getSelectedFile().toString();
            System.out.println("Selected File for Stopwords: " + fileSelectedPathANdName);
        } else {
            System.out.println("No Selection");
        }
    }//GEN-LAST:event_openStopWordsFileActionPerformed

    private void useAlchemyAPIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useAlchemyAPIButtonActionPerformed
        if (evt.getSource() == useAlchemyAPIButton) {
            selectCategoriesButton.setEnabled(useAlchemyAPIButton.isSelected());
        }
    }//GEN-LAST:event_useAlchemyAPIButtonActionPerformed

    private void selectCategoriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCategoriesButtonActionPerformed
        if (evt.getSource() == selectCategoriesButton) {
            Screen1.screen2.setVisible(false);
            Screen1.screen3.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_selectCategoriesButtonActionPerformed

    private void wordSeparatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordSeparatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordSeparatorActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox binaryBox;
    private javax.swing.JLabel binaryCounting;
    private javax.swing.JButton closeParameters;
    public static javax.swing.JCheckBox deleteChars;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maxWords;
    public static javax.swing.JTextField maxWordsField;
    public static javax.swing.JTextField minCharsField;
    public static javax.swing.JTextField minOccurrences;
    private javax.swing.JLabel nGrams;
    public static javax.swing.JTextField nGramsField;
    private javax.swing.JLabel numChars;
    private javax.swing.JButton openStopWordsFile;
    private javax.swing.JButton selectCategoriesButton;
    public javax.swing.JCheckBox useAlchemyAPIButton;
    public static javax.swing.JCheckBox useScientificStopWords;
    public static javax.swing.JCheckBox useTDIDF;
    public static javax.swing.JTextField wordSeparator;
    // End of variables declaration//GEN-END:variables
}
