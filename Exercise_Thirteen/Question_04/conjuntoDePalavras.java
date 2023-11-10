package Exercise_Thirteen.Question_04;

import java.util.HashSet;

public class conjuntoDePalavras {
       private String palavras;
        private HashSet<String> lista ;

    public conjuntoDePalavras(String palavras) {
        this.palavras = palavras;
        lista = new HashSet<String>();
        lista.add(palavras);
    }


    public boolean contemTodas(String palavras ){
      String[] palavraslista = new String[lista.size()];
      lista.toArray(palavraslista);
      palavraslista = palavraslista[0].split(",");
      String[] palavraslist = palavras.split(",");
       boolean isTrue = true;
      for(int i =0; i<palavraslist.length;i++){
        if (isTrue == false) {
           return false; 
        }
        else if (palavraslist[i].equals(palavraslista[i])){ 
            isTrue = true;
        }else{
            isTrue = false;
        }
      }
      return isTrue;
    }

}
