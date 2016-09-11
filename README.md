# db-git-handson
Hello World para o Hands On Git no DBDay

### Introdução
Mini-projeto em Java. O objetivo dele é termos código executando para manipular durante o hands on.

O projeto utiliza [https://gradle.org/](Gradle) para build / execução.

### Features
* Hello World: Dividido em duas classes diferentes :)
* Imprimir arquivos: O projeto imprime todos os arquivos da pasta src/main/resources/ (e subdiretórios). 
  A ideia dessa feature é termos algo executável onde todos podem inserir arquivos sem gerar conflitos
  
  
### Executando
```gradle run```

Executa a aplicação. Imprime a saída no standard output.

### Importanto o projeto no Eclilpse
```gradle eclipse```

Gera os arquivso de um projeto Eclipse na raiz do projeto. A partir daí, ele pode ser importanto utilizando o Wizard 'Import Existing Projects' do Eclipse

### .gitignore ###
**(Para os que não conhecem :)**

Contém todas as pastas e tipos de arquivo que serão ignorados pelo Git e, portanto, não versionados. 
Inclui arquivos gerados durante o build e arquivos do Eclipse
