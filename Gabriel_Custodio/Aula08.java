public class Aula08 {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos em frente!");
        System.out.println("Adicionar GitHub");
        System.out.println("Adicionar newVersion");
        System.out.println("Adicionar novaMudanca");
       
    }
}

//importante saber... o git não sobe pastas vazias
//O terminal da pasta a ser salva deve estar selecionado no cd -> cd "F:\HTML SITES\0 CURSO SENAI\Aula08\Aula08"

//+++++++++++++++INTERLIGANDO O GIT INSTALADO NA MÁQUINA À CONTA DO GIT HUB+++++++++++++++
// git config --global user.name "USUÁRIO_DO_GIT"
// git config --global user.email "EMAIL_CADASTRADO" 

//+++++++++++++++NOVO PROJETO+++++++++++++++
//git init -> inicia o projeto git
//git add . -> adiciona todos os arqivos para serem armazenados no registro (é possível selecionar, exemplo: git add arquivo1.txt arquivo2.js ou git add caminho/do/diretorio/ ou até mesmo: arquivo1.txt arquivo2.js)
//git commit -m "projeto criado" -> é um registro de uma alteração realizada, no caso, a criação do projeto, SALVA A ALTERAÇÃO NO RESPOSITÓRIO LOCAL
//git branch -m "nome_do_branch"  -> Renomeia o branch master (padrão). Um branch é uma ramificação(filial) independente de desenvolvimento que permite que você trabalhe em diferentes versões do seu projeto simultaneamente.
//git remote add origin https://github.com/GCMD3V/Aula08.git -> link da pasta do respositório criado no git hub
//git push -u nome_do_branch -> O comando "git push -u nome_do_branch" é usado para enviar (push) o branch local para um repositório remoto e configurar uma relação de acompanhamento (tracking) entre o branch local e o branch remoto. A opção "-u" ou "--set-upstream" é utilizada para configurar a relação de acompanhamento entre as filiais local e remota. Ao utilizar essa opção, você estará estabelecendo uma associação entre o ramal local e o ramal remoto correspondente, permitindo que você utilize o comando "git push" posteriormente sem a necessidade de especificar o ramal remoto e local hoje. É o mesmo que git push --set-upstream origin nome_do_novo_branch.


//+++++++++++++++UPDATE/ALTERAÇÃO/ATUALIZAÇÃO+++++++++++++++
// Antes de enviar alteração podemos também fazer uma cópia/clone da versão anterior (git clone link_do_git) -> QUANDO PEGAMOS UM PROJETO DO GIT HUB, que não iniciamos em nossa máquina, fazemos um CLONE 

// git add .
// git commit -m "nome da atualização" -> o uso do comando -m é apenas para criar um nome do registro. Sem o -m é aberta uma janela para inserir o texto.
// git push origin nome_do_branch -> envia o commit ao branch situado no REPOSITÓRIO REMOTO 


//+++++++++++++++UPLOAD OU PULL/BAIXA AS ATUALIZAÇÕES CONTIDAS NO RESPOSITÓRIO REMOTO AO LOCAL+++++++++++++++
// git branch --set-upstream-to=origin/newVersion -> sincroniza com a branch a ser monitorada ou rastrada // pode simplesmente ser usado git branch -u nome_da_branch_rastreada
// git pull 
// git pull origin nome_da_branch -> para fazer um pull em branch não sincronizada





//+++++++++++++++COMANDOS ÚTEIS+++++++++++++++
// git branch "nome_do_branch" -> cria uma nova ramificação sem excluir ou renomear as anteriores
// git add src/Aula08.java  -> seleciona arquivos para salvar no repositório LOCAL a BRANCH atual
// git commit -m "Salvar alterações antes de alternar para a branch 'alteracao'" -> salva o os arquivos adicinados ao respositório LOCAL
// .gitignore -> é possível usar um arquivo .gitignorepara especificar quais arquivos e diretórios o Git deve ignorar ao fazer commits. O objetivo do arquivo .gitignoreé informar ao Git quais arquivos ou padrões de arquivos devem ser excluídos do controle de versão.
// é possível usar gitignore direto ao criar um repositório no site do github, na opção de gitignore


// git checkout nome_do_branch -> seleciona a branch, ou seja, permite navegar entre as branch's (ramificações)

// git remote add origin https://github.com/seuusuario/seurepositorio.git
// git push -u origin main

// Caso use o código abaixo não é necessário citar o nome_do_branch quando atualiza uma nova versão
// git push (caso tenha executado o comando -> git push --set-upstream origin newVersion)

// Renomear um branch que não seja o main
// git branch -m "nome_do_branch_antigo" "nome_do_branch_novo"

// como mostrar todos os branch's
// git branch -> lista todas as ramificações/branchs existentes no respositório
// git status -> O comando git statusé usado para exibir o estado atual do seu repositório Git. Ele fornece informações sobre os arquivos modificados, adicionados ou excluídos no seu diretório de trabalho, bem como informações sobre a filial atual e o estado do repositório em relação à filial remota.


// como remover os branch's
// git branch -d nome_do_branch
// git branch -d newVersion

// ++git branch -m nome_do_branch_antigo nome_do_branch_novo: Renomeia o branch antigo para o novo nome especificado. Se o branch novo já existir, o Git realizará a renomeação, substituindo o
//  branch existente pelo novo nome. Caso contrário, o ramal atual será renomeado para o novo nome. 

// ++git branch -M nome_do_branch_antigo nome_do_branch_novo: Renomeia o branch antigo para o novo nome especificado, independentemente do branch novo já existir ou não. Se o ramal novo
// já existir, ele será substituído pelo ramal antigo renomeado para o novo nome. Se o ramal novo não  existir, o ramal atual será renomeado para o novo nome.


//ENTENDENDO UM POUCO MAIS SOBRE BRANCH
/* Se você criar uma nova filial usando o comando git branch nome_do_branche não fizer o checkout para essa nova filial, as alterações feitas serão registradas na filial atual em que você estava no momento.

Crie um novo branch com o comando git branch nome_do_branchapenas cria um novo ponteiro de branch, mas não atualize o HEAD para apontar para esse novo branch. Isso significa que os commits serão feitos no branch atual, mesmo que você tenha criado um novo branch.*/


//ENTENDENDO UM POUCO MAIS SOBRE O GITHUB
/* 
Quando você realiza um commit, o Git cria um registro permanente das alterações realizadas nos arquivos do seu repositório. Esses registros são armazenados em um banco de dados interno do Git, juntamente com metadados, como informações do autor, data e hora do commit, e uma referência ao commit anterior.

Essas informações são armazenadas no diretório ".git" do seu projeto, que contém todo o histórico do repositório Git, incluindo todos os commits realizados. Portanto, mesmo após desligar e ligar a máquina, as informações sobre os commits permanecerão no repositório local do Git e poderão ser acessadas quando você iniciar o trabalho no projeto.

No entanto, é importante ressaltar que os commits não são sincronizados automaticamente com um repositório remoto. Se você deseja compartilhar seus commits com outras pessoas ou sincronizá-los com um servidor remoto, você precisará usar o comando "git push" para enviar os commits para o repositório remoto correspondente. */

/* Em resumo, você não precisa criar um clone do repositório se já iniciou um repositório Git local usando git init. Você só precisa adicionar um repositório remoto com git remote add origine 
fazer o push dos commits para o repositório remoto com git push.

No entanto, se você deseja clonar um repositório existente do GitHub para o seu computador, você pode usar o comando git clone <URL_do_repositório>, o que criará uma cópia completa do 
repositório remoto no seu computador. */



//comando útil para abrir o terminal control+shift+'


//É POSSÍVEL ADICIONAR UM RESPOSITÓRIO SEM FAZER CLONE, USANDO OS SEGUINTES COMANDOS
// git init
// git commit -m nome_do_projeto
// git branch -u nome_da_branch_a_ser_rastreada
// git pull
// git add .
// git commit -m nome_da_versao
// git push

// Lembre-se de que, ao fazer isso, você não está copiando todo o histórico do repositório remoto, mas apenas o estado atual da filial especificada. Se você precisar de todo o histórico do repositório remoto, é recomendável fazer um clone completo usando git clone