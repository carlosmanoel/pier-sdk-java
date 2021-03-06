package br.com.conductor.pier.api.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Classe de representa\u00E7\u00E3o dos par\u00E2metros utilizados por um persist
 **/

@ApiModel(description = "Classe de representa\u00E7\u00E3o dos par\u00E2metros utilizados por um persist")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class DocumentoPropostaPersist   {
  
  private Long idProposta = null;
  private Long idDocumentosCredito = null;
  private Long idStatusDocumentosCredito = null;
  private Long idCondicoesDocumentosCredito = null;
  private Long idTipoDocumentoCredito = null;
  private Long idPessoaFisica = null;
  private Long idLogAtendimento = null;
  private String responsavel = null;
  private Integer flagDocumentoDigitalizado = null;
  private String documentoDigitalizado = null;
  private Long seqAnaliseCondicao = null;
  private String observacao = null;
  private String dataStatus = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da proposta(id)
   **/
  public DocumentoPropostaPersist idProposta(Long idProposta) {
    this.idProposta = idProposta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o da proposta(id)")
  @JsonProperty("idProposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o para o tipo do documento
   **/
  public DocumentoPropostaPersist idDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o para o tipo do documento")
  @JsonProperty("idDocumentosCredito")
  public Long getIdDocumentosCredito() {
    return idDocumentosCredito;
  }
  public void setIdDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Status do documento cr\u00E9dito
   **/
  public DocumentoPropostaPersist idStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o do Status do documento cr\u00E9dito")
  @JsonProperty("idStatusDocumentosCredito")
  public Long getIdStatusDocumentosCredito() {
    return idStatusDocumentosCredito;
  }
  public void setIdStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da condi\u00E7\u00E3o do documento cr\u00E9dito
   **/
  public DocumentoPropostaPersist idCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da condi\u00E7\u00E3o do documento cr\u00E9dito")
  @JsonProperty("idCondicoesDocumentosCredito")
  public Long getIdCondicoesDocumentosCredito() {
    return idCondicoesDocumentosCredito;
  }
  public void setIdCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo do documento cr\u00E9dito
   **/
  public DocumentoPropostaPersist idTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo do documento cr\u00E9dito")
  @JsonProperty("idTipoDocumentoCredito")
  public Long getIdTipoDocumentoCredito() {
    return idTipoDocumentoCredito;
  }
  public void setIdTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da pessoa f\u00EDsica
   **/
  public DocumentoPropostaPersist idPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o da pessoa f\u00EDsica")
  @JsonProperty("idPessoaFisica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Log de Atendimento
   **/
  public DocumentoPropostaPersist idLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de identifica\u00E7\u00E3o do Log de Atendimento")
  @JsonProperty("idLogAtendimento")
  public Long getIdLogAtendimento() {
    return idLogAtendimento;
  }
  public void setIdLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
  }

  
  /**
   * Respons\u00E1vel
   **/
  public DocumentoPropostaPersist responsavel(String responsavel) {
    this.responsavel = responsavel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Respons\u00E1vel")
  @JsonProperty("responsavel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Indica se o documento ser\u00E1 digitalizado
   **/
  public DocumentoPropostaPersist flagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indica se o documento ser\u00E1 digitalizado")
  @JsonProperty("flagDocumentoDigitalizado")
  public Integer getFlagDocumentoDigitalizado() {
    return flagDocumentoDigitalizado;
  }
  public void setFlagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
  }

  
  /**
   * Nome do documento digitalizado
   **/
  public DocumentoPropostaPersist documentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nome do documento digitalizado")
  @JsonProperty("documentoDigitalizado")
  public String getDocumentoDigitalizado() {
    return documentoDigitalizado;
  }
  public void setDocumentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
  }

  
  /**
   * C\u00F3digo de sequ\u00EAncia de analise de condi\u00E7\u00E3o
   **/
  public DocumentoPropostaPersist seqAnaliseCondicao(Long seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "C\u00F3digo de sequ\u00EAncia de analise de condi\u00E7\u00E3o")
  @JsonProperty("seqAnaliseCondicao")
  public Long getSeqAnaliseCondicao() {
    return seqAnaliseCondicao;
  }
  public void setSeqAnaliseCondicao(Long seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
  }

  
  /**
   * Observa\u00E7\u00E3o
   **/
  public DocumentoPropostaPersist observacao(String observacao) {
    this.observacao = observacao;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Observa\u00E7\u00E3o")
  @JsonProperty("observacao")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Data de status
   **/
  public DocumentoPropostaPersist dataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Data de status")
  @JsonProperty("dataStatus")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoPropostaPersist documentoPropostaPersist = (DocumentoPropostaPersist) o;
    return Objects.equals(this.idProposta, documentoPropostaPersist.idProposta) &&
        Objects.equals(this.idDocumentosCredito, documentoPropostaPersist.idDocumentosCredito) &&
        Objects.equals(this.idStatusDocumentosCredito, documentoPropostaPersist.idStatusDocumentosCredito) &&
        Objects.equals(this.idCondicoesDocumentosCredito, documentoPropostaPersist.idCondicoesDocumentosCredito) &&
        Objects.equals(this.idTipoDocumentoCredito, documentoPropostaPersist.idTipoDocumentoCredito) &&
        Objects.equals(this.idPessoaFisica, documentoPropostaPersist.idPessoaFisica) &&
        Objects.equals(this.idLogAtendimento, documentoPropostaPersist.idLogAtendimento) &&
        Objects.equals(this.responsavel, documentoPropostaPersist.responsavel) &&
        Objects.equals(this.flagDocumentoDigitalizado, documentoPropostaPersist.flagDocumentoDigitalizado) &&
        Objects.equals(this.documentoDigitalizado, documentoPropostaPersist.documentoDigitalizado) &&
        Objects.equals(this.seqAnaliseCondicao, documentoPropostaPersist.seqAnaliseCondicao) &&
        Objects.equals(this.observacao, documentoPropostaPersist.observacao) &&
        Objects.equals(this.dataStatus, documentoPropostaPersist.dataStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProposta, idDocumentosCredito, idStatusDocumentosCredito, idCondicoesDocumentosCredito, idTipoDocumentoCredito, idPessoaFisica, idLogAtendimento, responsavel, flagDocumentoDigitalizado, documentoDigitalizado, seqAnaliseCondicao, observacao, dataStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoPropostaPersist {\n");
    
    sb.append("    idProposta: ").append(toIndentedString(idProposta)).append("\n");
    sb.append("    idDocumentosCredito: ").append(toIndentedString(idDocumentosCredito)).append("\n");
    sb.append("    idStatusDocumentosCredito: ").append(toIndentedString(idStatusDocumentosCredito)).append("\n");
    sb.append("    idCondicoesDocumentosCredito: ").append(toIndentedString(idCondicoesDocumentosCredito)).append("\n");
    sb.append("    idTipoDocumentoCredito: ").append(toIndentedString(idTipoDocumentoCredito)).append("\n");
    sb.append("    idPessoaFisica: ").append(toIndentedString(idPessoaFisica)).append("\n");
    sb.append("    idLogAtendimento: ").append(toIndentedString(idLogAtendimento)).append("\n");
    sb.append("    responsavel: ").append(toIndentedString(responsavel)).append("\n");
    sb.append("    flagDocumentoDigitalizado: ").append(toIndentedString(flagDocumentoDigitalizado)).append("\n");
    sb.append("    documentoDigitalizado: ").append(toIndentedString(documentoDigitalizado)).append("\n");
    sb.append("    seqAnaliseCondicao: ").append(toIndentedString(seqAnaliseCondicao)).append("\n");
    sb.append("    observacao: ").append(toIndentedString(observacao)).append("\n");
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
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

