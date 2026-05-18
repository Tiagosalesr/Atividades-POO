package Singleton;

public class Projeto {

    private static int contadorId = 1;

    private final int id;
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String status;
    private final Empresa empresa;

    public Projeto(String nome, String descricao, String dataInicio, String dataFim, String status) {
        this.id         = contadorId++;
        this.nome       = nome;
        this.descricao  = descricao;
        this.dataInicio = dataInicio;
        this.dataFim    = dataFim;
        this.status     = status;
        this.empresa    = Empresa.getInstancia();
    }

    public int    getId()         { return id; }
    public String getNome()       { return nome; }
    public String getDescricao()  { return descricao; }
    public String getDataInicio() { return dataInicio; }
    public String getDataFim()    { return dataFim; }
    public String getStatus()     { return status; }
    public Empresa getEmpresa()   { return empresa; }

    public void setNome(String nome)             { this.nome = nome; }
    public void setDescricao(String descricao)   { this.descricao = descricao; }
    public void setDataInicio(String dataInicio) { this.dataInicio = dataInicio; }
    public void setDataFim(String dataFim)       { this.dataFim = dataFim; }
    public void setStatus(String status)         { this.status = status; }

    @Override
    public String toString() {
        return "Projeto{"
                + "id="          + id
                + ", nome='"     + nome      + '\''
                + ", descricao='" + descricao + '\''
                + ", dataInicio='" + dataInicio + '\''
                + ", dataFim='"  + dataFim   + '\''
                + ", status='"   + status    + '\''
                + ", empresa='"  + empresa.getNome() + '\''
                + '}';
    }
}
