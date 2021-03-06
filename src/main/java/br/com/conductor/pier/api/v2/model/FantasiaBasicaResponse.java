package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Representa\u00E7\u00E3o da resposta do recurso de operadora telef\u00F4nica
 **/

@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de operadora telef\u00F4nica")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class FantasiaBasicaResponse   {
  
  private Long id = null;
  private String nome = null;
  private String descricao = null;
  private String descricaoArquivo = null;
  private Integer quantidadeMaxProposta = null;

  
  /**
   * Identificador da fantasia b\u00E1sica
   **/
  public FantasiaBasicaResponse id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identificador da fantasia b\u00E1sica")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome da fantasia b\u00E1sica
   **/
  public FantasiaBasicaResponse nome(String nome) {
    this.nome = nome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome da fantasia b\u00E1sica")
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00E7\u00E3o da fantasia b\u00E1sica
   **/
  public FantasiaBasicaResponse descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o da fantasia b\u00E1sica")
  @JsonProperty("descricao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Descri\u00E7\u00E3o do arquivo da fantasia b\u00E1sica
   **/
  public FantasiaBasicaResponse descricaoArquivo(String descricaoArquivo) {
    this.descricaoArquivo = descricaoArquivo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Descri\u00E7\u00E3o do arquivo da fantasia b\u00E1sica")
  @JsonProperty("descricaoArquivo")
  public String getDescricaoArquivo() {
    return descricaoArquivo;
  }
  public void setDescricaoArquivo(String descricaoArquivo) {
    this.descricaoArquivo = descricaoArquivo;
  }

  
  /**
   * Quantidade m\u00E1xima de propostas da fantasia b\u00E1sica
   **/
  public FantasiaBasicaResponse quantidadeMaxProposta(Integer quantidadeMaxProposta) {
    this.quantidadeMaxProposta = quantidadeMaxProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantidade m\u00E1xima de propostas da fantasia b\u00E1sica")
  @JsonProperty("quantidadeMaxProposta")
  public Integer getQuantidadeMaxProposta() {
    return quantidadeMaxProposta;
  }
  public void setQuantidadeMaxProposta(Integer quantidadeMaxProposta) {
    this.quantidadeMaxProposta = quantidadeMaxProposta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FantasiaBasicaResponse fantasiaBasicaResponse = (FantasiaBasicaResponse) o;
    return Objects.equals(this.id, fantasiaBasicaResponse.id) &&
        Objects.equals(this.nome, fantasiaBasicaResponse.nome) &&
        Objects.equals(this.descricao, fantasiaBasicaResponse.descricao) &&
        Objects.equals(this.descricaoArquivo, fantasiaBasicaResponse.descricaoArquivo) &&
        Objects.equals(this.quantidadeMaxProposta, fantasiaBasicaResponse.quantidadeMaxProposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descricao, descricaoArquivo, quantidadeMaxProposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FantasiaBasicaResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    descricaoArquivo: ").append(toIndentedString(descricaoArquivo)).append("\n");
    sb.append("    quantidadeMaxProposta: ").append(toIndentedString(quantidadeMaxProposta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

