![](https://github.com/ocpjp-study/aprimoramentos-linguagem/blob/main/ocpjp.png)

[Preparação para o Exame 1Z0-817](https://education.oracle.com/pt_BR/upgrade-ocp-java-6-7-8-to-java-se-11-developer/pexam_1Z0-817)

### Tópico: Aprimoramentos linguagem
### Objetivos
- Usar try-with-resources construct;
- Desenvolver código que lida com vários tipos de exceptions em um único bloco catch;

<hr>

### Resumo
- Funciona somente quando se implementa um `java.lang.AutoCloseable`
- A interface AutoCloseable, obriga a implementação do método close:
  - ```java
    public void close() throws Exception;
    ```
- A JVM é responsável por chamar o método close(), antes de chamar um bloco catch ou finally.
- Havendo mais de 1 recurso no `try-with-resoucers`, então os recursos deverão ser separados por `;`
- O `;` do último recurso, é de uso opcional;
