package com.example.furg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import controle.Login;
import controle.Pessoa;
import openHelper.PessoaDB;

public class Cadastrar extends AppCompatActivity {

    Button cadastroSocioeconomico, cancelar;
    private PessoaDB pessoaDB;
    private Pessoa pessoa;
    private static String TAG = "pessoa_TAG";

    private EditText NomeEntrevistado, EnderecoEntrevistado,TelefoneEntrevistado,NomeTitular,DataNascimentoTitular,CPFTitular,IDTTitular,NomeConjuge,DataNascimentoConjuge,CPFConjuge,IDTConjuge,ProfissaoTitular,ProfissaoConjuge,NaturalidadeTitular,NaturalidadeConjuge,EnderecoImovel,EnderecoTitular,EnderecoOutroImovel,TempodeConjuge,PrincipalFonteRenda,NumeroFilhos,NumeroMoradores,NumeroProprietarios,NumeroImoveis,NumeroComodos,NumeroPavimentos,NumeroBanheiro;

    //private RadioButton Sexo,PosicaoEntrevistado,EstadoCivil,Utilizacao,Condicao,UnicoProprietario,OutrosImoveis,ConjugeAjudou,SeTrabalha,FormalInformal,ServeOutrasFamilias,PortadorNecessidadesEspeciais,RendaFamiliar,Tipologia,EstadoImovel,TipoImovel,PosicaoImovel,AquisicaoImovel,ProprietarioTerreno;

    private RadioGroup radioGroupSexo, radioGroupPosicaoEntrevistado, radioGroupEstadoCivil,radioGroupUtilizacao,radioGroupCondicao,radioGroupUnicoProprietario,radioGroupOutrosImoveis,radioGroupConjugeAjudou,radioGroupSeTrabalha,radioGroupFormalInformal,radioGroupServeOutrasFamilias,radioGroupPortadorNecessidadesEspeciais,radioGroupRendaFamiliar,radioGroupTipologia,radioGroupEstadoImovel,radioGroupTipoImovel,radioGroupPosicaoImovel,radioGroupAquisicaoImovel,radioGroupProprietarioTerreno;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
        pessoa = new Pessoa();
        pessoaDB = PessoaDB.getInstance(this);

        NomeEntrevistado = (EditText) findViewById(R.id.eTNomeEntrevistado);
        EnderecoEntrevistado = (EditText) findViewById(R.id.eTEnderecoEntrevistado);
        TelefoneEntrevistado = (EditText) findViewById(R.id.eTTelefoneEntrevistado);
        NomeTitular = (EditText) findViewById(R.id.eTNomeTitular);
        DataNascimentoTitular = (EditText) findViewById(R.id.eTDataNascimentoTitular);
        CPFTitular = (EditText) findViewById(R.id.eTCPFTitular);
        IDTTitular = (EditText) findViewById(R.id.eTIDTTitular);
        NomeConjuge = (EditText) findViewById(R.id.eTNomeConjuge);
        DataNascimentoConjuge = (EditText) findViewById(R.id.eTDataNascimentoConjuge);
        CPFConjuge = (EditText) findViewById(R.id.eTCPFConjuge);
        IDTConjuge = (EditText) findViewById(R.id.eTIDTConjuge);
        ProfissaoTitular = (EditText) findViewById(R.id.eTProfissaoTitular);
        ProfissaoConjuge = (EditText) findViewById(R.id.eTProfissaoConjuge);
        NaturalidadeTitular = (EditText) findViewById(R.id.eTNaturalidadeTitular);
        NaturalidadeConjuge = (EditText) findViewById(R.id.eTNaturalidadeConjuge);
        EnderecoImovel = (EditText) findViewById(R.id.eTEnderecoImovel);
        EnderecoTitular = (EditText) findViewById(R.id.eTEnderecoTitular);
        EnderecoOutroImovel = (EditText) findViewById(R.id.eTEnderecoOutroImovel);
        TempodeConjuge = (EditText) findViewById(R.id.eTTempodeConjuge);
        PrincipalFonteRenda = (EditText) findViewById(R.id.eTPrincipalFonteRenda);
        NumeroFilhos = (EditText) findViewById(R.id.eTNumeroFilhos);
        NumeroMoradores = (EditText) findViewById(R.id.eTNumeroMoradores);
        NumeroProprietarios = (EditText) findViewById(R.id.eTNumeroProprietarios);
        NumeroImoveis = (EditText) findViewById(R.id.eTNumeroImoveis);
        NumeroComodos = (EditText) findViewById(R.id.eTNumeroComodos);
        NumeroPavimentos = (EditText) findViewById(R.id.eTNumeroPavimentos);
        NumeroBanheiro = (EditText) findViewById(R.id.eTNumeroBanheiro);
        radioGroupSexo = (RadioGroup) findViewById(R.id.radioGroupSexo);
        radioGroupPosicaoEntrevistado = (RadioGroup) findViewById(R.id.radioGroupPosicaoEntrevistado);
        radioGroupEstadoCivil = (RadioGroup) findViewById(R.id.radioGroupEstadoCivil);
        radioGroupUtilizacao = (RadioGroup) findViewById(R.id.radioGroupUtilizacao);
        radioGroupCondicao = (RadioGroup) findViewById(R.id.radioGroupCondicao);
        radioGroupUnicoProprietario = (RadioGroup) findViewById(R.id.radioGroupUnicoProprietario);
        radioGroupOutrosImoveis = (RadioGroup) findViewById(R.id.radioGroupOutrosImoveis);
        radioGroupConjugeAjudou = (RadioGroup) findViewById(R.id.radioGroupConjugeAjudou);
        radioGroupSeTrabalha = (RadioGroup) findViewById(R.id.radioGroupSeTrabalha);
        radioGroupFormalInformal = (RadioGroup) findViewById(R.id.radioGroupFormalInformal);
        radioGroupServeOutrasFamilias = (RadioGroup) findViewById(R.id.radioGroupServeOutrasFamilias);
        radioGroupPortadorNecessidadesEspeciais = (RadioGroup) findViewById(R.id.radioGroupPortadorNecessidadesEspeciais);
        radioGroupRendaFamiliar = (RadioGroup) findViewById(R.id.radioGroupRendaFamiliar);
        radioGroupTipologia = (RadioGroup) findViewById(R.id.radioGroupTipologia);
        radioGroupEstadoImovel = (RadioGroup) findViewById(R.id.radioGroupEstadoImovel);
        radioGroupTipoImovel = (RadioGroup) findViewById(R.id.radioGroupTipoImovel);
        radioGroupPosicaoImovel = (RadioGroup) findViewById(R.id.radioGroupPosicaoImovel);
        radioGroupAquisicaoImovel = (RadioGroup) findViewById(R.id.radioGroupAquisicaoImovel);
        radioGroupProprietarioTerreno = (RadioGroup) findViewById(R.id.radioGroupProprietarioTerreno);



        cadastroSocioeconomico = (Button) findViewById(R.id.btnCadastroSocioeconomico);

        cadastroSocioeconomico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (pessoa._id ==null){
                    pessoa = new Pessoa();
                }

                if(!NomeEntrevistado.getText().toString().isEmpty() && !EnderecoEntrevistado.getText().toString().isEmpty() && !TelefoneEntrevistado.getText().toString().isEmpty() && !NomeTitular.getText().toString().isEmpty() && !DataNascimentoTitular.getText().toString().isEmpty() && !CPFTitular.getText().toString().isEmpty() && !IDTTitular.getText().toString().isEmpty() && !NomeConjuge.getText().toString().isEmpty() && !DataNascimentoConjuge.getText().toString().isEmpty() && !CPFConjuge.getText().toString().isEmpty() && !IDTConjuge.getText().toString().isEmpty() && !ProfissaoTitular.getText().toString().isEmpty() && !ProfissaoConjuge.getText().toString().isEmpty() && !NaturalidadeTitular.getText().toString().isEmpty() && !NaturalidadeConjuge.getText().toString().isEmpty() && !EnderecoImovel.getText().toString().isEmpty() && !EnderecoTitular.getText().toString().isEmpty() && !EnderecoOutroImovel.getText().toString().isEmpty() && !TempodeConjuge.getText().toString().isEmpty() && !PrincipalFonteRenda.getText().toString().isEmpty() && !NumeroFilhos.getText().toString().isEmpty() && !NumeroMoradores.getText().toString().isEmpty() && !NumeroProprietarios.getText().toString().isEmpty() && !NumeroImoveis.getText().toString().isEmpty() && !NumeroComodos.getText().toString().isEmpty() && !NumeroPavimentos.getText().toString().isEmpty() && !NumeroBanheiro.getText().toString().isEmpty()){

                    pessoa.nome_entrevistado = NomeEntrevistado.getText().toString();
                    pessoa.endereco_entrevistado = EnderecoEntrevistado.getText().toString();
                    pessoa.telefone_entrevistado = Long.valueOf(TelefoneEntrevistado.getText().toString());
                    pessoa.nome_titular = NomeTitular.getText().toString();
                    pessoa.data_nascimento_entrevistado = DataNascimentoTitular.getText().toString();
                    pessoa.CPF_titular = Long.valueOf(CPFTitular.getText().toString());
                    pessoa.RG_titular = Long.valueOf(IDTTitular.getText().toString());
                    pessoa.nome_conjuge = NomeConjuge.getText().toString();
                    pessoa.data_nascimento_conjuge = DataNascimentoConjuge.getText().toString();
                    pessoa.CPF_conjuge = Long.valueOf(CPFConjuge.getText().toString());
                    pessoa.RG_conjuge = Long.valueOf(IDTConjuge.getText().toString());
                    pessoa.profissao_titular = ProfissaoTitular.getText().toString();
                    pessoa.profissao_conjuge = ProfissaoConjuge.getText().toString();
                    pessoa.naturalidade_entrevistado = NaturalidadeTitular.getText().toString();
                    pessoa.naturalidade_conjuge = NaturalidadeConjuge.getText().toString();
                    pessoa.endereco_imovel = EnderecoImovel.getText().toString();
                    pessoa.endereco_titular = EnderecoTitular.getText().toString();
                    pessoa.endereco_outros_imoveis = EnderecoOutroImovel.getText().toString();
                    pessoa.tempo_com_conjuge = TempodeConjuge.getText().toString();
                    pessoa.principal_fonte_renda = PrincipalFonteRenda.getText().toString();
                    pessoa.numero_filhos = Integer.parseInt(NumeroFilhos.getText().toString());
                    pessoa.numero_de_moradores = Integer.parseInt(NumeroMoradores.getText().toString());
                    pessoa.numero_de_proprietarios = Integer.parseInt(NumeroProprietarios.getText().toString());
                    pessoa.numero_de_imoveis = Integer.parseInt(NumeroImoveis.getText().toString());
                    pessoa.numero_comodos = Integer.parseInt(NumeroComodos.getText().toString());
                    pessoa.numero_pavimentos = Integer.parseInt(NumeroPavimentos.getText().toString());
                    pessoa.numero_banheiros = Integer.parseInt(NumeroBanheiro.getText().toString());

                    Log.d(TAG, "Entrevistado que será salvo: " +pessoa.toString());

                }else {
                    alerta("Preencha todos os campos!");
                }
                NomeEntrevistado.setText("");EnderecoEntrevistado.setText("");TelefoneEntrevistado.setText("");NomeTitular.setText("");DataNascimentoTitular.setText("");CPFTitular.setText("");IDTTitular.setText("");NomeConjuge.setText("");DataNascimentoConjuge.setText("");CPFConjuge.setText("");IDTConjuge.setText("");ProfissaoTitular.setText("");ProfissaoConjuge.setText("");NaturalidadeTitular.setText("");NaturalidadeConjuge.setText("");EnderecoImovel.setText("");EnderecoTitular.setText("");EnderecoOutroImovel.setText("");TempodeConjuge.setText("");PrincipalFonteRenda.setText("");NumeroFilhos.setText("");NumeroMoradores.setText("");NumeroProprietarios.setText("");NumeroImoveis.setText("");NumeroImoveis.setText("");NumeroComodos.setText("");NumeroPavimentos.setText("");NumeroBanheiro.setText("");

                radioGroupSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if(checkedId == R.id.rBtnSexoMasc){
                            RadioButton r  = (RadioButton) findViewById(R.id.rBtnSexoMasc);
                            pessoa.sexo_entrevistado = r.getText().toString();
                            r.setText("");
                        }else if (checkedId == R.id.rBtnSexoFem){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnSexoFem);
                            pessoa.sexo_entrevistado = r.getText().toString();
                            r.setText("");
                        }else if(checkedId == R.id.rBtnSexoOutro) {
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnSexoOutro);
                            pessoa.sexo_entrevistado = r.getText().toString();
                            r.setText("");
                        }else{
                            alerta("Marque uma Opção!");
                        }
                    }
                });
                radioGroupPosicaoEntrevistado.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if(checkedId == R.id.rBtnTitular){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnTitular);
                            pessoa.posicao_entrevistado = r.getText().toString();
                            r.setText("");
                        }else if(checkedId == R.id.rBtnConjuge){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnConjuge);
                            pessoa.posicao_entrevistado = r.getText().toString();
                            r.setText("");
                        }else if(checkedId == R.id.rBtnInquilino){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnInquilino);
                            pessoa.posicao_entrevistado = r.getText().toString();
                            r.setText("");
                        }else if(checkedId == R.id.rBtnMorador){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnMorador);
                            pessoa.posicao_entrevistado = r.getText().toString();
                            r.setText("");
                        }else if (checkedId ==R.id.rBtnPosicaoOutro){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnPosicaoOutro);
                            pessoa.posicao_entrevistado = r.getText().toString();
                            r.setText("");
                        }else{
                            alerta("Marque um Opção!");
                        }
                    }
                });
                radioGroupEstadoCivil.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        if (checkedId==R.id.rBtnEstadoCivilCasado){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnEstadoCivilCasado);
                            pessoa.estado_civil = r.getText().toString();
                            r.setText("");
                        }else if (checkedId==R.id.rBtnEstadoCivilDivorciado){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnEstadoCivilDivorciado);
                            pessoa.estado_civil = r.getText().toString();
                            r.setText("");
                        }else if (checkedId==R.id.rBtnEstadoCivilSolteiro){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnEstadoCivilSolteiro);
                            pessoa.estado_civil = r.getText().toString();
                            r.setText("");
                        }else if (checkedId==R.id.rBtnEstadoCivilUniaoEstavel){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnEstadoCivilUniaoEstavel);
                            pessoa.estado_civil = r.getText().toString();
                            r.setText("");
                        }else if (checkedId==R.id.rBtnEstadoCivilViuvo){
                            RadioButton r = (RadioButton) findViewById(R.id.rBtnEstadoCivilViuvo);
                            pessoa.estado_civil = r.getText().toString();
                            r.setText("");
                        }else {
                            alerta("Marque uma Opção!");
                        }
                    }
                });

                radioGroupUtilizacao.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupCondicao.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupUnicoProprietario.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupOutrosImoveis.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupConjugeAjudou.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupSeTrabalha.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupFormalInformal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupServeOutrasFamilias.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupPortadorNecessidadesEspeciais.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupRendaFamiliar.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupTipologia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupEstadoImovel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupTipoImovel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupPosicaoImovel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupAquisicaoImovel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });

                radioGroupProprietarioTerreno.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {

                    }
                });





                pessoaDB.save(pessoa);
                alerta("Entrevistado Cadastrado!");

            }
        });

    }
    private void alerta(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
