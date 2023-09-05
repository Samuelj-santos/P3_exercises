package Exercise_Seven.Question_02;

public class Medico {
  private int codigo;
  private String nome ;
  private String sexo;
  private String especialidade;
  private Endereço endereço;

  public void setCodigo(int codigo) {
    this.codigo = codigo;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
}

public void setEndereço(Endereço endereço) {
    this.endereço = endereço;
}

public int getCodigo() {
    return codigo;
}

public String getNome() {
    return nome;
}

public String getSexo() {
    return sexo;
}

public String getEspecialidade() {
    return especialidade;
}

public Endereço getEndereço() {
    return endereço;
}

public Medico(int codigo, String nome,String especialidade,Endereço endereço,String sexo){
   this.codigo = codigo;
   this.endereço = endereço;
   this.especialidade = especialidade;
   this.nome = nome;
   this.sexo = sexo;
  }


}
