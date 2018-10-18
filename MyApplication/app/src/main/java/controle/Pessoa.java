package controle;



import java.io.Serializable;

public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    //Dados do Entrevistado
     public Long _id;
 public Long telefone_entrevistado;
 public Long RG_titular;
 public Long CPF_titular;
 public Long RG_conjuge;
 public Long CPF_conjuge;
     public int numero_de_moradores, numero_de_proprietarios, numero_de_imoveis, numero_filhos, numero_pavimentos, numero_comodos, numero_banheiros;
     public String nome_entrevistado;
     public String endereco_entrevistado;
     public String sexo_entrevistado;
     public String condicao_ocupacao;
     public String posicao_entrevistado;
     public String utilizacao;
     public String unico_proprietario;
     public String outro_imovel;
     public String endereco_outros_imoveis;
     public String nome_titular;
     public String endereco_imovel;
     public String endereco_titular;
     public String profissao_titular;
     public String estado_civil;
     public String naturalidade_entrevistado;
     public String tempo_com_conjuge;
     public String conjuge_ajudou_construcao;
     public String data_nascimento_entrevistado;
     public String nome_conjuge;
     public String profissao_conjuge;
     public String naturalidade_conjuge;
     public String data_nascimento_conjuge;
     public String se_trabalha;
     public String formal_informal;
     public String principal_fonte_renda;
     public String renda_familiar;
     public String uso_imovel;
     public String tipologia;
     public String posicao_lote;
     public String estado_edificacao;
     public String tipo_construcao;
     public String serve_outras_familias;
     public String aquisicao_terreno;
     public String dono_terreno;
     public String portator_necessidades_especiais;
     public String beneficio_governo;
     public String beneficio_prog_hab;

     @Override
     public String toString(){
         return "Pessoa{"+
                 "_id=" + _id +
                 ", nome_entrevistado ='" + nome_entrevistado + '\'' +
                 ", endereco_entrevistado ='" + endereco_entrevistado + '\'' +
                 ", sexo_entrevistado ='" + sexo_entrevistado +'\'' +
                 ", condicao_ocupacao ='" + condicao_ocupacao + '\'' +
                 ", posicao_entrevistado ='" + posicao_entrevistado + '\'' +
                 ", utilizacao ='" + utilizacao + '\'' +
                 ", unico_proprietario ='" + unico_proprietario + '\'' +
                 ", outro_imovel ='" + outro_imovel + '\'' +
                 ", endereco_outros_imoveis ='" + endereco_outros_imoveis + '\'' +
                 ", nome_titular ='" + nome_titular + '\'' +
                 ", endereco_imovel ='" + endereco_imovel + '\'' +
                 ", endereco_titular ='" + endereco_titular + '\'' +
                 ", profissao_titular ='" + profissao_titular + '\'' +
                 ", estado_civil ='" + estado_civil + '\'' +
                 ", naturalidade_entrevistado ='" + naturalidade_entrevistado + '\'' +
                 ", tempo_com_conjuge ='" + tempo_com_conjuge + '\'' +
                 ", conjuge_ajudou_construcao ='" + conjuge_ajudou_construcao + '\'' +
                 ", data_nascimento_entrevistado ='" + data_nascimento_entrevistado + '\'' +
                 ", nome_conjuge ='" + nome_conjuge + '\'' +
                 ", profissao_conjuge ='" + profissao_conjuge + '\'' +
                 ", naturalidade_conjuge ='" + naturalidade_conjuge + '\'' +
                 ", data_nascimento_conjuge ='" + data_nascimento_conjuge + '\'' +
                 ", se_trabalha ='" + se_trabalha + '\'' +
                 ", formal_informal ='" + formal_informal + '\'' +
                 ", principal_fonte_renda ='" + principal_fonte_renda + '\'' +
                 ", renda_familiar ='" + renda_familiar + '\'' +
                 ", uso_imovel ='" + uso_imovel + '\'' +
                 ", tipologia ='" + tipologia + '\'' +
                 ", posicao_lote ='" + posicao_lote + '\'' +
                 ", estado_edificacao ='" + estado_edificacao + '\'' +
                 ", tipo_construcao ='" + tipo_construcao + '\'' +
                 ", serve_outras_familias ='" + serve_outras_familias + '\'' +
                 ", aquisicao_terreno ='" + aquisicao_terreno + '\'' +
                 ", dono_terreno ='" + dono_terreno + '\'' +
                 ", portator_necessidades_especiais ='" + portator_necessidades_especiais + '\'' +
                 ", beneficio_governo ='" + beneficio_governo+ '\'' +
                 ", beneficio_prog_hab ='" + beneficio_prog_hab + '\'' +
                 ", telefone_entrevistado ='" + telefone_entrevistado + '\'' +
                 ", RG_titular ='" + RG_titular + '\'' +
                 ", CPF_titular ='" + CPF_titular + '\'' +
                 ", RG_conjuge ='" + RG_conjuge + '\'' +
                 ", CPF_conjuge ='" +CPF_conjuge + '\'' +
                 ", numero_de_moradores ='" + numero_de_moradores + '\'' +
                 ", numero_de_proprietarios ='" + numero_de_proprietarios + '\'' +
                 ", numero_de_imoveis ='" + numero_de_imoveis + '\'' +
                 ", numero_filhos ='" + numero_filhos + '\'' +
                 ", numero_pavimentos ='" + numero_pavimentos + '\'' +
                 ", numero_comodos ='" + numero_comodos+ '\'' +
                 ", numero_banheiros ='" + numero_banheiros + '\'' +
                 '}';
     }

}
