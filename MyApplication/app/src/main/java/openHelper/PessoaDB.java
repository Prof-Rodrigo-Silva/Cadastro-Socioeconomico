package openHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import controle.Login;
import controle.Pessoa;

public class PessoaDB extends SQLiteOpenHelper{
    private static String TAG = "banco_pessoa.db";
    private static final String NOME_BD = "pessoa.db";
    private static final int VERSAO = 1;
    private static  PessoaDB pessoaDB = null;

    public PessoaDB(Context context) {
        super(context, NOME_BD, null, VERSAO);
    }

    public static PessoaDB getInstance(Context context){
        if(pessoaDB == null){
            pessoaDB = new PessoaDB(context);
            return pessoaDB;
        } else {return pessoaDB;}
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS pessoa"+"(_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " telefone_entrevistado LONG, RG_titular LONG, CPF_titular LONG, RG_conjuge LONG, CPF_conjuge LONG, numero_de_moradores INTEGER, numero_de_proprietarios INTEGER, numero_de_imoveis INTEGER, numero_filhos INTEGER, numero_pavimentos INTEGER, numero_comodos INTEGER, numero_banheiros INTEGER, nome_entrevistado TEXT, endereco_entrevistado TEXT, sexo_entrevistado TEXT, condicao_ocupacao TEXT, posicao_entrevistado TEXT, utilizacao TEXT, unico_proprietario TEXT, outro_imovel TEXT, endereco_outros_imoveis TEXT, nome_titular TEXT, endereco_imovel TEXT, endereco_titular TEXT, profissao_titular TEXT, estado_civil TEXT, naturalidade_entrevistado TEXT, tempo_com_conjuge TEXT, conjuge_ajudou_construcao TEXT, data_nascimento_entrevistado TEXT, nome_conjuge TEXT, profissao_conjuge TEXT, naturalidade_conjuge TEXT, data_nascimento_conjuge TEXT, se_trabalha TEXT, formal_informal TEXT, principal_fonte_renda TEXT, renda_familiar TEXT, uso_imovel TEXT, tipologia TEXT, posicao_lote TEXT, estado_edificacao TEXT, tipo_construcao TEXT, serve_outras_familias TEXT, aquisicao_terreno TEXT, dono_terreno TEXT, portator_necessidades_especiais TEXT, beneficio_governo TEXT, beneficio_prog_hab TEXT);";
        Log.d(TAG,"Criando a tabela, aguarde ...");
        db.execSQL(sql);
        Log.d(TAG, "Tabela criada");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        Log.d("Teste","Upgrade da Versão "+i+" para "+i1+", destruindo tudo.");
        db.execSQL("DROP TABLE IF EXISTS pessoa");
        onCreate(db);
        Log.i("Teste","Executou o script de upgrade.");
    }
    //Insere um novo login ou já atualiza
    public static long save(Pessoa pessoa) {
        SQLiteDatabase db = getWritableDatabase();
        try {
            ContentValues values = new ContentValues();
            values.put("telefone_entrevistado", pessoa.telefone_entrevistado);
            values.put("RG_titular", pessoa.RG_titular);
            values.put("CPF_titular", pessoa.CPF_titular);
            values.put("RG_conjuge", pessoa.RG_conjuge);
            values.put("CPF_conjuge", pessoa.CPF_conjuge);
            values.put("numero_de_moradores", pessoa.numero_de_moradores);
            values.put("numero_de_proprietarios", pessoa.numero_de_proprietarios);
            values.put("numero_de_imoveis", pessoa.numero_de_imoveis);
            values.put("numero_filhos", pessoa.numero_filhos);
            values.put("numero_pavimentos", pessoa.numero_pavimentos);
            values.put("numero_comodos", pessoa.numero_comodos);
            values.put("numero_banheiros", pessoa.numero_banheiros);
            values.put("nome_entrevistado", pessoa.nome_entrevistado);
            values.put("endereco_entrevistado", pessoa.endereco_entrevistado);
            values.put("sexo_entrevistado", pessoa.sexo_entrevistado);
            values.put("condicao_ocupacao", pessoa.condicao_ocupacao);
            values.put("posicao_entrevistado", pessoa.posicao_entrevistado);
            values.put("utilizacao", pessoa.utilizacao);
            values.put("unico_proprietario", pessoa.unico_proprietario);
            values.put("outro_imovel", pessoa.outro_imovel);
            values.put("endereco_outros_imoveis", pessoa.endereco_outros_imoveis);
            values.put("nome_titular", pessoa.nome_titular);
            values.put("endereco_imovel", pessoa.endereco_imovel);
            values.put("endereco_titular", pessoa.endereco_titular);
            values.put("profissao_tituLar", pessoa.profissao_titular);
            values.put("estado_civil", pessoa.estado_civil);
            values.put("naturalidade_entrevistado", pessoa.naturalidade_entrevistado);
            values.put("tempo_com_conjuge", pessoa.tempo_com_conjuge);
            values.put("conjuge_ajudou_construcao", pessoa.conjuge_ajudou_construcao);
            values.put("data_nascimento_entrevistado", pessoa.data_nascimento_entrevistado);
            values.put("nome_conjuge", pessoa.nome_conjuge);
            values.put("profissao_conjuge", pessoa.profissao_conjuge);
            values.put("naturalidade_conjuge", pessoa.naturalidade_conjuge);
            values.put("data_nascimento_conjuge", pessoa.data_nascimento_conjuge);
            values.put("se_trabalha", pessoa.se_trabalha);
            values.put("formal_informal", pessoa.formal_informal);
            values.put("principal_fonte_renda", pessoa.principal_fonte_renda);
            values.put("renda_familiar", pessoa.renda_familiar);
            values.put("uso_imovel", pessoa.uso_imovel);
            values.put("tipologia", pessoa.tipologia);
            values.put("posicao_lote", pessoa.posicao_lote);
            values.put("estado_edificacao", pessoa.estado_edificacao);
            values.put("tipo_construcao", pessoa.tipo_construcao);
            values.put("serve_outras_familias", pessoa.serve_outras_familias);
            values.put("aquisicao_terreno", pessoa.aquisicao_terreno);
            values.put("dono_terreno", pessoa.dono_terreno);
            values.put("portator_necessidades_especiais", pessoa.portator_necessidades_especiais);
            values.put("beneficio_governo", pessoa.beneficio_governo);
            values.put("beneficio_prog_hab", pessoa.beneficio_prog_hab);

            if (pessoa._id == null) {//Se id for nulo add...
                return db.insert("pessoa", null, values);
            } else {
                values.put("_id", pessoa._id);//...senão atualiza
                return db.update("pessoa", values, "_id=" + pessoa._id, null);
            }
        } finally {
            db.close();
        }
    }
    public long delete(Pessoa pessoa) {
        SQLiteDatabase db = getWritableDatabase();
        try {
            return db.delete("pessoa", "_id=?", new String[]{String.valueOf(pessoa._id)});
        } finally {db.close();}
    }
    public List<Pessoa> getAll(){
        SQLiteDatabase db = getReadableDatabase();
        try{
            return toList(db.rawQuery("SELECT * FROM pessoa",null));
        }finally {
            db.close();
        }
    }

    private List<Pessoa> toList(Cursor cursor) {
        List<Pessoa> pessoas = new ArrayList<>();
        if (cursor.moveToFirst()){
            do{
                Pessoa pessoa = new Pessoa();
                pessoa._id = cursor.getLong(cursor.getColumnIndex("_id"));
                pessoa.nome_titular = cursor.getString(cursor.getColumnIndex("nome_titular"));
                pessoa.nome_entrevistado = cursor.getString(cursor.getColumnIndex("nome_entrevistado"));
                pessoa.endereco_entrevistado = cursor.getString(cursor.getColumnIndex("endereco_entrevistado"));
                pessoa.sexo_entrevistado = cursor.getString(cursor.getColumnIndex("sexo_entrevistado"));
                pessoa.condicao_ocupacao = cursor.getString(cursor.getColumnIndex("condicao_ocupacao"));
                pessoa.posicao_entrevistado = cursor.getString(cursor.getColumnIndex("posicao_entrevistado"));
                pessoa.utilizacao = cursor.getString(cursor.getColumnIndex("utilizacao"));
                pessoa.unico_proprietario = cursor.getString(cursor.getColumnIndex("unico_proprietario"));
                pessoa.outro_imovel = cursor.getString(cursor.getColumnIndex("outro_imovel"));
                pessoa.endereco_outros_imoveis = cursor.getString(cursor.getColumnIndex("endereco_outros_imoveis"));
                pessoa.endereco_imovel = cursor.getString(cursor.getColumnIndex("endereco_imovel"));
                pessoa.endereco_titular = cursor.getString(cursor.getColumnIndex("endereco_titular"));
                pessoa.profissao_titular = cursor.getString(cursor.getColumnIndex("profissao_titular"));
                pessoa.estado_civil = cursor.getString(cursor.getColumnIndex("estado_civil"));
                pessoa.naturalidade_entrevistado = cursor.getString(cursor.getColumnIndex("naturalidade_entrevistado"));
                pessoa.tempo_com_conjuge = cursor.getString(cursor.getColumnIndex("tempo_com_conjuge"));
                pessoa.conjuge_ajudou_construcao = cursor.getColumnName(cursor.getColumnIndex("conjuge_ajudou_construcao"));
                pessoa.data_nascimento_entrevistado = cursor.getString(cursor.getColumnIndex("data_nascimento_entrevistado"));
                pessoa.nome_conjuge = cursor.getString(cursor.getColumnIndex("nome_conjuge"));
                pessoa.profissao_conjuge = cursor.getString(cursor.getColumnIndex("profissao_conjuge"));
                pessoa.naturalidade_conjuge = cursor.getString(cursor.getColumnIndex("naturalidade_conjuge"));
                pessoa.data_nascimento_conjuge = cursor.getString(cursor.getColumnIndex("data_nascimento_conjuge"));
                pessoa.se_trabalha = cursor.getString(cursor.getColumnIndex("se_trabalha"));
                pessoa.formal_informal = cursor.getString(cursor.getColumnIndex("formal_informal"));
                pessoa.principal_fonte_renda = cursor.getString(cursor.getColumnIndex("principal_fonte_renda"));
                pessoa.renda_familiar = cursor.getString(cursor.getColumnIndex("renda_familiar"));
                pessoa.uso_imovel = cursor.getString(cursor.getColumnIndex("uso_imovel"));
                pessoa.tipologia = cursor.getString(cursor.getColumnIndex("tipologia"));
                pessoa.posicao_lote = cursor.getString(cursor.getColumnIndex("posicao_lote"));
                pessoa.estado_edificacao = cursor.getString(cursor.getColumnIndex("estado_edificacao"));
                pessoa.tipo_construcao = cursor.getString(cursor.getColumnIndex("tipo_construcao"));
                pessoa.serve_outras_familias = cursor.getString(cursor.getColumnIndex("serve_outras_familias"));
                pessoa.aquisicao_terreno = cursor.getString(cursor.getColumnIndex("aquisicao_terreno"));
                pessoa.dono_terreno = cursor.getString(cursor.getColumnIndex("dono_terreno"));
                pessoa.portator_necessidades_especiais = cursor.getString(cursor.getColumnIndex("portator_necessidades_especiais"));
                pessoa.beneficio_governo = cursor.getString(cursor.getColumnIndex("beneficio_governo"));
                pessoa.beneficio_prog_hab = cursor.getString(cursor.getColumnIndex("beneficio_prog_hab"));
                pessoa.telefone_entrevistado = cursor.getLong(cursor.getColumnIndex("telefone_entrevistado"));
                pessoa.RG_titular = cursor.getLong(cursor.getColumnIndex("RG_titular"));
                pessoa.CPF_titular = cursor.getLong(cursor.getColumnIndex("CPF_titular"));
                pessoa.RG_conjuge = cursor.getLong(cursor.getColumnIndex("RG_conjuge"));
                pessoa.CPF_conjuge = cursor.getLong(cursor.getColumnIndex("CPF_conjuge"));
                pessoa.numero_de_moradores = cursor.getInt(cursor.getColumnIndex("numero_de_moradores"));
                pessoa.numero_de_proprietarios = cursor.getInt(cursor.getColumnIndex("numero_de_proprietarios"));
                pessoa.numero_de_imoveis = cursor.getInt(cursor.getColumnIndex("numero_de_imoveis"));
                pessoa.numero_filhos = cursor.getInt(cursor.getColumnIndex("numero_filhos"));
                pessoa.numero_pavimentos = cursor.getInt(cursor.getColumnIndex("numero_pavimentos"));
                pessoa.numero_comodos = cursor.getInt(cursor.getColumnIndex("numero_comodos"));
                pessoa.numero_banheiros = cursor.getInt(cursor.getColumnIndex("numero_banheiros"));

                pessoas.add(pessoa);
            }while (cursor.moveToNext());
        }
        return pessoas;
    }
}
