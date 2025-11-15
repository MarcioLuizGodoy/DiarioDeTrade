# DiarioDeTrade

Aqui seguem informações para instalação de qualquer versão do app que esteja no diretorio distribuição.















&nbsp;                               AQUI FICAM AS INFORMAÇÕES NECESSÁRIAS PARA VOCÊ ESTA DISTRIBUIÇÃO DE TESTE!







O IDEAL É QUE DEIXE A PASTA dist-exe/ NA AREA DE TRABALHO DA MAQUINA VISANDO FACILITAR A EXECUÇÃO DOS PASSOS A SEGUIR!

O IDEAL É QUE NAO SE TIRE O DiarioDeTrade.exe DE DENTRO DE  dist-exe/ BEM COMO NÃO É BOA IDEIA TIRAR copiaDaJre/  DE ONDE ESTA!

O EXECUTAVEL E A COPIA DA JRE TRABALHAM JUNTOS!

CASO OPTE POR ESSE MODO DE INSTALAR NA SUA MAQUINA E NAO ENCONTRE A COPIA DA JRE DENTRO DA PASTAS DIST, INSTALE NA SUA MAQUINA CRIE A PASTA copiaDaJre/ e faça uma copia da jre para dentro dela.  Talvez na sua maquina o caminho pra chegar na jre seja algo assim: "C:\\Program Files\\Java\\jdk-24"

LINK:   https://download.oracle.com/java/24/archive/jdk-24.0.1\_windows-x64\_bin.msi

&nbsp;                                                   



PASSOS DO PRIMEIRO JEITO DE EXECUTAR O PROGRAMA:



1 - FAZER DOWNLOAD DO MySql v8.4.7 Clicando no link:  https://dev.mysql.com/downloads/file/?id=545364 e instale na sua maquina optando pela instalação completa.

&nbsp;   1.1 - CRIAR A CONEXÃO  PADRÃO NO ATO DA INSTALAÇAO. 

&nbsp;       1.2 - O LOGIN: root E A SENHA: developer123@

&nbsp;           1.3 - ATENÇÃO:  Passo 1.2 é inegociável!

2 - EXECUTAR O SCRIPT dbCode.sql no terminal do MySql ( MySQL 8.4 Command Line Cli ). 

&nbsp;   ATENÇÃO, ELE VAI PEPDIR UMA SENHA PARA VOCÊ LOGAR NO MYSQL COMMAND LINE E EXECUTAR O SCRIPT, É AQUI QUE ENTRA O PASSO ANTERIOR.

&nbsp;       A SENHA DEVE SER: developer123@ // O USUARIO DEVE SER: root

&nbsp;	2.1 -   EXEMPLO PASSANDO O CAMINHO DO ARQUIVO dbCode.sql  que esta na minha maquina tendo como base a Area de Trabalho:  

&nbsp;           

&nbsp;		COMANDO A SER EXECUTADO NO MYSQL COMMAND LINE  --      SOURCE C:/Users/Godoy/Desktop/DiarioDeTradee/dist-exe/dbCode.sql;

OBS: ANTES DE VC EXECUTAR O SCRIPT, VC PODE ABRI-LO E MUDAR SEU LOGIN E SENHA DO SOFTWARE. 

&nbsp;               MAS PARA SER MAIS RAPIDO SUGIRO QUE DEIXE COM ESSE LOGIN E SENHA PADRÃO



&nbsp;           2.2 - RESULTADO ESPERADO:

&nbsp;                           Query OK, 1 row affected (0.01 sec)



&nbsp;                           Database changed

&nbsp;                           Query OK, 0 rows affected (0.02 sec)



&nbsp;                           Query OK, 0 rows affected (0.02 sec)



&nbsp;                           Query OK, 1 row affected (0.00 sec)



&nbsp;                           Query OK, 0 rows affected (0.00 sec)



&nbsp;                          mysql>



3 - SEGUIDO OS PASSOS ANTERIORES, VOCÊ PODE ABRIR O PROGRAMA EXECUTAVEL TENTAR ENTRAR USANDO AS CREDENCIAIS FORNECIDAS.

&nbsp;      3.1 - CREDENCIAIS TELA LOGIN DIARIO DE TRADE : 

&nbsp;		Login: user  e Senha: user





4 - IMAGENS DE EXEMPLO ESTAO NA RAIZ DA PASTA dist-exe/



NOME IMAGEM 1 -  abrir my sql command line e por senha de root.png

NOME IMAGEM 2 - PROCESSO COMPLETO DE LOGIN DE CONEXAO E CRIACAO DO BANCO.png

ISSO AQUI INDICA QUE VC ESTA NO MYSQL COMMANDLINE, E PODE APARECER NO INICIO DE COMANDOS OU APÓS UM OUTPUT DE COMANDO EXECUTADO:        mysql> PASSOS DO SEGUNDO JEITO DE EXECUTAR O PROGRAMA:             





INSTALANDO A JDK 24 - download.oracle.com/java/24/archive/jdk-24.0.1\_windows-x64\_bin.msi

E SEGUIR OS PASSOS DO SCRIPT MYSQL ANTERIOR.



SE OPTAR POR ESSE SEGUNDO PASSO, PODES TIRAR O EXE DE dist-exe/ PORQUE O SOFTWARE VAI PROCURAR A JRE INSTALADA NA MAQUINA POR PADRÃO!

