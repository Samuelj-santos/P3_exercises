package Exercise_Seven.Question_01;

public class Paciente {

   private String codigo;
   private String nome ;
   private String dataNascimento ; 
   private String sexo ;
   private String planoSaude;
   private String alergia;
   private String tipoSanguineo;


   public Paciente(String codigo , String nome , String dataNascimento, String sexo, String planoSaude,String alergia,String tipoSanguineo){
    this.alergia = alergia;
    this.codigo = codigo;
    this.dataNascimento = dataNascimento;
    this.nome = nome;
    this.planoSaude = planoSaude;
    this.sexo = sexo;
    this.tipoSanguineo = tipoSanguineo;
   }

   public void setAlergia(String alergia){
    this.alergia = alergia;
   }
   public void setNome(String nome){
    this.nome = nome;
   }
   public void setdatanascimento(String dataNascimento){
    this.dataNascimento = dataNascimento;
   }
   public void setSexo(String sexo){
    this.sexo = sexo;

   }
   public void settiposanguineo(String tipoSanguineo){
    this.tipoSanguineo = tipoSanguineo;
   }


   public String  getCodigo(){
    return this.codigo;
   }
   public String getNome(){
    return this.nome;
   }
   public String getdataNascimento(){
    return this.dataNascimento;
   }
   public String getSexo(){
    return this.sexo;
   }
   public String getplanoSaude(){
    return this.planoSaude;
   }
   public String getAlergia(){
    return this.alergia;
   }
   public String gettipoSnaguineo(){
    return this.tipoSanguineo;
   }

   @Override

  public String toString(){
    return "codigo :" +this.codigo + "nome :" + this.nome  + "alergia :" + this.alergia + "data de nascimento :" + this.dataNascimento + "Plano de saude :" + this.planoSaude + "Sexo :" + this.planoSaude + "tipo sanguineo" + this.tipoSanguineo;
  }



}