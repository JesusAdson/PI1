
package Modularizacao;

public class PI1_modulo {
    
    private Integer codigo;
    private String descricao_produto;
    private Double preco_custo;
    private Double preco_venda;
    private Double desconto;
    private String fornecedor;
    private String marca;
    private String grupo;
    private Double lucro;
    
    public PI1_modulo(){
        
    }
    
    
    public PI1_modulo(int codigo, String descricao_produto, double preco_custo, double preco_venda, 
            double desconto, String fornecedor, String marca, String grupo){
        this.codigo = codigo;
        this.descricao_produto = descricao_produto;
        this.preco_custo = preco_custo;
        this.preco_venda = preco_venda;
        this.desconto = desconto;
        this.fornecedor = fornecedor;
        this.marca = marca;
        this.grupo = grupo;
        this.lucro = preco_venda - preco_custo;
    }
    
    public String fornecedor(){
        return this.fornecedor;
    }
    
    public String nome_produto(){
        return this.descricao_produto;
    }
    
    public double preco_desconto(){
        return this.preco_venda - this.desconto;
    }
    
    public double preco_venda(){
        return this.getPreco_venda();
    }
    
    public String toString(){
        return "Codigo: " + this.getCodigo() + "\n" + "Descricao do Produto: " + this.getDescricao_produto()
                + "\n" + "Preco de Custo: " + this.getPreco_custo() + "\n" + "Preco de venda: " + this.getPreco_venda()
                + "\n" + "Desconto: " + this.getDesconto() + "\n" + "Fornecedor: " + this.getFornecedor()
                + "\n" + "Marca: " + this.getMarca() + "\n" + "Grupo: " + this.getGrupo() + "\n" + "Lucro: " + this.getLucro();
    }

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descricao_produto
     */
    public String getDescricao_produto() {
        return descricao_produto;
    }

    /**
     * @param descricao_produto the descricao_produto to set
     */
    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    /**
     * @return the preco_custo
     */
    public Double getPreco_custo() {
        return preco_custo;
    }

    /**
     * @param preco_custo the preco_custo to set
     */
    public void setPreco_custo(Double preco_custo) {
        this.preco_custo = preco_custo;
    }

    /**
     * @return the preco_venda
     */
    public Double getPreco_venda() {
        return preco_venda;
    }

    /**
     * @param preco_venda the preco_venda to set
     */
    public void setPreco_venda(Double preco_venda) {
        this.preco_venda = preco_venda;
    }

    /**
     * @return the desconto
     */
    public Double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the lucro
     */
    public Double getLucro() {
        return lucro;
    }

    /**
     * @param lucro the lucro to set
     */
    public void setLucro(Double lucro) {
        this.lucro = lucro;
    }
    
}
