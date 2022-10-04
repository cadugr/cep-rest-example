# Cep Rest Example Application

Aplicação de exemplo sobre como consultar dados a uma api.

Documentação [Spring Boot](http://projects.spring.io/spring-boot/) 

## Requerimentos:

Para construir e executar o aplicativo, você precisa:

- [JDK 11](https://openjdk.java.net/projects/jdk/11/)
- [Maven 3](https://maven.apache.org)

## Executando a aplicação localmente

Existem várias maneiras de executar um aplicativo Spring Boot em sua máquina local. Uma maneira é executar o método principal na classe com.example.cep.CepRestExampleApplication da sua IDE.

Como alternativa, você pode usar o plugin Spring Boot Maven da seguinte maneira:

```shell
mvn spring-boot:run
```
## Testando:

Via client, como o postman, acessar o endpoint /restaurantes:

#### POST http://localhost:8080/restaurantes

Informar um payload no formato json na requisição, algo como:

{
        "nome": "Thai Gourmet",
        "taxaFrete": 10,
        "endereco": {
        	"cep": "{informe aqui um cep válido}"
        }
}

No fim, checar se os dados foram persistidos corretamente na tabela restaurante.
