import java.util.Stack;

// Classe escavação é a responsável por armazenar e trar do "material coletado", ou seja, da string que será digitada
public class Escavacao {
    private String materialEscavado;
    private Stack<String> diamantesParciais;
    private int diamantes;

    // Definindo construtor para a classe
    public Escavacao(String coletado) {
        materialEscavado = coletado;
        diamantesParciais = new Stack<>();
    }

    public int getDiamantes() {
        return diamantes;
    }

    // Nessa método percorre-se a String passada, procurando os "pedaços" de diamantes ("<" e ">"). Caso encontre a parte
    // esquerda do diamante ("<") adiciona na Stack. Caso encontre a parte da direita do diamante (">"), e a Stack NÃO
    // esteja vazia, retira o último elemento da Stack e adiciona um diamante ao atributo "diamantes".

    public void procuraDiamantes() {
        for (int i = 0; i < materialEscavado.length(); i++) {
            String letra = "" + materialEscavado.charAt(i);

            if(letra.equals("<")) {
                diamantesParciais.push(letra);
            }
            if(letra.equals(">") && (!diamantesParciais.isEmpty())) {
                diamantesParciais.pop();
                diamantes++;
            }
        }
    }
}
