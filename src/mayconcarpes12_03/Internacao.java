/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mayconcarpes12_03;

/**
 *
 * @author 36649863858
 */
public class Internacao extends Pessoa{
    private Medico objMedico;
    private Enfermeiro objEnfermeiro;
    private Paciente objPaciente; 
    private static int id; 
    private int cont; 
    private String  motivo; 
    private double valor,total; 
    
    public Medico getObjMedico() {
        return objMedico;
    }

    public void setObjMedico(Medico objMedico) {
        this.objMedico = objMedico;
    }

    public Enfermeiro getObjEnfermeiro() {
        return objEnfermeiro;
    }

    public void setObjEnfermeiro(Enfermeiro objEnfermeiro) {
        this.objEnfermeiro = objEnfermeiro;
    }

    public Paciente getObjPaciente() {
        return objPaciente;
    }

    public void setObjPaciente(Paciente objPaciente) {
        this.objPaciente = objPaciente;
    }

    public int getId() {
        return id;
    }

  
   


    public Internacao(Medico objMedico, Enfermeiro objEnfermeiro, Paciente objPaciente, int cont, String motivo, double valor, double total, String nome, String cpf) {
        super(nome, cpf);
        this.objMedico = objMedico;
        this.objEnfermeiro = objEnfermeiro;
        this.objPaciente = objPaciente;
        this.cont = cont;
        this.motivo = motivo;
        this.valor = valor;
        this.total = total;
    }

    

  public double ValorDiaria(double dia){
    return this.valor = 150 * this.cont; // método com passagem de parâmetro
  }
          
          
}
