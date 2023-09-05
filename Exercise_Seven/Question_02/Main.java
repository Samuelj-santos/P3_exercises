package Exercise_Seven.Question_02;

public class Main {
    public static void main(String[] args) {
        Endereço one  = new Endereço("bandeirantes", 34, "Perto do mercadinho de seu zé", "limoeiro", "Ponte Amarela", "PY", 5000800);
        Medico vinicius = new Medico(011, "Vinicius", "Neurologista", one, "Masculino");
        
        System.out.println(one.getBairro());
        System.out.println(one.getCep());
        System.out.println(one.getCidade());
        System.out.println(one.getComplemento());
        System.out.println(one.getNumero());
        System.out.println(one.getRua());
        System.out.println(one.getUf());
        System.out.println(vinicius.getCodigo());
        System.out.println(vinicius.getEspecialidade());
        System.out.println(vinicius.getNome());
        System.out.println(vinicius.getSexo());
        
        one.setBairro("baixadinha");
        one.setCep(54);
        one.setCidade("Gorvernador Andre");
        one.setComplemento("perto do restaurante belo sabor");
        one.setNumero(56);
        one.setRua("Doutor Afonso");
        one.setUf("PW");
        vinicius.setCodigo(013);
        vinicius.setEndereço(one);
        vinicius.setEspecialidade("Proctologista");
        vinicius.setNome("Maria");
        vinicius.setSexo("Feminino");

         System.out.println(one.getBairro());
        System.out.println(one.getCep());
        System.out.println(one.getCidade());
        System.out.println(one.getComplemento());
        System.out.println(one.getNumero());
        System.out.println(one.getRua());
        System.out.println(one.getUf());
        System.out.println(vinicius.getCodigo());
        System.out.println(vinicius.getEspecialidade());
        System.out.println(vinicius.getNome());
        System.out.println(vinicius.getSexo());
    }
}
