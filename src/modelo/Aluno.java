package modelo;
import java.text.DateFormat;
import java.text.DecimalFormat;

public class Aluno extends Pessoa{
    
    private double nota1;
    private double nota2;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    @Override
    public String toString() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        DecimalFormat dfm = new DecimalFormat(",##0.00");
        String dataFormatada = null;
        if (getDataNascimento() != null){
            dataFormatada = df.format(getDataNascimento());
        }
        
        return "Aluno" + "\n" + 
                "Nome: " + getNome() + "\n" +
                "Endere�o: " + getEndereco() + "\n" +
                "Data de Nascimento: " + dataFormatada + "\n" +
                "Nota 1:  " + dfm.format(nota1) + "\n" + 
                "Nota 2: " + dfm.format(nota2) + "\n" +
                "Media: " + dfm.format(calcularMedia()) + "\n";
    }
    
    
    
}
