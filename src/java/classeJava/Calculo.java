package classeJava;

public class Calculo {
    private String nome;
    private int numPacote, numModalidade;
    private float desconto, mensalidade = 80.00F;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPacote() {
        return numPacote;
    }

    public void setNumPacote(int numPacote) {
        this.numPacote = numPacote;
    }

    public int getNumModalidade() {
        return numModalidade;
    }

    public void setNumModalidade(int numModalidade) {
        this.numModalidade = numModalidade;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    // Identificar modalidade
    public Integer IdentificarModalidade() {        
        if (numPacote == 3)
            numModalidade = 4;
        else if (numPacote == 2)
            numModalidade = 3;            
        else if (numPacote == 1)
            numModalidade = 2;        
        return numModalidade;
    }
    
    // Caucular valor da mensalidade sem desconto
    public Float TotalMensalidade() {
        return (mensalidade * numModalidade);
    }
    
    // Caucular valor  desconto
    public Float CalculoDesconto() {
        if (numModalidade == 4)
            desconto = (mensalidade * numModalidade) * 40 / 100;
        else if (numModalidade == 3)
            desconto = (mensalidade * numModalidade) * 30 / 100;
        else if (numModalidade == 2)
            desconto = (mensalidade * numModalidade) * 20 / 100;
        return desconto;
    }
    
    // Caucular valor da mensalidade com desconto
    public Float TotalComDesconto() {
        return TotalMensalidade() - desconto;
    }
    
    public String Resposta(String resposta) {
        if (numModalidade == 4)
            resposta = "Musculação + Futebol + Natação + Ciclismo.";
        else if (numModalidade == 3)
            resposta = "Musculação + Futebol + Natação.";
        else if (numModalidade == 2)
            resposta = "Musculação + Futebol.";
        else
            resposta = "";
        return resposta;
    }
}
