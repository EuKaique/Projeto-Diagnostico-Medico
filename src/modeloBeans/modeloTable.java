//Autor do Software Kaique Oliveira
package ModeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;



public class modeloTable extends AbstractTableModel {

    
    
    public ArrayList getLinha() {
        return linha;
    }

    
    
    public void setLinha(ArrayList linha) {
        this.linha = linha;
    }

    
    public String[] getColuna() {
        return coluna;
    }

    
    
    public void setColuna(String[] coluna) {
        this.coluna = coluna;
    }
    public int getColumnCount(){
        return coluna.length;
    }
    public int getRowCount(){
        return linha.size();
    }
    public String getColumnName(int numCol){
        return coluna[numCol];
    }
    public Object getValueAt(int numLin, int numCol){
        Object[] linhas = (Object[])getLinha().get(numLin);
        return linhas[numCol];
    }
    
    private ArrayList linha = null;
    private String[] coluna = null;



public  modeloTable(ArrayList Lin, String[] Col){
   setLinha(Lin);
   setColuna(Col); 
   }
}
