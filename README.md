# Sistema de Gestão de Biblioteca

Este projeto é um **Sistema de Gestão de Biblioteca** desenvolvido em **Java**, que visa demonstrar a aplicação de conceitos fundamentais de **Programação Orientada a Objetos (POO)**. Nele, utilizamos conceitos como **Herança**, **Polimorfismo**, **Encapsulamento** e **Abstração** de forma prática e clara.



## 🎯 Objetivos

O objetivo deste sistema é:
1. **Gerenciar livros**, usuários e funcionários.
2. **Registrar empréstimos** e controlar sua devolução.
3. **Demonstrar a aplicação dos conceitos de POO** de forma clara e aplicada em um cenário real.



## 🛠️ Estrutura das Classes e Conceitos de POO Aplicados

### **1. Herança**
**Herança** é aplicada no projeto para que a classe `Funcionario` herde atributos e métodos da classe `Usuario`, adicionando comportamentos específicos para funcionários.

**Trecho do código:**
```java
public class Funcionario extends Usuario {

    public Funcionario(String nome, int id) {
        super(nome, id);  // Reutiliza o construtor da classe pai (Usuario)
    }

    public void adicionarLivro(Livro livro) {
        System.out.println("Livro '" + livro.getTitulo() + "' adicionado por " + getNome());
    }
}
```

Aqui, a classe `Funcionario` herda atributos e métodos de `Usuario`, utilizando o construtor da classe base (`super(nome, id)`).



### **2. Polimorfismo**
O **polimorfismo** é demonstrado no método `acessarSistema()`. O mesmo método é implementado tanto na classe `Usuario` quanto na classe `Funcionario`, mas o comportamento muda dependendo de quem o invoca.

**Trecho do código:**
```java
public class Usuario {
    public void acessarSistema() {
        System.out.println(nome + " acessou o sistema como Usuário.");
    }
}

public class Funcionario extends Usuario {
    @Override
    public void acessarSistema() {
        System.out.println(getNome() + " acessou o sistema como Funcionário com permissões adicionais.");
    }
}
```

Neste caso, o método `acessarSistema()` é sobreposto na classe `Funcionario`, demonstrando polimorfismo, pois cada classe define o comportamento do método de forma diferente.



### **3. Encapsulamento**
O **encapsulamento** é aplicado no controle de acesso aos atributos das classes. Os atributos são privados e só podem ser acessados ou modificados por meio de métodos públicos (`getters` e `setters`).

**Trecho do código:**
```java
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
```

Aqui, os atributos são declarados como **privados** e só podem ser acessados ou alterados por meio dos **métodos públicos** `getTitulo()` e `setDisponivel()`.



### **4. Abstração**
A **abstração** é aplicada por meio da interface `Notificavel`. Essa interface define um **contrato** para o envio de notificações, que pode ser implementado de diferentes maneiras (por email ou SMS).

**Trecho do código:**
```java
public interface Notificavel {
    void enviarNotificacao(String mensagem);
}

public class NotificacaoEmail implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}

public class NotificacaoSMS implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
```

A interface `Notificavel` abstrai o comportamento de envio de notificações, que é implementado de formas diferentes pelas classes `NotificacaoEmail` e `NotificacaoSMS`.



### **5. Saída Esperada do Código**

Ao executar o código, a seguinte saída será gerada:

```plaintext
Livro 'Java para Iniciantes' adicionado por Ana
Carlos acessou o sistema como Usuário.
Ana acessou o sistema como Funcionário com permissões adicionais.
Enviando email: Livro devolvido com sucesso!
Enviando SMS: Seu empréstimo foi concluído.
```

Essa saída demonstra que:
1. **O funcionário** tem permissão para adicionar livros.
2. **Usuários e funcionários** acessam o sistema de forma diferenciada, demonstrando polimorfismo.
3. **Notificações** são enviadas por diferentes meios (email e SMS) usando abstração.



## 📂 Estrutura Completa do Projeto

```plaintext
/SistemaBiblioteca
│
├── Livro.java               # Classe Livro
├── Usuario.java             # Classe Usuario
├── Funcionario.java         # Classe Funcionario (herda de Usuario)
├── Emprestimo.java          # Classe Emprestimo
├── Notificavel.java         # Interface para notificações
├── NotificacaoEmail.java    # Implementação de notificação por email
├── NotificacaoSMS.java      # Implementação de notificação por SMS
└── SistemaBiblioteca.java   # Classe principal com o método main()
```

## 📚 Conclusão

Este projeto demonstra a aplicação prática dos principais conceitos de **POO** em Java:
- **Herança**: Reutilização de código entre classes.
- **Polimorfismo**: Comportamento diferenciado com base no tipo de objeto.
- **Encapsulamento**: Controle de acesso aos atributos das classes.
- **Abstração**: Definição de contratos através de interfaces.

Esses conceitos foram aplicados em um contexto real de gerenciamento de uma biblioteca, mostrando como **POO** pode ser útil no desenvolvimento de sistemas complexos e organizados.
