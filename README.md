![](https://github.com/ocpjp-study/aprimoramentos-linguagem/blob/main/aprimoramentos-linguagem.jpg)

### Tópico: Aprimoramentos linguagem
### Objetivos
- Usar try-with-resources construct;
- Desenvolver código que lida com vários tipos de exceptions em um único bloco catch;

<hr>

### Resumo
- Funciona somente quando se implementa um public interface `java.io.Closeable` ou `java.lang.AutoCloseable`
- A interface AutoCloseable, obriga a implementação do método close:
  - ```java
    public void close() throws Exception;
    ```
- A JVM é responsável por chamar o método close(), antes de chamar um bloco catch ou finally.
- Havendo mais de 1 recurso no `try-with-resoucers`, então os recursos deverão ser separados por `;`
- O `;` do último recurso, é de uso opcional;
- Os objetos criados dentro de um bloco `try-with-resoucers`, tem como escopo somente o bloco try{}; 
- Podemos utilizar variáveis inicializadas fora de um `try()`, desde que:
  - Seja final ou `efetivamente final`. ('efetivamente' é válido somente para variável local);
  - O metodo close() será chamado em ordem do fim para o começo conforme declarado em um `try-with-resources`
