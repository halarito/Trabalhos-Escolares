package Testes;

public class metros {
        public static void main(String[] args){
            
        String nome = "Halar1967";
        StringBuffer newStr = new StringBuffer(nome);
        
        for(int i = 0; i < nome.length(); i++){
            if(Character.isDigit(nome.charAt(i))){
                //newStr.setCharAt(i, Character.toUpperCase(nome.charAt(i)));
                System.out.println(nome.charAt(i));
            }
            /*if(Character.isUpperCase(nome.charAt(i))){
                newStr.setCharAt(i, Character.toLowerCase(nome.charAt(i)));
            }*/
        }
        //System.out.println(newStr);
        }
        }
