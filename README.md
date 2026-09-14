# Empregados OO

Desafio de programação orientada a objetos em Java: um programa de console que lê os dados de um departamento (nome, dia de pagamento, endereço de contato) e de seus funcionários, e exibe um relatório de folha de pagamento.

Exercício do capítulo "Enumerações e composição" da Formação Desenvolvedor Moderno (DevSuperior).

## Modelo de domínio

```
Department                          Employee
- name : String                     - name : String
- payDay : int                      - salary : double
- address : Address (1)
- employees : List<Employee> (*)
+ addEmployee(employee) : void
+ removeEmployee(employee) : void   Address
+ payroll() : double                - email : String
                                    - phone : String
```

- `Department` tem **um** `Address` (composição) e **muitos** `Employee` (associação).
- `payroll()` retorna a soma dos salários de todos os funcionários do departamento.

## Tecnologias

- Java 17
- Sem dependências externas (apenas `java.util`)

## Como executar

```bash
git clone https://github.com/iagoclima22/empregados-oo.git
cd empregados-oo/src
javac -d ../out application/Program.java entities/*.java
java -cp ../out application.Program
```

Ou abra o projeto na sua IDE e execute a classe `application.Program`.

## Exemplo de execução

```
Nome do departamento: Vendas
Dia do pagamento: 10
Email: vendas@lojatop.com
Telefone: 99883355
Quantos funcionários tem o departamento? 2
Dados do funcionário 1:
Nome: João Silva
Salário: 8000.00
Dados do funcionário 2:
Nome: Maria Torres
Salário: 10000.00

FOLHA DE PAGAMENTO:
Departamento Vendas = R$ 18000.00
Pagamento realizado no dia 10
Funcionários:
João Silva
Maria Torres
Para dúvidas favor entrar em contato: vendas@lojatop.com
```

## Estrutura do projeto

```
src/
├── application/
│   └── Program.java      // entrada de dados e método showReport
└── entities/
    ├── Address.java
    ├── Department.java
    └── Employee.java
```

## Conceitos praticados

- Composição e associação entre classes
- Encapsulamento com getters e setters
- Coleções (`List` / `ArrayList`)
- Formatação de saída com `Locale` e `printf`

## Autor

Iago Lima — [GitHub](https://github.com/iagoclima22) · [LinkedIn](https://www.linkedin.com/in/iago-lima-57124b247/)
