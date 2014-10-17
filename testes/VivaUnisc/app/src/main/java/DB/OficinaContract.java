package DB;

import android.provider.BaseColumns;


/**
 * Created by Shadow on 15/10/2014.
 */
public final class OficinaContract {

    public OficinaContract(){}

    //Classe interna que define uma tabela e seu conteudo
    public static abstract class Oficina implements BaseColumns{
        public final static String TABLE_NAME = "Oficina";
        public final static String ID_OFICINA = "id_oficina";
        public final static String CURSO = "curso";
        public final static String TITULO = "titulo";
        public final static String IMAGEM = "imagem";
        public final static String DATA_HORA = "data_hora";
        public final static String DURACAO = "duracao";
        public final static String DESCRICAO = "descricao";
        public final static String RESPONSAVEL = "responsavel";
        public final static String LOCAL = "local";
        public final static String VAGAS = "vagas";
        public final static String INSCRITOS = "inscritos";

    }

}