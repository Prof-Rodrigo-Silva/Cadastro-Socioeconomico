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

public class LoginDB extends SQLiteOpenHelper {

    private static String TAG = "banco_login.db";
    private static final String NOME_BD = "login.db";
    private static final int VERSAO = 1;
    private static  LoginDB loginDB = null;

    public LoginDB (Context context){
        super(context, NOME_BD,null,VERSAO);

    }
    public static LoginDB getInstance (Context context){
        if (loginDB == null){
            loginDB = new LoginDB(context);
            return loginDB;
        }else {return loginDB;}
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS login"+"(_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nome TEXT, senha TEXT);";
        Log.d(TAG,"Criando a tabela, aguarde ...");
        db.execSQL(sql);
        Log.d(TAG, "Tabela criada");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        Log.d("Teste","Upgrade da Versão "+i+" para "+i1+", destruindo tudo.");
        db.execSQL("DROP TABLE IF EXISTS login");
        onCreate(db);
        Log.i("Teste","Executou o script de upgrade.");
    }
    //Insere um novo login ou já atualiza
    public long save(Login login) {
        SQLiteDatabase db = getWritableDatabase();
        try {
            ContentValues values = new ContentValues();
            values.put("nome", login.nome);
            values.put("senha", login.senha);

            if (login._id == null) {//Se id for nulo add...
                return db.insert("login", null, values);
            } else {
                values.put("_id", login._id);//...senão atualiza
                return db.update("login", values, "_id=" + login._id, null);
            }
        } finally {
            db.close();
        }
    }
    /*public long delete(Login login) {
        SQLiteDatabase db = getWritableDatabase();
        try {
            return db.delete("login", "_id=?", new String[]{String.valueOf(login._id)});
        } finally {db.close();}
    }
    public List<Login> getAll(){
        SQLiteDatabase db = getReadableDatabase();
        try{
            return toList(db.rawQuery("SELECT * FROM login",null));
        }finally {
            db.close();
        }
    }

    private List<Login> toList(Cursor cursor) {
        List<Login> logins = new ArrayList<>();
        if (cursor.moveToFirst()){
            do{
                Login login = new Login();
                login._id = cursor.getLong(cursor.getColumnIndex("_id"));
                login.nome = cursor.getString(cursor.getColumnIndex("nome"));
                login.senha = cursor.getString(cursor.getColumnIndex("senha"));
                logins.add(login);
            }while (cursor.moveToNext());
        }
        return logins;
    }*/
    public String validarLogin(String nome,String senha){
        SQLiteDatabase db = getWritableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM login WHERE nome=? AND senha=?", new String[]{nome,senha}); //Percorre a lista
        if (c.getCount()>0){//Verifica se há pelo menos um registro
            return "OK";
        }
        return "Erro";

    }
}
