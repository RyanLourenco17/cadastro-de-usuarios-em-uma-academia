// Para o Henri
/* Esta classe é responsável por salvar e recuperar os dados dos usuários em algum lugar que só Deus Sabe. 
Ela usa objetos da classe Usuario para representar os dados e realiza operações de entrada e saída 
para armazenar e recuperar esses dados do arquivo. Importante que tenha dois métodos, salvarUsuarios() e recuperarUsuarios()
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class ManipuladorDados {

    public void salvarUsuario(String Usuario){
        try {
            FileWriter arquivoEscrito = new FileWriter("dados.txt");
            for (int lin = 0; lin < h; lin++) {
                for (int col = 0; col < 5; col++) {
                    arquivoEscrito.write(data[lin][col] + " , ");
                }
            }
            arquivoEscrito.close();}
        catch (Exception e) {
            System.out.println("Erro de gravação");
        }
    }

    public void recuperarUsuario(){ // data e h estao na main, mas nao sei como fazer pra ser reconhecido aqui
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu indice/ nome");
        String nome = scanner.nextLine();
        for(int lin=0; lin<h; lin++){
            if(nome.equals(data[lin][1])){
                for(int col=0; col<4; col++){
                    System.out.println(data[lin][col]);}}}

    }
}
}

    /*public void salvarUsuario(String Usuario) {// pegar os atributos e colocar no arquivo
        try {
            FileWriter arquivoEscrita = new FileWriter("dados.txt");
            BufferedWriter escritor = new BufferedWriter(arquivoEscrita);

            escritor.write(Usuario.toString());
            escritor.newLine();
            escritor.close();
            System.out.println("String armazenada com sucesso no arquivo arquivo.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
       
    public void recuperarUsuario(){
            Path diretorio = Path.of("dados.txt");
            //Path diretorio = Path.of("C:\\Users\\Mattheus\\OneDrive\\Documentos\\estudos-java\\Projeto_Facul\\dados.txt");
            try {
                ArrayList<String> linhas = new ArrayList<>(Files.readAllLines(diretorio));
                for (String linha : linhas) {
                    System.out.println(linha);
                }
            } catch (Exception e) {
                System.out.println("Erro ao ler arquivo");
                e.printStackTrace();
            }
        }
}*/
